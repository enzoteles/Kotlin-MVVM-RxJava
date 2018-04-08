package br.com.enzoteles.mvvm.webservice.api

import br.com.enzoteles.mvvm.webservice.domain.Response
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by enzoteles on 15/03/18.
 */
interface EquipeApiRest{

    @GET("servico/equipe/{team}/jogos.json")
    fun response(@Path("team") team: String?): Observable<Response>


}