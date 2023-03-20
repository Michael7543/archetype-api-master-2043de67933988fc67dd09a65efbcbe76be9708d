package ec.edu.epn.model.mappers.schema;


import ec.edu.epn.model.dto.schema.FormaPagoDto;
import ec.edu.epn.model.entities.schema.FormaPago;
import ec.edu.epn.model.mappers.EntityMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
@Component
public interface FormaPagoMapper extends EntityMapper<FormaPagoDto, FormaPago> {

    @Override
    FormaPago toEntity(FormaPagoDto dto);

    @Override
    List<FormaPago> toEntity(List<FormaPagoDto> dtoList);

    @Override
    FormaPagoDto toDto(FormaPago entity);

    @Override
    List<FormaPagoDto> toDto(List<FormaPago> entityList);

    @Override
    Set<FormaPagoDto> toDto(Set<FormaPago> entityList);
}
