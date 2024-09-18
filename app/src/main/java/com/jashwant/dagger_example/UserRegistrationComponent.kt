package com.jashwant.dagger_example

import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(dependencies = , modules =[UserRepositoryModule::class, NotificationServiceModule::class,AnalyticsModule::class])
interface UserRegistrationComponent {

/*    fun getUserRegistrationService() : UserRegistrationService

    */

    fun getEmailService(): EmailService

    fun inject(mainActivity: MainActivity)


    @Component.Factory
    interface Factory{
        fun create(@BindsInstance retryCount:Int):UserRegistrationComponent
    }

}