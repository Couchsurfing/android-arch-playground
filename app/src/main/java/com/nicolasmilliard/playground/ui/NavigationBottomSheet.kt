package com.nicolasmilliard.playground.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.navigation.NavigationView
import com.nicolasmilliard.playground.R

class NavigationBottomSheet : BottomSheetDialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_navigation, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController()
        (view as NavigationView).apply {
            setNavigationItemSelectedListener {
                navController.navigate(
                    when (it.itemId) {
                        R.id.homeScreen -> R.id.action_global_homeScreen
                        R.id.dashboardScreen -> R.id.action_global_dashboardScreen
                        R.id.notificationsScreen -> R.id.action_global_notificationsScreen
                        else -> throw IllegalStateException("Unsupported ID")
                    }
                )
                this@NavigationBottomSheet.dismiss()
                true
            }
        }
    }
}