/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author NunoM
 */
@Entity
@Table(name = "LINHAPRODUTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Linhaproduto.findAll", query = "SELECT l FROM Linhaproduto l"),
    @NamedQuery(name = "Linhaproduto.findByQuantidade", query = "SELECT l FROM Linhaproduto l WHERE l.quantidade = :quantidade"),
    @NamedQuery(name = "Linhaproduto.findByValor", query = "SELECT l FROM Linhaproduto l WHERE l.valor = :valor"),
    @NamedQuery(name = "Linhaproduto.findByIdLinhaproduto", query = "SELECT l FROM Linhaproduto l WHERE l.idLinhaproduto = :idLinhaproduto")})
public class Linhaproduto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "QUANTIDADE")
    private BigInteger quantidade;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_LINHAPRODUTO")
    private BigDecimal idLinhaproduto;
    @JoinColumn(name = "ID_LOTE", referencedColumnName = "ID_LOTE")
    @ManyToOne(optional = false)
    private Lote idLote;
    @JoinColumn(name = "ID_VENDA", referencedColumnName = "ID_VENDA")
    @ManyToOne
    private Venda idVenda;

    public Linhaproduto() {
    }

    public Linhaproduto(BigDecimal idLinhaproduto) {
        this.idLinhaproduto = idLinhaproduto;
    }

    public Linhaproduto(BigDecimal idLinhaproduto, BigInteger quantidade, BigDecimal valor) {
        this.idLinhaproduto = idLinhaproduto;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public BigInteger getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigInteger quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getIdLinhaproduto() {
        return idLinhaproduto;
    }

    public void setIdLinhaproduto(BigDecimal idLinhaproduto) {
        this.idLinhaproduto = idLinhaproduto;
    }

    public Lote getIdLote() {
        return idLote;
    }

    public void setIdLote(Lote idLote) {
        this.idLote = idLote;
    }

    public Venda getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Venda idVenda) {
        this.idVenda = idVenda;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLinhaproduto != null ? idLinhaproduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Linhaproduto)) {
            return false;
        }
        Linhaproduto other = (Linhaproduto) object;
        if ((this.idLinhaproduto == null && other.idLinhaproduto != null) || (this.idLinhaproduto != null && !this.idLinhaproduto.equals(other.idLinhaproduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Linhaproduto[ idLinhaproduto=" + idLinhaproduto + " ]";
    }
    
}
