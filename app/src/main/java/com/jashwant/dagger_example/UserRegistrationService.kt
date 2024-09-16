package com.jashwant.dagger_example

class UserRegistrationService(private val userRepository: UserRepository,
                              private val emailService: EmailService
) {

    fun registerUser(email:String,password:String){
        userRepository.saveUser(email,password)
        emailService.send("jashwant999@gmail.com","user registered")
    }
}