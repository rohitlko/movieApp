package com.example.android.movieapp.Repo;

import com.example.android.movieapp.service.MovieService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MovieApiModule_ProvidesMovieApiFactory implements Factory<MovieService> {
  private final MovieApiModule module;

  private final Provider<Retrofit> retrofitProvider;

  public MovieApiModule_ProvidesMovieApiFactory(MovieApiModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public MovieService get() {
    return providesMovieApi(module, retrofitProvider.get());
  }

  public static MovieApiModule_ProvidesMovieApiFactory create(MovieApiModule module,
      Provider<Retrofit> retrofitProvider) {
    return new MovieApiModule_ProvidesMovieApiFactory(module, retrofitProvider);
  }

  public static MovieService providesMovieApi(MovieApiModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNull(instance.providesMovieApi(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
