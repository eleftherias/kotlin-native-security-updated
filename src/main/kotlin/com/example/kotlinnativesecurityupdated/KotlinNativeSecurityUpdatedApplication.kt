package com.example.kotlinnativesecurityupdated

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
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
