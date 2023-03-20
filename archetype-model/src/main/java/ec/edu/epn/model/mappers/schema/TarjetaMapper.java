package ec.edu.epn.model.mappers.schema;

import ec.edu.epn.model.dto.schema.TarjetaDto;
import ec.edu.epn.model.entities.schema.Tarjeta;
import ec.edu.epn.model.mappers.EntityMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
@Component
public interface TarjetaMapper extends EntityMapper<TarjetaDto, Tarjeta> {

    @Override
    Tarjeta toEntity(TarjetaDto dto);

    @Override
    List<Tarjeta> toEntity(List<TarjetaDto> dtoList);

    @Override
    TarjetaDto toDto(Tarjeta entity);

    @Override
    List<TarjetaDto> toDto(List<Tarjeta> entityList);

    @Override
    Set<TarjetaDto> toDto(Set<Tarjeta> entityList);
}
