package br.com.enzoteles.mvvm.business.listteam

import android.content.Context
import br.com.enzoteles.mvvm.business.details.DetailsFragment
import br.com.enzoteles.mvvm.business.home.HomeFragment
import br.com.enzoteles.mvvm.business.home.adapter.HomeAdapter
import br.com.enzoteles.mvvm.business.listteam.ListTeamFragment
import br.com.enzoteles.mvvm.business.listteam.adapter.ListTeamAdapter
import br.com.enzoteles.mvvm.util.ManagerFragment
import br.com.enzoteles.mvvm.webservice.domain.ProximosItem
import br.com.enzoteles.mvvm.webservice.domain.Team
import dagger.Component

/**
 * Created by enzoteles on 08/04/18.
 */
@Component(modules = arrayOf(ListTeamModule::class))
interface OnListTeamComponent {

    fun provideManagerFragment(): ManagerFragment
    fun provideHomeFragment(): HomeFragment
    fun provideListTeamAdapter(): ListTeamAdapter
}

