package br.com.diegorramos.nonblockingexample.domain.service

import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import java.time.Duration
import java.util.UUID

@Service
class NonBlockingService {

    fun getAll(): Mono<String> {
        return Mono.just(UUID.randomUUID().toString())
            .map { id -> "{ 'id':$id }" }
            .delayElement(Duration.ofSeconds(1))
            .log()
    }
}