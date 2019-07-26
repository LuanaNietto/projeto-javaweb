package com.luana.lavanderia.resources;

import com.luana.lavanderia.models.Item;
import com.luana.lavanderia.service.AbstractService;
import com.luana.lavanderia.service.ItemService;

import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("/itens")
public class ItemResource extends AbstractResource<Item> {

    @Inject
    private ItemService service;

    @Override
    protected AbstractService<Item> getService() {
        return service;
    }

}
