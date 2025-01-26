package com.argaodev.desafio01;

import com.argaodev.desafio01.entities.Order;
import com.argaodev.desafio01.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {

    @Autowired
    private OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(Desafio01Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Order order = new Order(1309,95.90,0.0);
        double total = orderService.total(order);

        System.out.println("Pedido código " + order.getCode());
        System.out.println("Valor total: R$ " + String.format("%.2f" , total));
    }
}
