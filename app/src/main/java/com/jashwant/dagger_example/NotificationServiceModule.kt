package com.jashwant.dagger_example

import dagger.Module
import dagger.Provides


@Module
class NotificationServiceModule {

    @Provides
    fun getMessageService(): NotificationService{
        return MessageService()
    }
}