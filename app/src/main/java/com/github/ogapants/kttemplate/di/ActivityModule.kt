package com.github.ogapants.kttemplate.di

import android.support.v7.app.AppCompatActivity
import com.github.ogapants.kttemplate.presentation.MainActivity
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ActivityModule {

    @Binds
    fun providesAppCompatActivity(activity: MainActivity): AppCompatActivity

    @ContributesAndroidInjector
    fun contributeMainActivity(): MainActivity
}