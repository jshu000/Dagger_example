package com.jashwant.dagger_example

import dagger.Component


@Component
interface UserRegistrationComponent {

    fun getUserRegistrationService() : UserRegistrationService

    fun getEmailService(): EmailService

}