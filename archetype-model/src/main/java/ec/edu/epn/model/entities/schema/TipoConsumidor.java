package ec.edu.epn.model.entities.schema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tipo_consumidor", catalog = "tipo_consumidor", schema = "facturacion")
public class TipoConsumidor implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_consumidor", nullable = false)
    private Integer idTipoConsumidor;

    @Basic(optional = false)
    @Column(name = "nombre_tconsumidor", nullable = false, length = 2147483647)
    private String nombreTconsumidor;

    @Column(name = "desc_tconsumidor", length = 2147483647)
    private String descTconsumidor;

    @Basic(optional = false)
    @Column(name = "estado_tconsumidor", nullable = false, length = 2147483647)
    private String estadoTconsumidor;

    @Column(name = "fecha_tconsumidor")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaTconsumidor;

    @Basic(optional = false)
    @Column(name = "id_usuario_tconsumidor", nullable = false)
    private int idUsuarioTconsumidor;
}
