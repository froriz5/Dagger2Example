package com.example.feliperoriz.dagger2example

import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private val TAG: String = "MAIN_ACTIVITY"

    // by lazy allows component to be final and nonnull using "val"
    private val component by lazy {
        (application as ExampleApplication)
                .applicationComponent
    }

    // Injection will occur after "component.inject(this)" in onCreate(...)
    @Inject lateinit var sharedPrefs: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        component.inject(this)

        Log.d(TAG, "sharedPrefs is not null: " + (sharedPrefs != null))
        Log.d(TAG, "sharedPrefs memory address: " + sharedPrefs.toString())
    }
}
