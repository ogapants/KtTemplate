package com.github.ogapants.kttemplate.presentation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.github.ogapants.kttemplate.R
import com.github.ogapants.kttemplate.domain.UseCase
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AndroidInjection.inject(this)

        viewModel.ooo()

        UseCase().execute()
    }
}
