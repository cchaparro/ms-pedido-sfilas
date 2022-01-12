package com.sfilas.mspedidosfilas.use_case;

import com.sfilas.mspedidosfilas.models.dao.OrderRepository;
import com.sfilas.mspedidosfilas.models.entity.Request;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class CreateOrder {

    private final OrderRepository pedidoRepository;

    public Request createOrder(Request pedido) {
        return pedidoRepository.save(pedido);
    }

}
