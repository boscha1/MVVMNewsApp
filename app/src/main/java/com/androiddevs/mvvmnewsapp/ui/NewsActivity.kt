package com.androiddevs.mvvmnewsapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.androiddevs.mvvmnewsapp.R
import com.androiddevs.mvvmnewsapp.db.ArticleDatabase
import com.androiddevs.mvvmnewsapp.repository.NewsRepository
import kotlinx.android.synthetic.main.activity_news.*

class NewsActivity : AppCompatActivity() {

    lateinit var viewModel: NewsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        val newsRepository = NewsRepository(ArticleDatabase(this))

        // create a factory to provide instances of NewsViewModel
        // fulfill dependency of newsRepository
        val viewModelProviderFactory = NewsViewModelProviderFactory(newsRepository)

        // create an instance of the NewsViewModel using the factory
        // this associates the viewModel with this activity (NewsActivity)
        viewModel = ViewModelProvider(this, viewModelProviderFactory).get(NewsViewModel::class.java)

        // setup the navigation controller and enable navigation between different screens
        bottomNavigationView.setupWithNavController(newsNavHostFragment.findNavController())
    }
}
