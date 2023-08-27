package br.com.diegorramos.blockingexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BlockingExampleApplication

fun main(args: Array<String>) {
	runApplication<BlockingExampleApplication>(*args)
}
