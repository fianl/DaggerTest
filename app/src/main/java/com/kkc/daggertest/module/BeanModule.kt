package com.kkc.daggertest.module

import com.kkc.daggertest.model.Bean
import dagger.Module
import dagger.Provides

@Module
class BeanModule {
    @Provides
    fun provideBean(): Bean = Bean("Ethiopia", "Fruity")
}