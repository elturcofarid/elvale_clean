package com.onlysystem.elvale.fiado.infrastructure.repository;

import java.util.UUID;
import org.springframework.stereotype.Repository;
import com.onlysystem.elvale.fiado.domain.model.Fiado;
import com.onlysystem.elvale.fiado.domain.repository.IFiadoRepository;
import com.onlysystem.elvale.fiado.infrastructure.mapper.FiadoMapper;
import com.onlysystem.elvale.fiado.infrastructure.persistence.FiadoDocument;

@Repository
public class FiadoRepository implements IFiadoRepository {
    
    private final MongoFiadoRepository mongoRepository;

    public FiadoRepository(MongoFiadoRepository mongoRepository) {
        this.mongoRepository = mongoRepository;
    }

    @Override
    public void crearFiado(Fiado Fiado) {
        FiadoDocument fiadoDocument = FiadoMapper.toDocument(Fiado);
        mongoRepository.save(fiadoDocument);
    }

    @Override
    public Fiado obtenerFiado(UUID id) {
        FiadoDocument fiadoDocument = mongoRepository.findById(id).orElse(null);
        if (fiadoDocument == null) {
            return null;
        }
        return FiadoMapper.toDomain(fiadoDocument);
    }
}