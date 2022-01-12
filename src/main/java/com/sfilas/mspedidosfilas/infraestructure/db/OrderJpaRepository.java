package com.sfilas.mspedidosfilas.infraestructure.db;

import com.sfilas.mspedidosfilas.models.dao.OrderRepository;
import com.sfilas.mspedidosfilas.models.entity.Request;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderJpaRepository extends JpaRepository<Request, Long>, OrderRepository {

}
