package com.sfilas.mspedidosfilas.infraestructure.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.sfilas.mspedidosfilas.infraestructure.controller.forms.ApiError;
import com.sfilas.mspedidosfilas.infraestructure.db.entity.Client;
import com.sfilas.mspedidosfilas.use_case.ClientServices;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/api/client")
public class ClienteController {
    @Autowired
    private ClientServices clientServices;

    public ClienteController(ClientServices clientServices) {
        this.clientServices = clientServices;
    }

    @ApiOperation(value = "Acá nombramos la operación", notes = "Podemos incluir una descripción más detallada que será útil al cliente")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK. El recurso se obtiene correctamente", response = ArrayList.class),
            @ApiResponse(code = 400, message = "Bad Request.Esta vez cambiamos el tipo de dato de la respuesta (String)", response = ArrayList.class),
            @ApiResponse(code = 500, message = "Error inesperado del") })
    @GetMapping(value = "/get-all")

    ResponseEntity<List<Client>> createAccount() {
        return new ResponseEntity<>(clientServices.getAllClient(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(value = "Crearun nuevo cliente", notes = "Apis que crea un clinte en la base datos")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK. El recurso se obtiene correctamente", response = Client.class),
            @ApiResponse(code = 400, message = "Bad Request", response = ApiError.class),
            @ApiResponse(code = 500, message = "Error inesperado del servidor") })
    public ResponseEntity<Client> create(@RequestBody @Valid Client client) {

        return ResponseEntity.status(HttpStatus.CREATED).body(clientServices.save(client));
    }

}
