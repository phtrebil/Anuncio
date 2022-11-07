package br.com.anunciocar.dao.remoto;

import java.util.List;

import br.com.anunciocar.model.Anuncio;
import retrofit2.Call;
import retrofit2.http.GET;

public interface AnuncioCarService {
    @GET("cars.json")
    Call<List<Anuncio>> buscaAnuncio();
}
