package ec.edu.epn.model.mappers.schema;



import ec.edu.epn.model.dto.schema.TipoConceptoDto;
import ec.edu.epn.model.entities.schema.TipoConcepto;
import ec.edu.epn.model.mappers.EntityMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
@Component
public interface TipoConceptoMapper extends EntityMapper<TipoConceptoDto, TipoConcepto> {

    @Override
    TipoConcepto toEntity(TipoConceptoDto dto);

    @Override
    List<TipoConcepto> toEntity(List<TipoConceptoDto> dtoList);

    @Override
    TipoConceptoDto toDto(TipoConcepto entity);

    @Override
    List<TipoConceptoDto> toDto(List<TipoConcepto> entityList);

    @Override
    Set<TipoConceptoDto> toDto(Set<TipoConcepto> entityList);

}
