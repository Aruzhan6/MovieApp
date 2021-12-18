package com.bignerdranch.android.movieapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "https://imdb-api.com/",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}