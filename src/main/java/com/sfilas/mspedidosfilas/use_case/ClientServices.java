package com.sfilas.mspedidosfilas.use_case;

import java.util.List;

import javax.transaction.Transactional;

import com.sfilas.mspedidosfilas.infraestructure.db.entity.Client;
import com.sfilas.mspedidosfilas.models.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ClientServices {
    @Autowired
    private ClientRepository clienteDAO;

    public List<Client> getAllClient() {

        return clienteDAO.findAll();
    }

}
