package com.example.feliperoriz.dagger2example

import android.app.Application
import com.example.feliperoriz.dagger2example.di.AndroidModule

import com.example.feliperoriz.dagger2example.di.ApplicationComponent
import com.example.feliperoriz.dagger2example.di.DaggerApplicationComponent

/**
 * Custom Application to handle Dagger creation.
 * Created by Felipe Roriz on 10/8/17.
 */
class ExampleApplication : Application() {

    val applicationComponent: ApplicationComponent by lazy {
        DaggerApplicationComponent.builder()
                .androidModule(AndroidModule(this))
                .build()
    }

    override fun onCreate() {
        super.onCreate()
        applicationComponent.inject(this)
    }
}