package br.com.diegorramos.nonblockingexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NonBlockingExampleApplication

fun main(args: Array<String>) {
	runApplication<NonBlockingExampleApplication>(*args)
}
