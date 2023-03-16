package ec.edu.epn.model.mappers.schema;

import ec.edu.epn.model.dto.schema.EntidadDto;
import ec.edu.epn.model.entities.schema.Entidad;
import ec.edu.epn.model.mappers.EntityMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface EntidadMapper extends EntityMapper<EntidadDto, Entidad> {

    @Override
    Entidad toEntity(EntidadDto dto);

    @Override
    List<Entidad> toEntity(List<EntidadDto> dtoList);

    @Override
    EntidadDto toDto(Entidad entity);

    @Override
    List<EntidadDto> toDto(List<Entidad> entityList);

    @Override
    Set<EntidadDto> toDto(Set<Entidad> entityList);
}
