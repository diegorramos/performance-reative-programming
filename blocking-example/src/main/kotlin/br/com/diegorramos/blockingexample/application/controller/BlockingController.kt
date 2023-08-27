package br.com.diegorramos.blockingexample.application.controller

import br.com.diegorramos.blockingexample.domain.service.BlockingService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BlockingController(val service: BlockingService) {

    @GetMapping("/customers")
    fun getAll(): String {
        return service.getAll()
    }
}