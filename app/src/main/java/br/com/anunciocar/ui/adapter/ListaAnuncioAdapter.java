package br.com.anunciocar.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.com.anunciocar.R;
import br.com.anunciocar.model.Anuncio;

public class ListaAnuncioAdapter extends RecyclerView.Adapter<ListaAnuncioAdapter.AnuncioViewHolder> {

    private List<Anuncio> anuncios;
    private Context context;


    public ListaAnuncioAdapter(List<Anuncio> anuncios, Context context) {
        this.anuncios = anuncios;
        this.context = context;
    }

    public ListaAnuncioAdapter(List<Anuncio> anuncios) {
        this.anuncios = anuncios;
    }

    @NonNull
    @Override
    public AnuncioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewCriada = LayoutInflater.from(context).inflate(R.layout.item_anuncio, parent, false);
        return new AnuncioViewHolder(viewCriada);
    }

    @Override
    public void onBindViewHolder(@NonNull AnuncioViewHolder holder, int position) {
        Anuncio anuncio = anuncios.get(position);
        holder.vincula(anuncio);


    }

    @Override
    public int getItemCount() {
        return anuncios.size();
    }

    public static class AnuncioViewHolder extends RecyclerView.ViewHolder{

        private final TextView marca;
        private final TextView modelo;
        private final TextView ano;
        private final TextView valor;
        private final Button botao;


        public AnuncioViewHolder(@NonNull View itemView) {
            super(itemView);
            botao = itemView.findViewById(R.id.bt_eu_quero);
            marca = itemView.findViewById(R.id.marca);
            modelo = itemView.findViewById(R.id.modelo);
            ano = itemView.findViewById(R.id.ano);
            valor = itemView.findViewById(R.id.valor);
        }

        public void vincula(Anuncio anuncio) {
            marca.setText(anuncio.getMarca());
            modelo.setText(anuncio.getModelo());
            ano.setText(anuncio.getAno());
            valor.setText(anuncio.getValor());
            botao.setText("Eu Quero Muito");
        }



    }
}
