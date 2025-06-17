//package xyz.journalapp.kafkaconsumerproducer.consumer;
//
//
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RestController;
//
//@Service
//public class Consumer {
//
//    @KafkaListener(topics = {"fruits"},groupId = "test")
//    public void consumeMessage(String message){
//        System.out.println(message);
//    }
//}
