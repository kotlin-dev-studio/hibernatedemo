package com.hlk.hibernatedemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HibernatedemoApplication

fun main(args: Array<String>) {
    runApplication<HibernatedemoApplication>(*args)
}
