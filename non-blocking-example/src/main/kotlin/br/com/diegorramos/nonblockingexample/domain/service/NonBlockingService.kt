package br.com.diegorramos.nonblockingexample.domain.service

import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class NonBlockingService {

    fun fibonacci(n: Int): Mono<Int> {
        return Mono.just(n)
            .map { calc(n) }
            .log()
    }

    private fun calc(n: Int): Int {
        if (n == 0 || n == 1) return n
        return calc(n - 1) + calc(n - 2)
    }
}