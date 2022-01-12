package com.sfilas.mspedidosfilas.models.dao;

import java.util.List;

import com.sfilas.mspedidosfilas.models.entity.Request;

public interface OrderRepository {

    public Request save(Request order);

    public List<Request> findAll();

}
