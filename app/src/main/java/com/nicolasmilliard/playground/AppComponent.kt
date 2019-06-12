package com.nicolasmilliard.playground

import dagger.android.DispatchingAndroidInjector

interface AppComponent {
    val activityInjector: DispatchingAndroidInjector<Any>
}