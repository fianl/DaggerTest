package com.kkc.daggertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kkc.daggertest.component.DaggerMakerComponent
import com.kkc.daggertest.model.CoffeeMaker
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var coffeeMaker: CoffeeMaker

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerMakerComponent.create().inject(this)

        tvCoffee.text = coffeeMaker.dropCoffee()
    }
}
