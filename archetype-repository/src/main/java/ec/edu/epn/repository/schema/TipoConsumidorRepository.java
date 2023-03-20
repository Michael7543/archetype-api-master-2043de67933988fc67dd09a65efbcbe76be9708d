package ec.edu.epn.repository.schema;

import ec.edu.epn.model.entities.schema.TipoConsumidor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoConsumidorRepository extends JpaRepository<TipoConsumidor, Integer>{
}
