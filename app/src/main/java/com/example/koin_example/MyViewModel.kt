package com.example.koin_example

import androidx.lifecycle.ViewModel
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class MyViewModel(val repo: HelloRepository): ViewModel() {
    fun sayHello() = "${repo.giveHello()} from $this"
}