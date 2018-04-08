package br.com.enzoteles.mvvm.util

import android.app.Fragment
import android.app.FragmentManager
import android.app.FragmentTransaction
import android.os.Build
import android.support.annotation.RequiresApi
import android.util.Log
import br.com.enzoteles.mvvm.R
import br.com.enzoteles.mvvm.app.ApplicationMVVM
import kotlinx.android.synthetic.main.home.view.*

/**
 * Created by enzoteles on 14/03/18.
 */
class ManagerFragment{

    var manager: FragmentManager?= null
    lateinit var transaction: FragmentTransaction

    init {
        manager = ApplicationMVVM.mActivity!!.fragmentManager
    }

    /**
     * Method to add fragment in backstack
     * @param layout, fragment, tag, backstack
     * */
    fun addFragment(layout: Int, fragment: Fragment, tag: String, backstack: Boolean) {
        transaction = manager!!.beginTransaction()
        transaction.add(layout, fragment, tag)
        if(backstack)
           transaction.addToBackStack(null)
        transaction.commit()
    }

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
            /**
     * Method to replace fragment in backstack
     * @param layout, fragment, tag, backstack
     * */
    fun replaceFragment(layout: Int, fragment: Fragment, tag: String, backstack: Boolean) {
        transaction = manager!!.beginTransaction()
        transaction.replace(layout, fragment, tag)
        if(backstack){
            transaction.addToBackStack(null)
        }
        transaction.commitAllowingStateLoss();
    }

    /**
     * Method to remove fragment in backstack
     * @param fragment
     * */
    fun removeFragment(fragment: Fragment) {
        transaction = manager!!.beginTransaction()
        transaction.remove(fragment)
        transaction.commit()
    }

}