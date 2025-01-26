package com.argaodev.desafio01.services;

import com.argaodev.desafio01.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    ShippingService shippingService;

    public Double total(Order order){
        double shipping = shippingService.shipment(order);
        double discounted = order.getBasic() * (100 - order.getDiscount()) / 100;

        return discounted + shipping;
    }

}
