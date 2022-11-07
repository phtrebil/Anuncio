package br.com.anunciocar.ui.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

import br.com.anunciocar.R;
import br.com.anunciocar.model.Usuario;
import br.com.anunciocar.ui.adapter.ListaDeUsuarioAdapter;

public class ListaDeUsuarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_usuario);

        RecyclerView recyclerView = findViewById(R.id.RecyclerView_usuario);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new ListaDeUsuarioAdapter(criaUsuario()));
    }

    private List<Usuario> criaUsuario() {
        return Arrays.asList(
                new Usuario("Pedro", "(11)959636905", "phptrebil@gmail.com"),
                new Usuario("Pedro", "(11)959636905", "phptrebil@gmail.com"),
                new Usuario("Pedro", "(11)959636905", "phptrebil@gmail.com"),
                new Usuario("Pedro", "(11)959636905", "phptrebil@gmail.com")

        );

    }
}