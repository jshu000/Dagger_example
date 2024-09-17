package com.jashwant.dagger_example

import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules =[UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {

/*    fun getUserRegistrationService() : UserRegistrationService

    fun getEmailService(): EmailService
    */
    fun inject(mainActivity: MainActivity)


    @Component.Factory
    interface Factory{
        fun create(@BindsInstance retryCount:Int):UserRegistrationComponent
    }

}