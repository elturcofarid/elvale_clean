package com.onlysystem.elvale.cuenta.infrastructure.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.onlysystem.elvale.cuenta.domain.model.Cuenta;
import com.onlysystem.elvale.cuenta.domain.repository.ICuentaRepository;
import com.onlysystem.elvale.cuenta.infrastructure.mapper.CuentaMapper;
import com.onlysystem.elvale.cuenta.infrastructure.persistence.CuentaDocument;

@Repository
public class CuentaRepository implements ICuentaRepository {
    
    private final MongoCuentaRepository mongoRepository;

    public CuentaRepository(MongoCuentaRepository mongoRepository) {
        this.mongoRepository = mongoRepository;
    }

    @Override
    public void crearCuenta(Cuenta Cuenta) {
        CuentaDocument cuentaDocument = CuentaMapper.toDocument(Cuenta);
        mongoRepository.save(cuentaDocument);
    }

    @Override
    public Cuenta obtenerCuenta(UUID id) {
        CuentaDocument cuentaDocument = mongoRepository.findById(id).orElse(null);
        if (cuentaDocument == null) {
            return null;
        }
        return CuentaMapper.toDomain(cuentaDocument);
    }

    @Override
    public List<Cuenta> obtenerCuentaEstablecimiento(UUID id){
        List<Cuenta> cuentas = new ArrayList();
        List<CuentaDocument> cuentaDocument = mongoRepository.findByIdEstablecimiento(id);
        if (cuentaDocument == null) {
            return null;
        }   
        for (CuentaDocument cuenta : cuentaDocument) {
            cuentas.add(CuentaMapper.toDomain(cuenta));
        }
        return cuentas;
    }
}