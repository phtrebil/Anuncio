package br.com.anunciocar.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.com.anunciocar.R;
import br.com.anunciocar.model.Usuario;

public class ListaDeUsuarioAdapter extends RecyclerView.Adapter<ListaDeUsuarioAdapter.ViewHolder> {

    private List<Usuario> usuarios;

    public ListaDeUsuarioAdapter(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewCriada = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_anuncio, parent, false);
        return new ViewHolder(viewCriada);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Usuario usuario = usuarios.get(position);
        holder.vincula(usuario);
    }

    @Override
    public int getItemCount() {
        return usuarios.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private final TextView nome;
        private final TextView email;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nome = itemView.findViewById(R.id.nome_formulario);
            email = itemView.findViewById(R.id.email_formulario);
        }

        public void vincula(Usuario usuario) {
            nome.setText(usuario.getNome());
            email.setText(usuario.getEmail());
        }
    }
}
