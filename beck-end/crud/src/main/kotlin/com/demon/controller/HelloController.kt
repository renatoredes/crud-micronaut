package com.demon.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

/**
 * Exemplo controller
 */
@Controller("/hello")
class HelloController {
    @Get
    fun hello(): String{
        return "Hello Word!"
    }
}