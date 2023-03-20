package ec.edu.epn.service.impl.schema;

import ec.edu.epn.model.dto.schema.TipoConsumidorDto;
import ec.edu.epn.model.mappers.schema.TipoConsumidorMapper;


import ec.edu.epn.repository.schema.TipoConsumidorRepository;
import ec.edu.epn.service.service.schema.TipoConsumidorService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class TipoConsumidorServiceImpl implements TipoConsumidorService {

    @Autowired
    private TipoConsumidorRepository repository;
    @Autowired
    private TipoConsumidorMapper mapper;


    @Override
    public TipoConsumidorDto create(TipoConsumidorDto obj) {
        return mapper.toDto(repository.save(mapper.toEntity(obj)));
    }

    @Override
    public List<TipoConsumidorDto> findAll() {
        return mapper.toDto(repository.findAll());
    }

    @Override
    public TipoConsumidorDto findById(Integer id) {
        return mapper.toDto(repository.findById(id).isPresent() ? repository.findById(id).get() : null);
    }

    @Override
    public boolean delete(Integer id) {
        repository.deleteById(id);
        return repository.findById(id).isPresent();
    }
}
