package com.nicolasmilliard.playground

import com.nicolasmilliard.playground.ui.HomeService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object HomeServiceModule {

    @JvmStatic
    @Provides
    @Singleton
    fun provideHomeService(): HomeService {
        return HomeService()
    }
}