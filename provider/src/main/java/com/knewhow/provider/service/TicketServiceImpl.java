package com.knewhow.provider.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

@DubboService
@Component
public class TicketServiceImpl implements TicketService{

    @Override
    public String buyTicket() {
        return "This is my ticket";
    }
    
}
