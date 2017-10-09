package com.example.feliperoriz.dagger2example.di

import com.example.feliperoriz.dagger2example.ExampleApplication
import com.example.feliperoriz.dagger2example.di.mainactivity.MainActivityComponent
import com.example.feliperoriz.dagger2example.di.mainactivity.MainActivityModule
import com.example.feliperoriz.dagger2example.di.mainactivity.SecondActivityComponent
import com.example.feliperoriz.dagger2example.di.mainactivity.SecondActivityModule

import javax.inject.Singleton

import dagger.Component

/**
 * Created by feliperoriz on 10/8/17.
 */

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface ApplicationComponent {

    fun inject(target: ExampleApplication)

    // plus method in ApplicationComponent, to indicate that this component can be
    // added subcomponents of that type:
    fun plus(mainActivityModule: MainActivityModule): MainActivityComponent

    fun plus(secondActivityModule: SecondActivityModule): SecondActivityComponent
}
