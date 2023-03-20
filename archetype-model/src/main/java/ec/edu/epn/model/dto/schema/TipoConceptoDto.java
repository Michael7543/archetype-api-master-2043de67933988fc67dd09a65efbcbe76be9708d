package ec.edu.epn.model.dto.schema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoConceptoDto implements Serializable {


    private static final long serialVersionUID = -694396375016514268L;

    private Integer id_tipo_concepto;
    private String nombre_tipo_concepto;
    private String desc_tipo_concepto;
    private Integer id_unidad_tc;
    private Integer prtida_nc;
    private Date fecha_tc;
}
