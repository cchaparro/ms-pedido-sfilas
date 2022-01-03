package com.sfilas.mspedidosfilas.use_case;

import java.util.List;

import com.sfilas.mspedidosfilas.domain.Order;
import com.sfilas.mspedidosfilas.domain.OrderRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor

public class GetAllOrder {

    private final OrderRepository pedidoRepository;

    public List<Order> getAllOder() {
        return pedidoRepository.findAll();
    }
}
