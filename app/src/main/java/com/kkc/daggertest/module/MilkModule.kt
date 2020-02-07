package com.kkc.daggertest.module

import com.kkc.daggertest.model.Milk
import dagger.Module
import dagger.Provides

@Module
class MilkModule {
    @Provides
    fun provideMilk() = Milk(true)
}