
package com.example.android.movieapp.Repo

import android.util.Log
import com.example.android.movieapp.service.MovieService
import com.example.android.movieapp.model.Movie
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Inject
import javax.inject.Singleton

private const val BASE_URL = "https://api.themoviedb.org/3/"
private const val API_KEY = "9e193c0830772fb3f6fc88517f7753dc"

@Module
class MovieApiModule {

  @Provides
  @Singleton
  fun provideInterceptor(): Interceptor {
    return Interceptor { chain ->
      val newUrl = chain.request().url()
          .newBuilder()
          .addQueryParameter("api_key", API_KEY)
          .build()

      val newRequest = chain.request()
          .newBuilder()
          .url(newUrl)
          .build()

      chain.proceed(newRequest)
    }
  }

  @Provides
  @Singleton
  fun provideWeatherApiClient(authInterceptor: Interceptor): OkHttpClient {
    return OkHttpClient().newBuilder()
        .addInterceptor(authInterceptor)
        .build()
  }

  @Provides
  @Singleton
  fun provideMoshi(): Moshi {
    return Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
  }

  @Provides
  @Singleton
  fun provideRetrofit(moshi: Moshi, randomUserApiClient: OkHttpClient): Retrofit {
    return Retrofit.Builder()
        .client(randomUserApiClient)
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .addCallAdapterFactory(CoroutineCallAdapterFactory())
        .baseUrl(BASE_URL)
        .build()
  }

  @Provides
  @Singleton
  fun providesMovieApi(retrofit: Retrofit): MovieService {
    return retrofit.create(MovieService::class.java)
  }
}

class MovieRepository @Inject constructor(private val movieService: MovieService) {

  suspend fun fetchPopularMovies(): List<Movie>? {
      Log.d("ROHIT-TEST", "fetchPopularMovies")
    val deferredResponse = movieService.getPopularMoviesAsync().await()

    return if (deferredResponse.isSuccessful) {
        Log.d("ROHIT-TES", deferredResponse.body().toString());
      deferredResponse.body()?.movies
    } else {
      throw Exception()
    }
  }

}