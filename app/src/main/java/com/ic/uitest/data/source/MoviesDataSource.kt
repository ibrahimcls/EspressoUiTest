package com.ic.uitest.data.source

import com.ic.uitest.data.Movie

interface MoviesDataSource {

    fun getMovie(movieId: Int): Movie?
}