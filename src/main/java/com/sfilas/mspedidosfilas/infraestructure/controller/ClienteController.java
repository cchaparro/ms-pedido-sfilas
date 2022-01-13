package com.sfilas.mspedidosfilas.infraestructure.controller;

import java.util.ArrayList;
import java.util.List;

import com.sfilas.mspedidosfilas.infraestructure.db.entity.Client;
import com.sfilas.mspedidosfilas.use_case.ClientServices;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/api/client")
public class ClienteController {

    private final ClientServices clientServices;

    public ClienteController(ClientServices clientServices) {
        this.clientServices = clientServices;
    }

    @ApiOperation(value = "Acá nombramos la operación", notes = "Podemos incluir una descripción más detallada que será útil al cliente")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK. El recurso se obtiene correctamente", response = ArrayList.class),
            @ApiResponse(code = 400, message = "Bad Request.Esta vez cambiamos el tipo de dato de la respuesta (String)", response = ArrayList.class),
            @ApiResponse(code = 500, message = "Error inesperado del") })
    @GetMapping(value = "/get-all")

    List<Client> createAccount() {
        return clientServices.getAllClient();
    }

}
