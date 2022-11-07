package br.com.anunciocar.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity
public class Anuncio {

    @PrimaryKey(autoGenerate = true)
    private int id;
    @SerializedName("marca_nome")
    private String marca;
    @SerializedName("nome_modelo")
    private String modelo;
    private String ano;
    @SerializedName("valor_fipe")
    private String valor;

    public Anuncio(String marca, String modelo, String ano, String valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
