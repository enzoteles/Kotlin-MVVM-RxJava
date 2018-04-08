package br.com.enzoteles.mvvm.business.home

import android.content.Context
import br.com.enzoteles.mvvm.business.home.adapter.HomeAdapter
import br.com.enzoteles.mvvm.business.listteam.ListTeamFragment
import br.com.enzoteles.mvvm.util.ManagerFragment
import br.com.enzoteles.mvvm.webservice.domain.ProximosItem
import dagger.Component

/**
 * Created by enzoteles on 08/04/18.
 */
@Component(modules = arrayOf(HomeModule::class))
interface OnHomeComponent {

    fun provideHomeAdapter(): HomeAdapter
}

