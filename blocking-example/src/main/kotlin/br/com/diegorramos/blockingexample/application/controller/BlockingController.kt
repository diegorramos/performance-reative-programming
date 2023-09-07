package br.com.diegorramos.blockingexample.application.controller

import br.com.diegorramos.blockingexample.domain.service.BlockingService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class BlockingController(val service: BlockingService) {

    @GetMapping("/fibonacci/{number}")
    fun fibonacci(@PathVariable number: Int): Int {
        return service.fibonacci(number)
    }
}