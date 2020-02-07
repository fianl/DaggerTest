package com.kkc.daggertest.module

import com.kkc.daggertest.model.Water
import dagger.Module
import dagger.Provides

@Module
class WaterModule {
    @Provides
    fun provideWater(): Water = Water(isExist = true, isHot = true)
}