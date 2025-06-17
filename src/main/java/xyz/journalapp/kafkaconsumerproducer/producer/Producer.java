//package xyz.journalapp.kafkaconsumerproducer.producer;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class Producer {
//    @Autowired
//    private KafkaTemplate kafkaTemplate;
//
//    @GetMapping("/send")
//    public void sendMessage(@RequestParam String message){
//        kafkaTemplate.send("fruits", message);
//    }
//
//}
