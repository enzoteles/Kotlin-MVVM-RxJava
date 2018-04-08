package br.com.enzoteles.mvvm.app

import android.app.Application
import android.content.Context
import br.com.enzoteles.mvvm.business.main.MainActivity

/**
 * Created by enzoteles on 14/03/18.
 */
class ApplicationMVVM: Application(){

    override fun onCreate() {
        super.onCreate()
        mContext = this

    }

    companion object {
        var mContext:Context?= null
        var mActivity: MainActivity?= null
    }
}