package com.jashwant.dagger_example

import dagger.Module
import dagger.Provides


@Module
class UserRepositoryModule {

    @Provides
    fun getSQLRepository(sqlRepository: SQLRepository): UserRepository{
        return sqlRepository
    }
}