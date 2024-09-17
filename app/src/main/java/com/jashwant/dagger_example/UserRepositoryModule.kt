package com.jashwant.dagger_example

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
abstract class UserRepositoryModule {

    @Binds
    //@Singleton
    abstract fun getSQLRepository(sqlRepository: SQLRepository): UserRepository


}