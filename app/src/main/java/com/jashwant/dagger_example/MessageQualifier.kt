package com.jashwant.dagger_example

import java.lang.annotation.Documented
import java.lang.annotation.RetentionPolicy
import javax.inject.Qualifier


@Qualifier
@Documented
@Retention(AnnotationRetention.RUNTIME)
annotation class MessageQualifier()
