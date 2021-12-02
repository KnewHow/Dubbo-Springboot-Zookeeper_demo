package com.knewhow.consumer.service;

import com.knewhow.provider.service.TicketService;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  implements UserService {
    
    @Reference
    private TicketService ticketService;

    @Override
    public String useTicket() {
        return ticketService.buyTicket();
    }
    
}
