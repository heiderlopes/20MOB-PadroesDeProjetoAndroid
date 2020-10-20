package br.com.heiderlopes.padroesdeproejtoandroid.ui.main

import br.com.heiderlopes.padroesdeproejtoandroid.model.Endereco

interface MainContract {

    interface MainView {

        fun mostrarEndereco(endereco: Endereco?)
        fun mostrarErro(mensagem: String)

    }


    interface MainPresenter {

        fun pesquisar(cep: String)

    }

}