package com.example.dagger.kotlin

import dagger.Component
import ggikko.me.kotlinexample.ui.GgikkoApplication
import ggikko.me.kotlinexample.ui.main.InitActivity
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface ApplicationComponent {
    fun inject(ggikkoApplication: GgikkoApplication)
    fun inject(initActivity : InitActivity)
}