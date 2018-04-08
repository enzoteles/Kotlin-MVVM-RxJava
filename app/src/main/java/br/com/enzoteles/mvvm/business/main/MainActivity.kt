package br.com.enzoteles.mvvm.business.main

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import br.com.enzoteles.mvvm.R
import br.com.enzoteles.mvvm.app.ApplicationMVVM
import br.com.enzoteles.mvvm.business.listteam.ListTeamFragment
import br.com.enzoteles.mvvm.util.ManagerFragment

class MainActivity : AppCompatActivity() {


    lateinit var listTeamFragment: ListTeamFragment
    lateinit var manager: ManagerFragment

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ApplicationMVVM.mActivity = this

        val mainComponent = DaggerOnMainComponent.builder().mainModule(MainModule()).build()
        //instanciando componentes via dagger
        manager = mainComponent.provideManagerFragment()
        listTeamFragment = mainComponent.provideListTeamFragment()


        //add fragment
        manager.addFragment(R.id.content, listTeamFragment, "list", false)

    }
}
