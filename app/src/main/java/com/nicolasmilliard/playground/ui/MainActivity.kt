package com.nicolasmilliard.playground.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.onNavDestinationSelected
import butterknife.BindView
import butterknife.ButterKnife.bind
import com.google.android.material.bottomappbar.BottomAppBar
import com.nicolasmilliard.playground.R
import com.nicolasmilliard.playground.ui.home.HomeFragmentModule
import dagger.Module
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.ContributesAndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HasSupportFragmentInjector {


    @BindView(R.id.bottom_app_bar)
    lateinit var bottomNav: BottomAppBar

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        bind(this)

        val navController = findNavController(R.id.nav_host_fragment)
        bottomNav.apply {
            setOnMenuItemClickListener {
                it.onNavDestinationSelected(navController)
                true
            }
            setNavigationOnClickListener {
                // Support issue https://issuetracker.google.com/issues/80267254
                NavigationBottomSheet().show(supportFragmentManager, "Dialog")
            }
        }
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> = dispatchingAndroidInjector
}

@Module
abstract class MainActivityModule {
    @ContributesAndroidInjector(modules = [HomeFragmentModule::class])
    abstract fun contributeMainActivity(): MainActivity
}
