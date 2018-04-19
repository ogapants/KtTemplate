package com.github.ogapants.kttemplate.presentation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.github.ogapants.kttemplate.App
import com.github.ogapants.kttemplate.R
import com.github.ogapants.kttemplate.domain.UseCase
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as? App)?.appComponent?.inject(this)

        viewModel.ooo()

        UseCase().execute()
    }
}
