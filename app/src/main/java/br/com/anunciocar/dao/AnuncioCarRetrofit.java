package br.com.anunciocar.dao;


import br.com.anunciocar.dao.remoto.AnuncioCarService;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AnuncioCarRetrofit {

      private static AnuncioCarService INSTANCE;

      public static AnuncioCarService getInstance() {
            if (INSTANCE == null) {
                  Retrofit retrofit = new Retrofit.Builder()
                          .baseUrl("https://wswork.com.br/")
                          .addConverterFactory(GsonConverterFactory.create())
                          .build();
                  INSTANCE = retrofit.create(AnuncioCarService.class);
            }
            return INSTANCE;
      }
}
