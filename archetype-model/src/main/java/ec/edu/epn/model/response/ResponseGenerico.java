package ec.edu.epn.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * ResponseGenerico class
 *
 * @version $Revision: 1 $
 */
@Data
@AllArgsConstructor
public class ResponseGenerico<T> implements Serializable {

    private String codigoRespuestaName;
    private int codigoRespuestaValue;
    private String mensaje;
    private T objeto;
    private List<T> listado;
    private Long totalRegistros;

    public ResponseGenerico() {
    }
}
