package ru.daniel.kafkainitial.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @KafkaListener(topics = "rest-api", groupId = "my_consumer")
    public void listen(ConsumerRecord<String, String> record) {
        System.out.println("Topic: " + record.topic() + "\n" + "Received message: " + record.value());
    }
}
