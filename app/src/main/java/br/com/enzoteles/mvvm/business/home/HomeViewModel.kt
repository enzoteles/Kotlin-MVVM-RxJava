package br.com.enzoteles.mvvm.business.home

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import br.com.enzoteles.mvvm.repository.MyRepository
import br.com.enzoteles.mvvm.webservice.domain.ProximosItem
import br.com.enzoteles.mvvm.webservice.domain.Response

/**
 * Created by enzoteles on 15/03/18.
 */
class HomeViewModel: ViewModel(){

    val myRepository: MyRepository = MyRepository()

    /**
     * método que delega para o repository pegar os ProximosItem da Api
     * @return myRepository.getProximosItemApi()
     * */
    fun getProximosItemApi(team: String): MutableLiveData<List<ProximosItem>>? {

        return myRepository.getProximosItemApi(team)
    }

    /**
     * método que delega para o repository pegar o Response da Api
     * @return myRepository.getResponseApi()
     * */
    fun getResponseApi(team: String): MutableLiveData<Response>? {

        return myRepository.getResponseApi(team)
    }

}