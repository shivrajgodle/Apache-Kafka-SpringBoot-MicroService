package com.shivraj.cabbookdriver.config;

import com.shivraj.cabbookdriver.constant.AppConstant;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

@Configurable
public class KafkaConfig {

    @Bean
    public NewTopic topic(){
        return TopicBuilder.name(AppConstant.CAB_LOCATION).build();
    }

}
