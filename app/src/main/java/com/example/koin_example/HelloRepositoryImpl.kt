package com.example.koin_example

import org.koin.core.annotation.Single

@Single
class HelloRepositoryImpl() : HelloRepository {
    override fun giveHello(): String = "Hello Koin"
}