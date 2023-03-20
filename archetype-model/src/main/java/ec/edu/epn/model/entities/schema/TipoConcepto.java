package ec.edu.epn.model.entities.schema;

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

/**
 *
 * @author USER
 */

@Entity
@Table(name = "tipo_concepto")

public class
TipoConcepto implements Serializable {

    private static final long serialVersionUID = -2331042470231730056L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_concepto", nullable = false)
    private Integer idTipoConcepto;
    @Basic(optional = false)
    @Column(name = "nombre_tipo_concepto", nullable = false, length = 2147483647)
    private String nombreTipoConcepto;
    @Column(name = "desc_tipo_concepto", length = 2147483647)
    private String descTipoConcepto;
    @Column(name = "id_unidad_tc")
    private Integer idUnidadTc;
    @Column(name = "prtida_nc")
    private Integer prtidaNc;
    @Column(name = "fecha_tc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaTc;
    @Basic(optional = false)
    @Column(name = "id_usuario_tc", nullable = false)
    private int idUsuarioTc;
    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoConcepto", fetch = FetchType.EAGER)
    //private List<Concepto> conceptoList;

    public TipoConcepto() {
    }

    public TipoConcepto(Integer idTipoConcepto) {
        this.idTipoConcepto = idTipoConcepto;
    }

    public TipoConcepto(Integer idTipoConcepto, String nombreTipoConcepto, int idUsuarioTc) {
        this.idTipoConcepto = idTipoConcepto;
        this.nombreTipoConcepto = nombreTipoConcepto;
        this.idUsuarioTc = idUsuarioTc;
    }
//wapo maikol xDkk
    public Integer getIdTipoConcepto() {
        return idTipoConcepto;
    }

    public void setIdTipoConcepto(Integer idTipoConcepto) {
        this.idTipoConcepto = idTipoConcepto;
    }

    public String getNombreTipoConcepto() {
        return nombreTipoConcepto;
    }

    public void setNombreTipoConcepto(String nombreTipoConcepto) {
        this.nombreTipoConcepto = nombreTipoConcepto;
    }

    public String getDescTipoConcepto() {
        return descTipoConcepto;
    }

    public void setDescTipoConcepto(String descTipoConcepto) {
        this.descTipoConcepto = descTipoConcepto;
    }

    public Integer getIdUnidadTc() {
        return idUnidadTc;
    }

    public void setIdUnidadTc(Integer idUnidadTc) {
        this.idUnidadTc = idUnidadTc;
    }

    public Integer getPrtidaNc() {
        return prtidaNc;
    }

    public void setPrtidaNc(Integer prtidaNc) {
        this.prtidaNc = prtidaNc;
    }

    public Date getFechaTc() {
        return fechaTc;
    }

    public void setFechaTc(Date fechaTc) {
        this.fechaTc = fechaTc;
    }

    public int getIdUsuarioTc() {
        return idUsuarioTc;
    }

    public void setIdUsuarioTc(int idUsuarioTc) {
        this.idUsuarioTc = idUsuarioTc;
    }
/*
    public List<Concepto> getConceptoList() {
        return conceptoList;
    }

    public void setConceptoList(List<Concepto> conceptoList) {
        this.conceptoList = conceptoList;
    }
*/
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoConcepto != null ? idTipoConcepto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoConcepto)) {
            return false;
        }
        TipoConcepto other = (TipoConcepto) object;
        if ((this.idTipoConcepto == null && other.idTipoConcepto != null) || (this.idTipoConcepto != null && !this.idTipoConcepto.equals(other.idTipoConcepto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.entities.TipoConcepto[ idTipoConcepto=" + idTipoConcepto + " ]";
    }

}
