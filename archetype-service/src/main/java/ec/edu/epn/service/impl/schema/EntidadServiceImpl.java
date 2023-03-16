package ec.edu.epn.service.impl.schema;

import ec.edu.epn.model.dto.schema.EntidadDto;
import ec.edu.epn.model.mappers.schema.EntidadMapper;
import ec.edu.epn.repository.schema.EntidadRepository;
import ec.edu.epn.service.service.schema.EntidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class EntidadServiceImpl implements EntidadService {

    @Autowired
    private EntidadRepository repository;

    @Autowired
    private EntidadMapper mapper;


    @Override
    public EntidadDto create(EntidadDto obj) {
        return mapper.toDto(repository.save(mapper.toEntity(obj)));
    }

    @Override
    public List<EntidadDto> findAll() {
        return mapper.toDto(repository.findAll());
    }

    @Override
    public EntidadDto findById(Integer id) {
        return mapper.toDto(repository.findById(id).isPresent() ? repository.findById(id).get() : null);
    }

    @Override
    public boolean delete(Integer id) {
        repository.deleteById(id);
        return repository.findById(id).isPresent();
    }
}
