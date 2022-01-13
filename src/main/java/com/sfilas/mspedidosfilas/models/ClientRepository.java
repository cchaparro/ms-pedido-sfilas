package com.sfilas.mspedidosfilas.models;

import java.util.List;

import com.sfilas.mspedidosfilas.infraestructure.db.entity.Client;

public interface ClientRepository {

    public List<Client> findAll();

    public Client save(Client client);

}
