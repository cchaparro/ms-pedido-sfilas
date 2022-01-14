package com.sfilas.mspedidosfilas.infraestructure.db.repositoties;

import java.util.List;

import com.sfilas.mspedidosfilas.infraestructure.db.entity.Provider;
import com.sfilas.mspedidosfilas.infraestructure.db.entity.Queue;
import com.sfilas.mspedidosfilas.models.QueueRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface IQueueDAO extends CrudRepository<Queue, Long>, QueueRepository {
    @Query("select u from queues u where u.provider.id = ?1")
    public List<Queue> findByProviderId(Provider idProvider);

}
