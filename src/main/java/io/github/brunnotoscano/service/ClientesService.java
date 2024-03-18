package io.github.brunnotoscano.service;

import io.github.brunnotoscano.model.Cliente;
import io.github.brunnotoscano.services.ClientesRepository;
import org.springframework.stereotype.Service;


@Service
public class ClientesService {

    private ClientesRepository repository;
    public ClientesService(ClientesRepository repository){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);

    }

    public void validarCliente(Cliente cliente){

    }
}
