
package com.example.android.movieapp.service

import com.example.android.movieapp.model.MoviesResponse
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET

interface MovieService {

  @GET("movie/popular")
  fun getPopularMoviesAsync(): Deferred<Response<MoviesResponse>>

}