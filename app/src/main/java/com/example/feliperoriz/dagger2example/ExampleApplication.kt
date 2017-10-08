package com.example.feliperoriz.dagger2example

import android.app.Application

import com.example.feliperoriz.dagger2example.di.ApplicationComponent

/**
 * Created by feliperoriz on 10/8/17.
 */

class ExampleApplication : Application() {

    private val applicationComponent: ApplicationComponent? = null

    override fun onCreate() {
        super.onCreate()


    }

}
