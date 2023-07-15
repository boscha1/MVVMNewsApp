package com.androiddevs.mvvmnewsapp.ui.fragment

import android.view.View
import android.widget.ProgressBar
import androidx.fragment.app.Fragment
import com.androiddevs.mvvmnewsapp.ui.NewsViewModel

abstract class BaseNewsFragment(layoutResId: Int): Fragment(layoutResId) {
    lateinit var viewModel: NewsViewModel
    fun hideProgressBar(progressBar: ProgressBar) {
        progressBar.visibility = View.INVISIBLE
    }

    fun showProgressBar(progressBar: ProgressBar) {
        progressBar.visibility = View.VISIBLE
    }
}