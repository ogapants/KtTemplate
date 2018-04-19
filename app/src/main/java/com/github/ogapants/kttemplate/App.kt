package com.github.ogapants.kttemplate

import android.app.Application
import com.github.ogapants.kttemplate.di.AppComponent
import com.github.ogapants.kttemplate.di.DaggerAppComponent

class App : Application() {

    lateinit var appComponent: AppComponent
    private set

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder()
                .application(this)
                .build()
    }
}