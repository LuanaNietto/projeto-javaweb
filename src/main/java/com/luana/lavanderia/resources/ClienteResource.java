package com.luana.lavanderia.resources;

import com.luana.lavanderia.models.Cliente;
import com.luana.lavanderia.service.AbstractService;
import com.luana.lavanderia.service.ClienteService;

import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("/clientes")
public class ClienteResource extends AbstractResource<Cliente> {

    @Inject
    private ClienteService service;

    @Override
    protected AbstractService<Cliente> getService() {
        return service;
    }

}
