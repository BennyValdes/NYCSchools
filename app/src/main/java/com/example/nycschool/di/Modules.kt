package com.example.nycschool.di

import com.example.nycschool.model.Repository
import com.example.nycschool.model.RepositoryImpl
import com.example.nycschool.model.network.Network
import com.example.nycschool.view.viewmodel.SchoolViewModelProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object RepoModule {
    @Singleton
    @Provides
    fun providesRepository(): Repository {
        return RepositoryImpl(Network.getInstance())
    }
}

@InstallIn(ActivityComponent::class)
@Module
object ViewModelModule{
    @Provides
    fun providesVM(repository: Repository): SchoolViewModelProvider {
        return SchoolViewModelProvider(repository)
    }
}