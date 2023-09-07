package br.com.diegorramos.nonblockingexample.domain.service

import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class NonBlockingService {

    fun fibonacci(number: Int): Mono<Int> = Mono.fromCallable { calc(number) }

    fun calc(number: Int): Int {
        return if (number == 0 || number == 1) number
        else calc(number - 1) + calc(number - 2)
    }
}