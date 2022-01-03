package com.sfilas.mspedidosfilas.use_case;

import com.sfilas.mspedidosfilas.domain.Order;
import com.sfilas.mspedidosfilas.domain.OrderRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class CreateOrder {

    private final OrderRepository pedidoRepository;

    public Order createOrder(Order pedido) {
        return pedidoRepository.save(pedido);
    }

}
