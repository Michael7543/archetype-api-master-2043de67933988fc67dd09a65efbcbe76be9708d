/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.epn.model.entities.schema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author AXRL
 */
@Entity
@Table(name = "forma_pago")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class FormaPago implements Serializable {
    private static final long serialVersionUID = -3041384856433697611L;
//ver como activar el serializable


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_forma_pago", nullable = false)
    private Integer idFormaPago;
    @Basic(optional = false)
    @Column(name = "nombre_fp", nullable = false, length = 2147483647)
    private String nombreFp;
    @Basic(optional = false)
    @Column(name = "codigo_sri", nullable = false, length = 2147483647)
    private String codigoSri;
    @Basic(optional = false)
    @Column(name = "activo", nullable = false, length = 2147483647)
    private String activo;
    @Basic(optional = false)
    @Column(name = "codigo_sae", nullable = false, length = 2147483647)
    private String codigoSae;
    @Basic(optional = false)
    @Column(name = "descripcion_fp", nullable = false, length = 2147483647)
    private String descripcionFp;
    @Column(name = "fecha_fp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFp;
    @Basic(optional = false)
    @Column(name = "id_usuario_fp", nullable = false)
    private int idUsuarioFp;
    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "idFormaPago", fetch = FetchType.EAGER)
    //private List<Pagos> pagosList;

}
