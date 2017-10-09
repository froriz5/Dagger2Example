package com.example.feliperoriz.dagger2example.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by feliperoriz on 10/8/17.
 */
@Module
class AppModule(val context: Application) {

    @Singleton
    @Provides
    fun providesContext(): Context = context

    @Singleton
    @Provides
    fun providesSharedPreference(context: Context): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(context)
    }
}