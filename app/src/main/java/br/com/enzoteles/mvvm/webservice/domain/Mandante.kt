package br.com.enzoteles.mvvm.webservice.domain

import com.google.gson.annotations.SerializedName

data class Mandante(

	@field:SerializedName("apelido")
	val apelido: String? = null,

	@field:SerializedName("sigla")
	val sigla: String? = null,

	@field:SerializedName("placar_oficial")
	val placarOficial: Int? = null,

	@field:SerializedName("escudo")
	val escudo: Escudo? = null,

	@field:SerializedName("placar_penaltis")
	val placarPenaltis: Any? = null
)