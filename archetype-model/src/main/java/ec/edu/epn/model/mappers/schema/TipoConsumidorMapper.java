package ec.edu.epn.model.mappers.schema;

import ec.edu.epn.model.dto.schema.TipoConsumidorDto;
import ec.edu.epn.model.entities.schema.TipoConsumidor;
import ec.edu.epn.model.mappers.EntityMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;


@Mapper(componentModel = "spring")
@Component
public interface TipoConsumidorMapper extends EntityMapper<TipoConsumidorDto, TipoConsumidor> {
    @Override
    TipoConsumidor toEntity(TipoConsumidorDto dto);

    @Override
    List<TipoConsumidor> toEntity(List<TipoConsumidorDto> dtoList);

    @Override
    TipoConsumidorDto toDto(TipoConsumidor entity);

    @Override
    List<TipoConsumidorDto> toDto(List<TipoConsumidor> entityList);

    @Override
    Set<TipoConsumidorDto> toDto(Set<TipoConsumidor> entityList);
}
