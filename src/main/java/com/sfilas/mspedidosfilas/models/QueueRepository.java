package com.sfilas.mspedidosfilas.models;

import java.util.List;

import com.sfilas.mspedidosfilas.infraestructure.db.entity.Queue;

public interface QueueRepository {

    public List<Queue> findAll();
    public List<Queue> findByProvider();

    public Queue save(Queue queue);

}
