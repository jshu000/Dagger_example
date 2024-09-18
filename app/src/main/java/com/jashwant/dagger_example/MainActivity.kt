package com.jashwant.dagger_example

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    @Inject
    lateinit var emailService: EmailService

    @Inject
    lateinit var emailService1: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        /*val component= DaggerUserRegistrationComponent.factory().create(3)
        emailService = component.getEmailService()

        val component2= DaggerUserRegistrationComponent.factory().create(3)
        emailService = component2.getEmailService()
        emailService1 = component2.getEmailService()*/

        val component =(application as UserApplication).userRegistrationComponent

        component.inject(this)
        userRegistrationService.registerUser("jashwant999@gmail.com","11111")
    }
}