package br.com.heiderlopes.padroesdeproejtoandroid.data.network

import br.com.heiderlopes.padroesdeproejtoandroid.model.Endereco
import retrofit2.Call
import retrofit2.http.GET

interface EnderecoService {

    @GET("/ws/{cep}/json")
    fun pesquisar(cep: String): Call<Endereco>

}