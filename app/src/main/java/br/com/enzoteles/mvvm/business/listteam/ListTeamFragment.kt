package br.com.enzoteles.mvvm.business.listteam

import android.animation.ValueAnimator
import android.annotation.SuppressLint
import android.app.Fragment
import android.arch.lifecycle.ViewModelProviders
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.support.annotation.RequiresApi
import android.support.v7.widget.StaggeredGridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.enzoteles.mvvm.R
import br.com.enzoteles.mvvm.R.id.layout_team
import br.com.enzoteles.mvvm.app.ApplicationMVVM
import br.com.enzoteles.mvvm.business.listteam.adapter.ListTeamAdapter
import br.com.enzoteles.mvvm.webservice.domain.Team
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import kotlinx.android.synthetic.main.list_team.*
import kotlinx.android.synthetic.main.list_team.view.*


/**
 * Created by enzoteles on 14/03/18.
 */

class ListTeamFragment : Fragment() {

    lateinit var listTeam: MutableList<Team>
    lateinit var adapter: ListTeamAdapter

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        var view = inflater!!.inflate(R.layout.list_team, container, false)
        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()

    }

    /**
     * Método para iniciar a UI da Lista de Times
     * */
    private fun initUI() {

        var viewModel = ViewModelProviders.of(ApplicationMVVM.mActivity!!).get(ListTeamViewModel::class.java!!)
        Glide.with(activity.baseContext).load(R.drawable.pelota).asGif().diskCacheStrategy(DiskCacheStrategy.SOURCE).crossFade().into(pelota);
        ValueAnimator.ofFloat(0f, 200f).apply {
            duration = 700
            addUpdateListener {
                pelota.x = it.animatedValue as Float
                jogabonito.y = interpolate(100f, 300f, it.animatedFraction)
            }
            start()
        }


        Handler().postDelayed({
            layout_splash.visibility = View.GONE
            layout_team.visibility = View.VISIBLE

        }, 2000)


        setRecyclerView(view, viewModel)
    }

    /**
     * Método que contrala a animação da splash na tela
     * @return a + f * (b - a)
     * */
    private fun interpolate(a: Float, b: Float, f: Float): Float {
        return a + f * (b - a)
    }

    /**
     * Método para popular a lista de time na tela
     * */
    @SuppressLint("NewApi")
    fun setRecyclerView(view: View, viewModel: ListTeamViewModel) {

        listTeam = viewModel.getPopulateTeam(view)!!
        val listTeamCompoment = DaggerOnListTeamComponent.builder().listTeamModule(ListTeamModule(listTeam, activity.baseContext)).build()
        adapter = listTeamCompoment.provideListTeamAdapter()
        view.recycler_view_t.adapter = adapter
        val layoutManager = StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.VERTICAL)
        view.recycler_view_t.layoutManager = layoutManager



    }


}


