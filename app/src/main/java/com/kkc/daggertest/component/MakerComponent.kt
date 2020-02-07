package com.kkc.daggertest.component

import com.kkc.daggertest.MainActivity
import com.kkc.daggertest.module.BeanModule
import com.kkc.daggertest.module.CoffeeMakerModule
import com.kkc.daggertest.module.MilkModule
import com.kkc.daggertest.module.WaterModule
import dagger.Component

@Component(modules = [BeanModule::class, WaterModule::class, MilkModule::class, CoffeeMakerModule::class])
interface MakerComponent {
    fun inject(activity: MainActivity)
}