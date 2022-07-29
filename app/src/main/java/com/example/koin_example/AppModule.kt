package com.example.koin_example

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module
import org.koin.core.qualifier.named
import org.koin.dsl.module

@Module
@ComponentScan("org.koin.sample")
class AppModule {
    val appModule = module {
        //     Classical DSL
        // single instance of HelloRepository
        single<HelloRepository> { HelloRepositoryImpl() }

        // Simple Presenter Factory
        factory(named("named1")) { MySimplePresenter(get()) }

        // MyViewModel ViewModel
        viewModel(named("named2")) { MyViewModel(get()) }
    }
}