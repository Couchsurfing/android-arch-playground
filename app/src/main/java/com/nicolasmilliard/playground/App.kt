package com.nicolasmilliard.playground

import android.app.Application
import com.squareup.leakcanary.LeakCanary
import dagger.android.AndroidInjector
import dagger.android.HasAndroidInjector
import timber.log.Timber

class App : Application(), HasAndroidInjector {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return
        }
        LeakCanary.install(this)

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
        Timber.i("App.onCreate()")

        appComponent = createAppComponent()
        AppInjector.init(this)
    }

    override fun androidInjector(): AndroidInjector<Any> = appComponent.activityInjector
}