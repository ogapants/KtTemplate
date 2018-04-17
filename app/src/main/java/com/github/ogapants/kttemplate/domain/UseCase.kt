package com.github.ogapants.kttemplate.domain

import com.github.ogapants.kttemplate.data.Api

class UseCase {

    fun execute() {
        Api().getList()
    }
}