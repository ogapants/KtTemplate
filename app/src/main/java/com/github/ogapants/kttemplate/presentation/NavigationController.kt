package com.github.ogapants.kttemplate.presentation

import android.support.v7.app.AppCompatActivity
import android.util.Log
import javax.inject.Inject

class NavigationController @Inject constructor(private val activity: AppCompatActivity) {

    fun go(str: String) {
        Log.d("__", "ooo " + activity::class.java.name + "," + str)
        //activity.startActivity(Intent(activity, MainActivity::class.java))
    }
}
