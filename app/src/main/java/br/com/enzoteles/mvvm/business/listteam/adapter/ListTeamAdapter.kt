package br.com.enzoteles.mvvm.business.listteam.adapter

import android.content.Context
import android.os.Build
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.enzoteles.mvvm.R
import br.com.enzoteles.mvvm.business.home.HomeFragment
import br.com.enzoteles.mvvm.business.listteam.DaggerOnListTeamComponent
import br.com.enzoteles.mvvm.business.listteam.ListTeamModule
import br.com.enzoteles.mvvm.util.Business
import br.com.enzoteles.mvvm.util.ManagerFragment
import br.com.enzoteles.mvvm.webservice.domain.Team
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.list_iten_team.view.*

/**
 * Created by enzoteles on 22/03/18.
 */
class ListTeamAdapter(val teams: MutableList<Team>, val context: Context) : RecyclerView.Adapter<ListTeamAdapter.ViewHolder>() {

    lateinit var homeFragment: HomeFragment
    lateinit var manager: ManagerFragment


    override fun getItemCount(): Int {
        return teams.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_iten_team, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val team = teams[position]
        val listTeamCompoment = DaggerOnListTeamComponent.builder().listTeamModule(ListTeamModule(teams, context)).build()
        holder?.let {
            val drawable = team.image
            Picasso.with(context).load(drawable).into(it.itemView.img_team);

            it.itemView.setOnClickListener { view ->
                homeFragment = listTeamCompoment.provideHomeFragment()

                var bundle = Bundle()
                bundle.putString(Business.TEAM_NAME, team.name)
                homeFragment.arguments = bundle

                manager = listTeamCompoment.provideManagerFragment()
                //replace fragment
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                    manager.replaceFragment(R.id.content, homeFragment, "home", false)
                }

            }

        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {}
}











