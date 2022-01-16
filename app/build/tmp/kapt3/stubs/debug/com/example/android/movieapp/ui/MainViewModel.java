package com.example.android.movieapp.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0014J\u0006\u0010\u001e\u001a\u00020\u001cJ\u000e\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u000bR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00188F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/example/android/movieapp/ui/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/android/movieapp/Repo/MovieRepository;", "(Lcom/example/android/movieapp/Repo/MovieRepository;)V", "_navigateToDetails", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/android/movieapp/ui/Event;", "", "_popularMoviesLiveData", "", "Lcom/example/android/movieapp/model/Movie;", "_searchFieldTextLiveData", "debouncePeriod", "", "movieLoadingStateLiveData", "Lcom/example/android/movieapp/ui/moviesList/MovieLoadingState;", "getMovieLoadingStateLiveData", "()Landroidx/lifecycle/MutableLiveData;", "moviesMediatorData", "Landroidx/lifecycle/MediatorLiveData;", "getMoviesMediatorData", "()Landroidx/lifecycle/MediatorLiveData;", "navigateToDetails", "Landroidx/lifecycle/LiveData;", "getNavigateToDetails", "()Landroidx/lifecycle/LiveData;", "getPopularMovies", "", "onCleared", "onFragmentReady", "onMovieClicked", "movie", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.android.movieapp.model.Movie>> _popularMoviesLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<java.util.List<com.example.android.movieapp.model.Movie>> moviesMediatorData = null;
    private long debouncePeriod = 500L;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.android.movieapp.ui.moviesList.MovieLoadingState> movieLoadingStateLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _searchFieldTextLiveData = null;
    private final androidx.lifecycle.MutableLiveData<com.example.android.movieapp.ui.Event<java.lang.String>> _navigateToDetails = null;
    private final com.example.android.movieapp.Repo.MovieRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<java.util.List<com.example.android.movieapp.model.Movie>> getMoviesMediatorData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.android.movieapp.ui.moviesList.MovieLoadingState> getMovieLoadingStateLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.android.movieapp.ui.Event<java.lang.String>> getNavigateToDetails() {
        return null;
    }
    
    public final void onFragmentReady() {
    }
    
    private final void getPopularMovies() {
    }
    
    public final void onMovieClicked(@org.jetbrains.annotations.NotNull()
    com.example.android.movieapp.model.Movie movie) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.android.movieapp.Repo.MovieRepository repository) {
        super();
    }
}