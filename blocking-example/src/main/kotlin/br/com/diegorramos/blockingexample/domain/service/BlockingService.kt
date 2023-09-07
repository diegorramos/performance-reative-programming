package br.com.diegorramos.blockingexample.domain.service

import org.springframework.stereotype.Service

@Service
class BlockingService {

    fun fibonacci(number: Int): Int {
        return if (number == 0 || number == 1) number
        else fibonacci(number - 1) + fibonacci(number - 2)
    }
}