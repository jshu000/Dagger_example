package com.jashwant.dagger_example

import dagger.Module
import dagger.Provides


@Module
class UserRepositoryModule {

    @Provides
    fun getFirebaseRepository(): UserRepository{
        return FirebaseRepository()
    }
}