package br.com.enzoteles.mvvm.repository

import android.arch.lifecycle.MutableLiveData
import android.view.View
import br.com.enzoteles.mvvm.R
import br.com.enzoteles.mvvm.webservice.api.EquipeApi
import br.com.enzoteles.mvvm.webservice.domain.ProximosItem
import br.com.enzoteles.mvvm.webservice.domain.Response
import br.com.enzoteles.mvvm.webservice.domain.Team
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by enzoteles on 21/03/18.
 */
class MyRepository{


    /**
     * Método que faz uma chamada via retrofit para buscar a lista de ProximosItem da Api
     * @return data
     * */
    fun getProximosItemApi(team: String): MutableLiveData<List<ProximosItem>>? {

        var data: MutableLiveData<List<ProximosItem>>?=  MutableLiveData<List<ProximosItem>>()
        val api = EquipeApi(team)
        api.loadApi()
                ?.subscribeOn(Schedulers.io())
                ?.observeOn(AndroidSchedulers.mainThread())
                ?.subscribe ({ response ->
                        data?.value = response.proximos as List<ProximosItem>?
                }, { e ->
                    e.printStackTrace()
                })

        return data
    }

    /**
     * Método que faz uma chamada via retrofit para buscar o response da Api
     * @return data
     * */
    fun getResponseApi(team: String): MutableLiveData<Response>? {

        var data: MutableLiveData<Response>?=  MutableLiveData<Response>()
        val api = EquipeApi(team)
        api.loadApi()
                ?.subscribeOn(Schedulers.io())
                ?.observeOn(AndroidSchedulers.mainThread())
                ?.subscribe ({ response ->
                    data?.value = response as Response?
                }, { e ->
                    e.printStackTrace()
                })

        return data
    }

    /**
     * Método pega os times da primeira divisão do campeonato brasileiro
     * @param view
     * @return listTeam
     * */
    fun getPopulateTeam(view: View): MutableList<Team>? {

        var listTeam:MutableList<Team> = arrayListOf()

        val palmeira = R.drawable.palmeiras_60
        var team = Team("palmeiras",palmeira)
        val santos = R.drawable.santos_60
        var team1 = Team("santos",santos)
        val corinthias = R.drawable.corinthians_60
        var team2 = Team("corinthians",corinthias)
        val saopaulo = R.drawable.sao_paulo_60
        var team3 = Team("sao-paulo",saopaulo)

        val botafogo = R.drawable.botafogo_60
        var team4 = Team("botafogo",botafogo)
        val flamengo = R.drawable.flamengo_60
        var team5 = Team("flamengo",flamengo)
        val vasco = R.drawable.vasco_60
        var team6 = Team("vasco",vasco)
        val fluminense = R.drawable.fluminense_60
        var team7 = Team("fluminense",fluminense)

        val atleticoMG = R.drawable.atletico_mg_60
        var team8 = Team("atletico-mg",atleticoMG)
        val cruzeiro = R.drawable.cruzeiro_60
        var team9 = Team("cruzeiro",cruzeiro)
        val inter = R.drawable.inter_60
        var team10 = Team("internacional",inter)
        val gremio = R.drawable.gremio_60
        var team11 = Team("gremio",gremio)

        val americaMG = R.drawable.america_mg_60
        var team12 = Team("america-mg",americaMG)
        val atleticoPR = R.drawable.atletico_pr_60
        var team13 = Team("atletico-pr",atleticoPR)
        val chape = R.drawable.chape_60
        var team14 = Team("chapecoense",chape)
        val ceara = R.drawable.ceara_60
        var team15 = Team("ceara",ceara)

        val bahia = R.drawable.bahia_60
        var team16 = Team("bahia",bahia)
        val vitoria = R.drawable.vitoria_60
        var team17 = Team("vitoria",vitoria)
        val parana = R.drawable.parana_60
        var team18 = Team("parana",parana)
        val sport = R.drawable.sport_60
        var team19 = Team("sport",sport)

        listTeam.add(team)
        listTeam.add(team1)
        listTeam.add(team2)
        listTeam.add(team3)
        listTeam.add(team4)
        listTeam.add(team5)
        listTeam.add(team6)
        listTeam.add(team7)
        listTeam.add(team8)
        listTeam.add(team9)
        listTeam.add(team10)
        listTeam.add(team11)
        listTeam.add(team12)
        listTeam.add(team13)
        listTeam.add(team14)
        listTeam.add(team15)
        listTeam.add(team16)
        listTeam.add(team17)
        listTeam.add(team18)
        listTeam.add(team19)

        return  listTeam

    }
}