package com.kkc.daggertest.module

import com.kkc.daggertest.model.Bean
import com.kkc.daggertest.model.CoffeeMaker
import com.kkc.daggertest.model.Milk
import com.kkc.daggertest.model.Water
import dagger.Module
import dagger.Provides

@Module
class CoffeeMakerModule {
    @Provides
    fun provideCoffeeMaker(bean: Bean, water: Water, milk: Milk): CoffeeMaker = CoffeeMaker(bean, water, milk)
}