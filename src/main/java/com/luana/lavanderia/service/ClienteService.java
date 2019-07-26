package com.luana.lavanderia.service;

import com.luana.lavanderia.models.Cliente;
import com.luana.lavanderia.utils.GenericDao;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class ClienteService extends AbstractService<Cliente> {

    @Inject
    private GenericDao<Cliente> dao;

    @Override
    protected GenericDao<Cliente> getDao() {
        return dao;
    }
}
