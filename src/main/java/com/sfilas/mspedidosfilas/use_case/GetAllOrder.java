package com.sfilas.mspedidosfilas.use_case;

import java.util.List;

import com.sfilas.mspedidosfilas.models.dao.OrderRepository;
import com.sfilas.mspedidosfilas.models.entity.Request;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor

public class GetAllOrder {

    private final OrderRepository pedidoRepository;

    public List<Request> getAllOder() {
        return pedidoRepository.findAll();
    }
}
