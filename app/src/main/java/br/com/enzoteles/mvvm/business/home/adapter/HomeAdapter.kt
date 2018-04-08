package br.com.enzoteles.mvvm.business.home.adapter

import android.content.Context
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.enzoteles.mvvm.R
import br.com.enzoteles.mvvm.business.details.DetailsFragment
import br.com.enzoteles.mvvm.util.Business
import br.com.enzoteles.mvvm.util.ManagerFragment
import br.com.enzoteles.mvvm.webservice.domain.ProximosItem
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.proximos_item.view.*

/**
 * Created by enzoteles on 22/03/18.
 */
class HomeAdapter (val teams: MutableList<ProximosItem>, val context: Context) : RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    lateinit var detailsFragment: DetailsFragment
    lateinit var manager: ManagerFragment
    override fun getItemCount(): Int {
        return teams.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.proximos_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val team = teams[position]
        holder?.let {
            it.itemView.txt_data.text = team.dataFormatada
            it.itemView.txt_hora.text = team.horajogo
            it.itemView.txt_campo.text = team.estadio


            Picasso.with(context).load(team.mandante!!.escudo!!.pequeno).into(it.itemView.img_mandante);
            Picasso.with(context).load(team.visitante!!.escudo!!.pequeno).into(it.itemView.img_visitante);



            it.itemView.setOnClickListener { view ->

                detailsFragment = DetailsFragment()

                var bundle = Bundle()
                bundle.putSerializable(Business.TEAM_DETAIL, team)
                detailsFragment.arguments = bundle

                manager = ManagerFragment()
                //replace fragment
                manager.replaceFragment(R.id.content, detailsFragment, "details", true)
            }

        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {}
}











