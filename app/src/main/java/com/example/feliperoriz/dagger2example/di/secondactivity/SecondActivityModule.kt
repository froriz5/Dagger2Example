package com.example.feliperoriz.dagger2example.di.mainactivity

import com.example.feliperoriz.dagger2example.MainActivity
import com.example.feliperoriz.dagger2example.SecondActivity
import com.example.feliperoriz.dagger2example.di.AppModule
import dagger.Module
import dagger.Provides

/**
 * Created by feliperoriz on 10/8/17.
 */
@Module(includes = arrayOf(AppModule::class))
class SecondActivityModule(activity: SecondActivity) {

    @Provides
    fun providesStringForSecondActivity(): String {
        return "String for Second Activity"
    }
}