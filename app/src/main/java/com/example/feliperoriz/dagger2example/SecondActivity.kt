package com.example.feliperoriz.dagger2example

import android.content.Intent
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.feliperoriz.dagger2example.di.mainactivity.SecondActivityModule
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class SecondActivity : AppCompatActivity() {

    val TAG: String = "SECOND_ACTIVITY"

    val component by lazy {
        (application as ExampleApplication)
                .applicationComponent
                .plus(SecondActivityModule(this))
    }

    @Inject lateinit var sharedPrefs: SharedPreferences
    @Inject lateinit var someString: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        component.inject(this)

        Log.d(TAG, "sharedPrefs is not null: " + (sharedPrefs != null))
        Log.d(TAG, "sharedPrefs is memory address: " + sharedPrefs.toString())
        Log.d(TAG, "someString value: "+ someString)

        button.setOnClickListener {
            finish()
        }
    }
}
