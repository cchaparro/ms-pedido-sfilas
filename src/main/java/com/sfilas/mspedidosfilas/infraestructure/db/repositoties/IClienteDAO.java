package com.sfilas.mspedidosfilas.infraestructure.db.repositoties;

import com.sfilas.mspedidosfilas.infraestructure.db.entity.Client;
import com.sfilas.mspedidosfilas.models.ClientRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteDAO extends CrudRepository<Client, Long>, ClientRepository {

}
 