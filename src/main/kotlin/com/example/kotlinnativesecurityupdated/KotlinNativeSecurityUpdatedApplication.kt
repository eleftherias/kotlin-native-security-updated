package com.example.kotlinnativesecurityupdated

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.provisioning.InMemoryUserDetailsManager
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class KotlinNativeSecurityUpdatedApplication

fun main(args: Array<String>) {
	runApplication<KotlinNativeSecurityUpdatedApplication>(*args)
}

@RestController
class BaseController {
	@GetMapping("/hello")
	fun hello(): String {
		return "Hello! Happy Tuesday!"
	}

	@GetMapping("/talk/info")
	fun info(): String {
		return "Turning Kotlin Applications into Secure Native Executables on August 17, 2021."
	}
}

@EnableWebSecurity
class SecurityConfig {
	@Bean
	fun users(): UserDetailsService {
		return InMemoryUserDetailsManager(
			User.withUsername("user")
				.password("{bcrypt}\$2a\$10\$CvFWWoyao/V1zk1c14/M7OwUOymy3lT7eXTCu6w4ERT7OHrpOYtDq")
				.roles("USER")
				.build()
		)
	}
}
