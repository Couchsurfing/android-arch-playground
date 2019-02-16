package com.nicolasmilliard.playground.ui.home

import android.os.Bundle
import android.view.View
import androidx.annotation.ContentView
import androidx.fragment.app.Fragment
import com.nicolasmilliard.playground.R
import com.nicolasmilliard.playground.Screen
import com.nicolasmilliard.playground.ui.Injectable
import com.squareup.picasso3.Picasso
import javax.inject.Inject

@ContentView(R.layout.screen_item_detail)
class ItemDetailScreen : Fragment(), Injectable {

    private lateinit var itemId: String

    @Inject
    @field:Screen
    lateinit var picasso: Picasso

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val args = ItemDetailScreenArgs.fromBundle(requireArguments())
        itemId = args.itemId
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lifecycle.addObserver(picasso)
    }
}
