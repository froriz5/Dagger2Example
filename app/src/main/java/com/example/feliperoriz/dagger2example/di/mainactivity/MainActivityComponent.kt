package com.example.feliperoriz.dagger2example.di.mainactivity

import com.example.feliperoriz.dagger2example.MainActivity
import dagger.Subcomponent
import javax.inject.Singleton

/**
 * Created by feliperoriz on 10/8/17.
 */
@Singleton
@Subcomponent(modules = arrayOf(MainActivityModule::class))
interface MainActivityComponent {
    fun inject(target: MainActivity)
}