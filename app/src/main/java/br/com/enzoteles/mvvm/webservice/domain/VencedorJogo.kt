package br.com.enzoteles.mvvm.webservice.domain

import com.google.gson.annotations.SerializedName

data class VencedorJogo(

	@field:SerializedName("equipe_id")
	val equipeId: Any? = null,

	@field:SerializedName("label")
	val label: String? = null
)