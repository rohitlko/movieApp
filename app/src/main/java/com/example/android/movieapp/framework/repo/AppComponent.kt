
package com.example.android.movieapp.framework.repo

import android.app.Application
import com.example.android.movieapp.Repo.MovieApiModule
import com.example.android.movieapp.ui.MainActivity
import com.example.android.movieapp.ui.ViewModelModule
import com.example.android.movieapp.ui.moviesList.MovieListFragment
import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, MovieApiModule::class, ViewModelModule::class])
interface AppComponent {
  fun inject(mainActivity: MainActivity)
  fun inject(movieListFragment: MovieListFragment)
}

@Module
class AppModule(private val movieApplication: Application) {

  @Provides
  @Singleton
  fun provideContext(): Application = movieApplication
}