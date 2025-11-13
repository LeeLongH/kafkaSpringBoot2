package com.kafkaSpringBoot2.demo.consumer;


import com.kafkaSpringBoot2.demo.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    //@KafkaListener(topics = "secondKafka", groupId = "myGroup")
    public void consumer(String msg) {
        log.info("consuming msg from {}", msg);
    }

    @KafkaListener(topics = "secondKafka", groupId = "myGroup")
    public void consumerJsonMsg(Student student) {
        log.info("consuming msg from {}", student.toString());
    }
}
