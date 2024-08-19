package com.example.cadastro

class Formulario(
    var nome : String,
    var telefone : String,
    var email : String,
    var ingressouEmail : Boolean,
    var sexo : String,
    var cidade : String,
    var uf : String
){
    override fun toString(): String {
        return "Nome: '$nome'\n Telefone: '$telefone'\n Email: '$email'\n Ingressou na lista de emails? $ingressouEmail\n Sexo: '$sexo'\n Cidade: '$cidade'\n UF: '$uf'"
    }
}