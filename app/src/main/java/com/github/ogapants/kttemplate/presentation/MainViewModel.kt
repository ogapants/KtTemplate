package com.github.ogapants.kttemplate.presentation

import android.content.Context
import android.util.Log
import com.github.ogapants.kttemplate.R
import javax.inject.Inject

class MainViewModel @Inject constructor(private val context: Context) {

    fun ooo() {
        Log.d("_", "++" + context.getString(R.string.app_name))
    }
}