package br.com.enzoteles.mvvm.business.home

import android.content.Context
import br.com.enzoteles.mvvm.app.ApplicationMVVM
import br.com.enzoteles.mvvm.business.home.adapter.HomeAdapter
import br.com.enzoteles.mvvm.webservice.domain.ProximosItem
import dagger.Module
import dagger.Provides

/**
 * Created by enzoteles on 08/04/18.
 */
@Module
class HomeModule(val proximos: List<ProximosItem?>?, val baseContext: Context) {

    @Provides
    fun provideHomeAdapter(): HomeAdapter{
        return HomeAdapter(proximos as MutableList<ProximosItem>, baseContext)
    }

}