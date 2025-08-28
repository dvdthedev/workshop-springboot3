package com.dvdthedev.course.services;

import com.dvdthedev.course.entities.Order;
import com.dvdthedev.course.entities.User;
import com.dvdthedev.course.repositories.OrderRepository;
import com.dvdthedev.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj =  orderRepository.findById(id);
        System.out.println(obj.get());
        return obj.get();
    }
}
