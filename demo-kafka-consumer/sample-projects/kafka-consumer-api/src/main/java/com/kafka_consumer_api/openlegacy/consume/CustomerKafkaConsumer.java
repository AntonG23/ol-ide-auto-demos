package com.kafka_consumer_api.openlegacy.consume;

import com.kafka_consumer_api.openlegacy.services.CustomerService;
import com.kafka_consumer_api.openlegacy.services.CustomerServiceImpl;
import io.ol.consumer.kafka.AbstractKafkaConsumeProduceMessageProcessor;
import io.ol.core.rpc.producer.ProducerData;
import io.ol.core.rpc.consumer.NothingExceptionHandler;
import io.ol.core.rpc.consumer.ConsumerMessage;
import io.vertx.core.Vertx;
import org.springframework.stereotype.Component;

@Component
public class CustomerKafkaConsumer extends AbstractKafkaConsumeProduceMessageProcessor {

    private final CustomerService service;
    private final String returnAddress = "customerOut";

    public CustomerKafkaConsumer(Vertx vertx, CustomerServiceImpl customerService) {
        super(vertx, "customer", new NothingExceptionHandler());
        this.service = customerService;
    }

    public ProducerData process(ConsumerMessage message) throws Exception {
        CustomerService.CustomerIn serviceIn = new CustomerService.CustomerIn();
        serviceIn.populateFromJson(message.getBody());

        return new ProducerData(returnAddress, service.getCustomer(serviceIn));
    }
}
