package com.example.koin_example

import org.koin.core.annotation.Factory

@Factory
class MySimplePresenter(val repo: HelloRepository) {
    fun sayHello() = "${repo.giveHello()} from $this"
}