package com.example.koin_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named

class MainActivity : AppCompatActivity() {
    val firstPresenter: MySimplePresenter by inject(named("named1"))
    val myViewModel: MyViewModel by viewModel(named("named2"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("MSG", firstPresenter.sayHello())
        Log.i("MSG", myViewModel.sayHello())
    }
}