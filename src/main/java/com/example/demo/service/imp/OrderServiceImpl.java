package com.example.demo.service.imp;

import com.example.demo.model.Order;
import com.example.demo.repo.OrderRepository;
import com.example.demo.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl( OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    @Override
    public List<Order> getOrdersByUserEmail(String email) {
        return orderRepository.findOrdersByUserEmail(email);
    }

}
