package br.com.diegorramos.blockingexample.domain.service

import org.springframework.stereotype.Service
import java.util.*
import java.util.logging.Logger

@Service
class BlockingService {

    val log: Logger = Logger.getLogger(BlockingService::class.qualifiedName)

    fun getAll(): String {
        val id = UUID.randomUUID().toString()
        val response = " { 'id':$id } "
        Thread.sleep(1000)
        log.info("response: $response")
        return response
    }
}