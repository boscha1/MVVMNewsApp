package com.androiddevs.mvvmnewsapp.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.androiddevs.mvvmnewsapp.ui.NewsActivity
import com.androiddevs.mvvmnewsapp.ui.NewsViewModel

open class BaseNewsFragment(layoutResId: Int): Fragment(layoutResId) {
    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        /**
         * this gets the viewModel from the parent activity so there is one shared viewModel
         * across all fragments. If there were multiple instances of this viewModel, each fragment
         * would have independent states and data
         */
        viewModel = (activity as NewsActivity).viewModel
    }
}