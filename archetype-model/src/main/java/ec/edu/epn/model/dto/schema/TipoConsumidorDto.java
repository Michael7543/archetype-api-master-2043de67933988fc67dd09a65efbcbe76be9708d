package ec.edu.epn.model.dto.schema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoConsumidorDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer idTipoConsumidor;
    private String nombreTconsumidor;
    private String descTconsumidor;
    private String estadoTconsumidor;
    private Date fechaTconsumidor;
    private int idUsuarioTconsumidor;
}
