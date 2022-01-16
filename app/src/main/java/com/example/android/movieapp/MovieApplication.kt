
package com.example.android.movieapp

import android.app.Application
import com.example.android.movieapp.Repo.MovieApiModule
import com.example.android.movieapp.framework.repo.AppComponent
import com.example.android.movieapp.framework.repo.AppModule
import com.example.android.movieapp.framework.repo.DaggerAppComponent

class MovieApplication : Application() {

  lateinit var appComponent: AppComponent

  private fun initAppComponent(app: MovieApplication): AppComponent {
    return DaggerAppComponent.builder()
        .appModule(AppModule(app))
        .movieApiModule(MovieApiModule()).build()
  }

  companion object {
    @get:Synchronized
    lateinit var application: MovieApplication
      private set
  }

  override fun onCreate() {
    super.onCreate()
    application = this
    appComponent = initAppComponent(this)
  }
}