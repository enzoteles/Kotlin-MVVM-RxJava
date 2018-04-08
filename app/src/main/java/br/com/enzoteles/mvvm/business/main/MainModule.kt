package br.com.enzoteles.mvvm.business.main

import br.com.enzoteles.mvvm.business.listteam.ListTeamFragment
import br.com.enzoteles.mvvm.util.ManagerFragment
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by enzoteles on 08/04/18.
 */
@Module
class MainModule{

    /**
     * método para instânciar o gerenciador de fragmentos
     * @return ManagerFragment
     * */
    @Provides
    fun provideManagerFragment(): ManagerFragment{
        return ManagerFragment()
    }

    /**
     * método para instânciar a lista de times
     * @return ListTeamFragment
     * */
    @Provides
    fun provideListTeamFragment(): ListTeamFragment{
        return ListTeamFragment()
    }



}