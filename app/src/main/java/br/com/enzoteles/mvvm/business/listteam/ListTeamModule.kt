package br.com.enzoteles.mvvm.business.listteam

import android.content.Context
import br.com.enzoteles.mvvm.business.home.HomeFragment
import br.com.enzoteles.mvvm.business.listteam.adapter.ListTeamAdapter
import br.com.enzoteles.mvvm.util.ManagerFragment
import br.com.enzoteles.mvvm.webservice.domain.Team
import dagger.Module
import dagger.Provides

/**
 * Created by enzoteles on 08/04/18.
 */
@Module
class ListTeamModule(val listTeam: MutableList<Team>,val baseContext: Context) {

    /**
     * Método para instânciar o gerenciador de fragmento
     * */
    @Provides
    fun provideManagerFragment(): ManagerFragment {
        return ManagerFragment()
    }

    /**
     * Método para instânciar a tela Home
     * */
    @Provides
    fun provideHomeFragment(): HomeFragment{
        return HomeFragment()
    }
    /**
     * Método para instânciar o adapter da Lista de Times
     * */
    @Provides
    fun provideListTeamAdapter(): ListTeamAdapter{
        return  ListTeamAdapter(listTeam, baseContext)
    }

}