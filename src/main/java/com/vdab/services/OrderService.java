package com.vdab.services;

import com.vdab.domain.OrderArticle;
import com.vdab.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public void buyArticle(OrderArticle newBoughtArticle) {
        orderRepository.buyArticle(newBoughtArticle);
    }

    public List<OrderArticle> getOrderedArticles() {
        return orderRepository.getOrderedArticles();
    }

    public OrderArticle findOrderArticleById(long id){
        return orderRepository.findOrderArticleById(id);
    }

    public void deleteItem(long id) {
        orderRepository.deleteItem(id);
    }

    public void updateShoppingItem(OrderArticle orderArticle) {
        orderRepository.updateShoppingItem(orderArticle);
    }

    public void deleteQueryDb() {
       orderRepository.deleteQueryDb();
    }
}


