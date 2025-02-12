package com.example.kotlinkafka

import org.apache.kafka.clients.producer.ProducerRecord
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class KafkaProducerService(private val kafkaTemplate: KafkaTemplate<String, String>) {

    fun produce(topic: String, key: String?, message: String) {
        kafkaTemplate.send(ProducerRecord(topic, key, message))
    }

}