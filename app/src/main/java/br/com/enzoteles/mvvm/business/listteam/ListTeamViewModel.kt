package br.com.enzoteles.mvvm.business.listteam

import android.arch.lifecycle.ViewModel
import android.view.View
import br.com.enzoteles.mvvm.repository.MyRepository
import br.com.enzoteles.mvvm.webservice.domain.Team

/**
 * Created by enzoteles on 15/03/18.
 */
class ListTeamViewModel : ViewModel(){

    val myRepository: MyRepository = MyRepository()

    /**
     * método que delega para o repository pegar os Timeas da Api
     * @param view
     * @return myRepository.getPopulateTeam(view)
     * */
    fun getPopulateTeam(view: View): MutableList<Team>? {
        return myRepository.getPopulateTeam(view)
    }


}