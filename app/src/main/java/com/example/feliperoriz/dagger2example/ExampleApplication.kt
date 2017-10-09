package com.example.feliperoriz.dagger2example

import android.app.Application
import com.example.feliperoriz.dagger2example.di.AppModule

import com.example.feliperoriz.dagger2example.di.ApplicationComponent
import com.example.feliperoriz.dagger2example.di.DaggerApplicationComponent

/**
 * Created by feliperoriz on 10/8/17.
 */

class ExampleApplication : Application() {

    val applicationComponent: ApplicationComponent by lazy {
        DaggerApplicationComponent.builder()
                .appModule(AppModule(this))
                .build()
    }

    override fun onCreate() {
        super.onCreate()
        applicationComponent.inject(this)
    }
}
