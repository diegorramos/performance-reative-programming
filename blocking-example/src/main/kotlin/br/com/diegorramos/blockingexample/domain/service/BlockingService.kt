package br.com.diegorramos.blockingexample.domain.service

import org.springframework.stereotype.Service
import java.util.logging.Logger

@Service
class BlockingService {

    val log: Logger = Logger.getLogger(BlockingService::class.qualifiedName)

    fun fibonacci(n: Int): Int {
        if (n == 0 || n == 1) return n
        val result = fibonacci(n - 1) + fibonacci(n - 2)
        log.info("fibonacci. result=$result")
        return result
    }
}