package ec.edu.epn.model.dto.schema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TarjetaDto {

    private static final long serialVersionUID = -8706243085863105842L;

    private Integer id_tarjeta;
    private String nombre_tarjeta;
    private String desc_tarjeta;
    private String estado_tarjeta;
    private Date fecha_tarjeta;
    private int id_usuario_tarjeta;
}
