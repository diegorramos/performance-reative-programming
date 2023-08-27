package br.com.diegorramos.nonblockingexample.application.controller

import br.com.diegorramos.nonblockingexample.domain.service.NonBlockingService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class NonBlockingController(val service: NonBlockingService) {

    @GetMapping("/customers")
    fun getAll(): Mono<String> {
        return service.getAll()
    }
}