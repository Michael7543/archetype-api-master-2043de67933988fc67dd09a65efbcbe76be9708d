package ec.edu.epn.service.impl.schema;


import ec.edu.epn.model.dto.schema.TipoConceptoDto;
import ec.edu.epn.model.mappers.schema.TipoConceptoMapper;
import ec.edu.epn.repository.schema.TipoConceptoRepository;
import ec.edu.epn.service.service.schema.TipoConceptoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class TipoConceptoServiceImpl implements TipoConceptoService {

    @Autowired
    private TipoConceptoRepository repository;

    @Autowired
    private TipoConceptoMapper mapper;


    @Override
    public TipoConceptoDto create(TipoConceptoDto obj) {
        return mapper.toDto(repository.save(mapper.toEntity(obj)));
    }

    @Override
    public List<TipoConceptoDto> findAll() {
        return mapper.toDto(repository.findAll());
    }

    @Override
    public TipoConceptoDto findById(Integer id) {
        return mapper.toDto(repository.findById(id).isPresent() ? repository.findById(id).get() : null);
    }

    @Override
    public boolean delete(Integer id) {
        repository.deleteById(id);
        return repository.findById(id).isPresent();
    }

}
