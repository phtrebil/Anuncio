package br.com.anunciocar.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.com.anunciocar.R;
import br.com.anunciocar.dao.AnuncioCarRetrofit;
import br.com.anunciocar.model.Anuncio;
import br.com.anunciocar.ui.adapter.ListaAnuncioAdapter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.internal.EverythingIsNonNull;

public class ListaAnuncioActivity extends AppCompatActivity {

    private ListaAnuncioAdapter adapter;
    private List<Anuncio> anuncio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_anuncio);
        RecyclerView recyclerView = findViewById(R.id.RecyclerView);
        buscaItemNaApi(recyclerView);

    }

    private void buscaItemNaApi(RecyclerView recyclerView) {
        AnuncioCarRetrofit.getInstance().buscaAnuncio().enqueue(new Callback<List<Anuncio>>() {
            @EverythingIsNonNull
            @Override
            public void onResponse(Call<List<Anuncio>> call, Response<List<Anuncio>> response) {
                implementaRecyclerView(response, recyclerView);
            }
            @EverythingIsNonNull
            @Override
            public void onFailure(Call<List<Anuncio>> call, Throwable t) {

            }
        });
    }

    private void implementaRecyclerView(Response<List<Anuncio>> response, RecyclerView recyclerView) {
        anuncio = response.body();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(ListaAnuncioActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new ListaAnuncioAdapter( anuncio));
    }
}