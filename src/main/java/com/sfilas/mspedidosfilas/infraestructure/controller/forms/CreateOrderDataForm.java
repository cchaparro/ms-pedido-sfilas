package com.sfilas.mspedidosfilas.infraestructure.controller.forms;

import java.util.Calendar;

import com.sfilas.mspedidosfilas.models.entity.Request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateOrderDataForm {

    private Calendar registDate;
    private Long value;
    private String state;

    public Request toCrearPedidoDataForm() {

        return new Request(registDate, value, state);
    }

}
