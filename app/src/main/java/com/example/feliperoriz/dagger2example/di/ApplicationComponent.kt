package com.example.feliperoriz.dagger2example.di

import com.example.feliperoriz.dagger2example.ExampleApplication
import com.example.feliperoriz.dagger2example.MainActivity

import javax.inject.Singleton

import dagger.Component

/**
 * Application Level Dagger Component.
 * Created by Felipe Roriz on 10/8/17.
 */
@Singleton
@Component(modules = arrayOf(AndroidModule::class))
interface ApplicationComponent {

    fun inject(target: ExampleApplication)

    fun inject(target: MainActivity)
}
