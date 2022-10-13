package com.iuh.SpringBootActiveMQPractice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class SendService {
    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendName(String name) {
        jmsTemplate.convertAndSend("youtube",name);
    }
}
