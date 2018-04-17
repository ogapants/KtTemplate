package com.github.ogapants.kttemplate.presentation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.github.ogapants.kttemplate.R
import com.github.ogapants.kttemplate.domain.UseCase

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        UseCase().execute()
    }
}
