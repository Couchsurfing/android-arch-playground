package com.nicolasmilliard.playground.ui

import com.nicolasmilliard.playground.ScreenScope
import com.nicolasmilliard.playground.ui.home.HomeScreen
import com.nicolasmilliard.playground.ui.home.ItemDetailScreen
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class FragmentBuildersModule {

    @ScreenScope
    @ContributesAndroidInjector(modules = [FragmentModule::class])
    abstract fun contributeHomeScreen(): HomeScreen

    @ScreenScope
    @ContributesAndroidInjector(modules = [FragmentModule::class])
    abstract fun contributeItemDetailScreen(): ItemDetailScreen
}
