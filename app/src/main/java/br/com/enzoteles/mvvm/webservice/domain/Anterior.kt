package br.com.enzoteles.mvvm.webservice.domain

import com.google.gson.annotations.SerializedName

data class Anterior(

	@field:SerializedName("vencedor_jogo")
	val vencedorJogo: VencedorJogo? = null,

	@field:SerializedName("rodada")
	val rodada: Any? = null,

	@field:SerializedName("hora")
	val hora: String? = null,

	@field:SerializedName("nome_fase")
	val nomeFase: String? = null,

	@field:SerializedName("confronto")
	val confronto: String? = null,

	@field:SerializedName("mandante")
	val mandante: Mandante? = null,

	@field:SerializedName("estadio")
	val estadio: String? = null,

	@field:SerializedName("jogo_id")
	val jogoId: Int? = null,

	@field:SerializedName("nome_campeonato")
	val nomeCampeonato: String? = null,

	@field:SerializedName("data_formatada")
	val dataFormatada: String? = null,

	@field:SerializedName("visitante")
	val visitante: Visitante? = null,

	@field:SerializedName("tempo_real")
	val tempoReal: String? = null,

	@field:SerializedName("datajogo")
	val datajogo: String? = null,

	@field:SerializedName("horajogo")
	val horajogo: String? = null,

	@field:SerializedName("dia")
	val dia: String? = null
)