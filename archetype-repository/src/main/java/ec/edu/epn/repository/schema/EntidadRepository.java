package ec.edu.epn.repository.schema;


import ec.edu.epn.model.entities.schema.Entidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EntidadRepository extends JpaRepository<Entidad, Integer> {

}
