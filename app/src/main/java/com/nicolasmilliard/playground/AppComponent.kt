package com.nicolasmilliard.playground

import android.app.Activity
import dagger.android.DispatchingAndroidInjector

interface AppComponent {
    val activityInjector: DispatchingAndroidInjector<Any>
}