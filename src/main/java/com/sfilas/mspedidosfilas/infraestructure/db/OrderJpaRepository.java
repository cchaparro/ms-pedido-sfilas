package com.sfilas.mspedidosfilas.infraestructure.db;

import com.sfilas.mspedidosfilas.domain.Order;
import com.sfilas.mspedidosfilas.domain.OrderRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderJpaRepository extends JpaRepository<Order, Long>, OrderRepository {

}
