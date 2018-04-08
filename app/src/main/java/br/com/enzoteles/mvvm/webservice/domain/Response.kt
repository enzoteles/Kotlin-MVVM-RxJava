package br.com.enzoteles.mvvm.webservice.domain

import com.google.gson.annotations.SerializedName

data class Response(

	@field:SerializedName("proximos")
	val proximos: List<ProximosItem?>? = null,

	@field:SerializedName("anterior")
	val anterior: Anterior? = null
)