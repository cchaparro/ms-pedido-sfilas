package com.sfilas.mspedidosfilas.infraestructure.controller;

import java.util.List;

import com.sfilas.mspedidosfilas.domain.Order;
import com.sfilas.mspedidosfilas.use_case.CreateOrder;
import com.sfilas.mspedidosfilas.use_case.GetAllOrder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/api/order")
public class OrderController {

    private final CreateOrder createOrder;

    private final GetAllOrder getAllOrder;

    @GetMapping(value = "/all")
    public List<Order> getAll() {
        return getAllOrder.getAllOder();
    }

    @ApiOperation(value = "Acá nombramos la operación", notes = "Podemos incluir una descripción más detallada que será útil al cliente")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK. El recurso se obtiene correctamente", response = Order.class),
            @ApiResponse(code = 400, message = "Bad Request.Esta vez cambiamos el tipo de dato de la respuesta (String)", response = Order.class),
            @ApiResponse(code = 500, message = "Error inesperado del") })
    @PostMapping(value = "/create")
    public Order createAccount(@RequestBody Order order) {
        return createOrder.createOrder(order);
    }

}
