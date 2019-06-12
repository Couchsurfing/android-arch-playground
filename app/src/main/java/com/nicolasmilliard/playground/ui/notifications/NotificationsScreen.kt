package com.nicolasmilliard.playground.ui.notifications

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.google.android.material.snackbar.Snackbar
import com.nicolasmilliard.playground.R

class NotificationsScreen : Fragment(R.layout.screen_notifications) {

    lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = view.findNavController()
        val onButtonClick = ButtonHandler(view)
        val onSettingClick = SettingHandler(navController)
        UiBinder(view, onButtonClick, onSettingClick)
    }
}

class UiBinder(
    view: View,
    onButtonClick: ButtonHandler,
    onSettingClick: SettingHandler
) {
    private val button: Button = view.findViewById(R.id.button)
    private val settingButton: Button = view.findViewById(R.id.setting_button)

    init {
        button.setOnClickListener {
            onButtonClick()
        }
        settingButton.setOnClickListener {
            onSettingClick()
        }
    }
}

class ButtonHandler(
    private val view: View
) {
    operator fun invoke() {
        Snackbar
            .make(view, R.string.applicationId, Snackbar.LENGTH_INDEFINITE)
            .setAction(R.string.action_dismiss) {}
            .show()
    }
}

class SettingHandler(
    private val navController: NavController
) {
    operator fun invoke() {
        val action =
            NotificationsScreenDirections.actionNotificationsScreenToSettingsScreen()
        navController.navigate(action)
    }
}

