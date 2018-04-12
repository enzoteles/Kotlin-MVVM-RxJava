package br.com.enzoteles.mvvm.business.home

import android.app.Fragment
import android.arch.lifecycle.Observer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.enzoteles.mvvm.R
import android.arch.lifecycle.ViewModelProviders
import android.os.Handler
import android.support.annotation.Nullable
import android.support.v7.widget.StaggeredGridLayoutManager
import br.com.enzoteles.mvvm.app.ApplicationMVVM
import br.com.enzoteles.mvvm.business.home.adapter.HomeAdapter
import br.com.enzoteles.mvvm.util.Business
import br.com.enzoteles.mvvm.webservice.domain.ProximosItem
import br.com.enzoteles.mvvm.webservice.domain.Response
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import kotlinx.android.synthetic.main.home.*


/**
 * Created by enzoteles on 14/03/18.
 */

class HomeFragment: Fragment(){

    var response: Response?= null
    val nameTeam: String by lazy { arguments.getString(Business.TEAM_NAME) }
    lateinit var adapter: HomeAdapter

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        var view  = inflater!!.inflate(R.layout.home, container, false )
        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()

    }

     fun initUI() {

         Glide.with(activity.baseContext).load(R.drawable.pelota).asGif().diskCacheStrategy(DiskCacheStrategy.SOURCE).crossFade().into(pelota);
         Handler().postDelayed({
             var viewModel = ViewModelProviders.of(ApplicationMVVM.mActivity!!).get(HomeViewModel::class.java!!)
             observerViewModel(viewModel)
         }, 2000)

    }

    fun interpolate(a: Float, b: Float, f: Float) = a + f * (b - a)

    /**
     * Método para pegar o Response da API
     * @param viewModel
     * */
    fun observerViewModel(viewModel: HomeViewModel) {

        viewModel.getResponseApi(nameTeam)?.observe(ApplicationMVVM.mActivity!!, object : Observer<Response> {
            override fun onChanged(@Nullable response: Response?) {
                initProximos(response!!.proximos)
            }
        })
    }

    /**
     * Método que popula o adapter com a lista de próximos jogos
     * */
    private fun initProximos(proximos: List<ProximosItem?>?) {

        val homeComponent = DaggerOnHomeComponent.builder().homeModule(HomeModule(proximos, activity.baseContext)).build()
        adapter = homeComponent.provideHomeAdapter()
        recyclerview.adapter = adapter
        var layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
        recyclerview.layoutManager = layoutManager
        pelota.visibility = View.GONE
        recyclerview.visibility = View.VISIBLE


    }
}