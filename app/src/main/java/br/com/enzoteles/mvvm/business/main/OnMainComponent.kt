package br.com.enzoteles.mvvm.business.main

import br.com.enzoteles.mvvm.business.listteam.ListTeamFragment
import br.com.enzoteles.mvvm.util.ManagerFragment
import dagger.Component

/**
 * Created by enzoteles on 08/04/18.
 */
@Component(modules = arrayOf(MainModule::class))
interface OnMainComponent {

    fun provideManagerFragment(): ManagerFragment
    fun provideListTeamFragment(): ListTeamFragment
}