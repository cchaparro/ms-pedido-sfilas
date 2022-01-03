package com.sfilas.mspedidosfilas.infraestructure.controller.forms;

import java.util.Calendar;


import com.sfilas.mspedidosfilas.domain.Order;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateOrderDataForm {

    private Calendar registDate;
    private Long value;
    private String state;

    public Order toCrearPedidoDataForm() {

        return new Order(registDate, value, state);
    }

}
