package com.example.android.movieapp.ui.moviesList

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.android.movieapp.R
import kotlin.Int
import kotlin.String

class MovieListFragmentDirections private constructor() {
  private data class ActionMovieClicked(
    val movieName: String
  ) : NavDirections {
    override fun getActionId(): Int = R.id.actionMovieClicked

    override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("movie_name", this.movieName)
      return result
    }
  }

  companion object {
    fun actionMovieClicked(movieName: String): NavDirections = ActionMovieClicked(movieName)
  }
}
