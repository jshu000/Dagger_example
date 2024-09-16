package com.jashwant.dagger_example

import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    private val notificationService: NotificationService
) {

    fun registerUser(email:String,password:String){
        userRepository.saveUser(email,password)
        notificationService.send(email,"jashwant999@gmail.com","user registered")
    }
}