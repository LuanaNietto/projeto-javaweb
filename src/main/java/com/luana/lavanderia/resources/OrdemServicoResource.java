package com.luana.lavanderia.resources;

import com.luana.lavanderia.models.OrdemServico;
import com.luana.lavanderia.service.AbstractService;
import com.luana.lavanderia.service.OrdemServicoService;

import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("/ordens")
public class OrdemServicoResource extends AbstractResource<OrdemServico> {

    @Inject
    private OrdemServicoService service;

    @Override
    protected AbstractService<OrdemServico> getService() {
        return service;
    }

}
