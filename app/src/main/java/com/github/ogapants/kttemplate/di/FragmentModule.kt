package com.github.ogapants.kttemplate.di

import android.support.v4.app.Fragment
import com.github.ogapants.kttemplate.presentation.MainFragment
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface FragmentModule {

    @Binds
    fun providesFragment(fragment: MainFragment): Fragment

    @ContributesAndroidInjector
    fun contributeMainFragment(): MainFragment
}