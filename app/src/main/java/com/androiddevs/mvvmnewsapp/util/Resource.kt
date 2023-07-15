package com.androiddevs.mvvmnewsapp.util

/**
 * wrap around our network responses
 * differentiate between error and successful responses
 * handle the loading state (show a progress bar while network response is processing)
 */
sealed class Resource<T>(
    val data: T? = null,
    val message: String? = null
) {
    class Success<T>(data: T) : Resource<T>(data)
    class Error<T>(message: String, data: T? = null) : Resource<T>(data, message)
    class Loading<T> : Resource<T>()
}