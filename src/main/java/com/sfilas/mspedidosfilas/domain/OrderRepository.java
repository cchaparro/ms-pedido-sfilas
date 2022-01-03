package com.sfilas.mspedidosfilas.domain;

import java.util.List;

public interface OrderRepository {

    public Order save(Order order);

    public List<Order> findAll();

}
