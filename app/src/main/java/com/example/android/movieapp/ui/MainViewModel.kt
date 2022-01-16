
package com.example.android.movieapp.ui

import androidx.lifecycle.*
import com.example.android.movieapp.Repo.MovieRepository
import com.example.android.movieapp.model.Movie
import com.example.android.movieapp.ui.moviesList.MovieLoadingState
import kotlinx.coroutines.*
import javax.inject.Inject

class MainViewModel @Inject constructor(private val repository: MovieRepository) :
    ViewModel() {

  private val _popularMoviesLiveData = MutableLiveData<List<Movie>>()
  val moviesMediatorData = MediatorLiveData<List<Movie>>()
  private var debouncePeriod: Long = 500

  val movieLoadingStateLiveData = MutableLiveData<MovieLoadingState>()
  private val _searchFieldTextLiveData = MutableLiveData<String>()

  private val _navigateToDetails = MutableLiveData<Event<String>>()
  val navigateToDetails: LiveData<Event<String>>
    get() = _navigateToDetails

  init {

    moviesMediatorData.addSource(_popularMoviesLiveData) {
      moviesMediatorData.value = it
    }

  }

  fun onFragmentReady() {
    if (_popularMoviesLiveData.value.isNullOrEmpty()) {
      getPopularMovies()
    }
  }

  private fun getPopularMovies() {
    movieLoadingStateLiveData.value = MovieLoadingState.LOADING
    viewModelScope.launch(Dispatchers.IO) {
      try {
        val movies = repository.fetchPopularMovies()
        _popularMoviesLiveData.postValue(movies)
        movieLoadingStateLiveData.postValue(MovieLoadingState.LOADED)
      } catch (e: Exception) {
        movieLoadingStateLiveData.postValue(MovieLoadingState.INVALID_API_KEY)
      }
    }
  }

  fun onMovieClicked(movie: Movie) {
    movie.title?.let {
      _navigateToDetails.value = Event(it)
    }
  }

  override fun onCleared() {
    super.onCleared()
  }
}

class Event<out T>(private val content: T) {

  private var hasBeenHandled = false

  fun getContentIfNotHandled(): T? {
    return if (hasBeenHandled)
      null
    else {
      hasBeenHandled = true
      content
    }
  }
}