package com.nicolasmilliard.playground.ui.home

import androidx.navigation.NavController
import com.nicolasmilliard.playground.api.Item

class OpenItemDetailsHandler(
    private val navController: NavController
) : ItemHandler {
    override fun invoke(item: Item) {
        val action =
            HomeScreenDirections.actionHomeScreenToItemDetailScreen(
                item.id
            )
        navController.navigate(action)
    }
}