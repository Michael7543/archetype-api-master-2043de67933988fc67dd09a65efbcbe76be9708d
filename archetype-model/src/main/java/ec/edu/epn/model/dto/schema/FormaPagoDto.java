package ec.edu.epn.model.dto.schema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FormaPagoDto implements Serializable {


    private static final long serialVersionUID = -2032679380590855775L;
    private Integer idFormaPago;
    private String nombreFp;
    private String codigoSri;
    private String activo;
    private String codigoSae;
    private String descripcionFp;
    private Date fechaFp;


}