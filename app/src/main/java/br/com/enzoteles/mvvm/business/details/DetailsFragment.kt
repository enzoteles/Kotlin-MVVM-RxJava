package br.com.enzoteles.mvvm.business.details

import android.app.Fragment
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.enzoteles.mvvm.R
import br.com.enzoteles.mvvm.util.Business
import br.com.enzoteles.mvvm.webservice.domain.ProximosItem
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.details_item.view.*

/**
 * Created by enzoteles on 03/04/18.
 */
class DetailsFragment: Fragment(){

    var proximo: ProximosItem?= null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        var view  = inflater!!.inflate(R.layout.details_item, container, false )

        if(arguments != null){
            proximo = arguments.get(Business.TEAM_DETAIL) as ProximosItem
        }


        setGame(proximo, view)

        return view
    }

    private fun setGame(proximo: ProximosItem?, view: View) {
        Picasso.with(activity.baseContext).load(proximo!!.mandante!!.escudo!!.grande).into(view.img_mandante);
        Picasso.with(activity.baseContext).load(proximo!!.visitante!!.escudo!!.grande).into(view.img_visitante);
        view.txt_mandante.text = proximo.mandante!!.apelido
        view.txt_visitante.text = proximo.visitante!!.apelido
        view.txt_data.text = proximo.dataFormatada
        view.txt_hora.text = proximo.horajogo
        view.txt_estadio.text = proximo.estadio
        view.txt_campeonato.text = proximo.nomeCampeonato
        view.txt_rodada.text = proximo.rodada.toString()

        view.txt_rodada.visibility = if(proximo.rodada != null) View.VISIBLE else View.INVISIBLE
        view.textView16.visibility = if(proximo.rodada != null) View.VISIBLE else View.INVISIBLE



    }
}