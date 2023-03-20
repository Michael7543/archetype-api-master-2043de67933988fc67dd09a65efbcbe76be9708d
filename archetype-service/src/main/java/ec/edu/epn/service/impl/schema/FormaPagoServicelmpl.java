package ec.edu.epn.service.impl.schema;



import ec.edu.epn.model.dto.schema.FormaPagoDto;
import ec.edu.epn.model.mappers.schema.FormaPagoMapper;
import ec.edu.epn.repository.schema.FormaPagoRepository;
import ec.edu.epn.service.service.schema.FormaPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
    public class FormaPagoServicelmpl implements FormaPagoService {


    @Autowired
    private FormaPagoRepository repository;

    @Autowired
    private FormaPagoMapper mapper;


    @Override
    public FormaPagoDto create(FormaPagoDto obj) {
        return mapper.toDto(repository.save(mapper.toEntity(obj)));
    }

    @Override
    public List<FormaPagoDto> findAll() {
        return mapper.toDto(repository.findAll());
    }

    @Override
    public FormaPagoDto findById(Integer id) {
        return mapper.toDto(repository.findById(id).isPresent() ? repository.findById(id).get() : null);
    }

    @Override
    public boolean delete(Integer id) {
        repository.deleteById(id);
        return repository.findById(id).isPresent();
    }
    }

