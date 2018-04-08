package br.com.enzoteles.mvvm.webservice.domain

import com.google.gson.annotations.SerializedName

data class Escudo(

	@field:SerializedName("medio")
	val medio: String? = null,

	@field:SerializedName("grande")
	val grande: String? = null,

	@field:SerializedName("pequeno")
	val pequeno: String? = null
)