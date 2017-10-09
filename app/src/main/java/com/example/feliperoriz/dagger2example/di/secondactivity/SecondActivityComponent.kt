package com.example.feliperoriz.dagger2example.di.mainactivity

import com.example.feliperoriz.dagger2example.SecondActivity
import dagger.Subcomponent
import javax.inject.Singleton

/**
 * Created by feliperoriz on 10/8/17.
 */

@Singleton
@Subcomponent(modules = arrayOf(SecondActivityModule::class))
interface SecondActivityComponent {
    fun inject(target: SecondActivity)
}