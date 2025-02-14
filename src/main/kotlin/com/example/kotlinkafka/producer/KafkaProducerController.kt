package com.example.kotlinkafka.producer

import com.example.kotlinkafka.KafkaProducerService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class KafkaProducerController(private val kafkaProducerService: KafkaProducerService) {

    @PostMapping("/send")
    fun send(@RequestBody message: MessageRequest) {
        kafkaProducerService.send(message)
    }

}