package model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Marcacao;
import model.Venda;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-14T16:11:14")
@StaticMetamodel(VendaMarc.class)
public class VendaMarc_ { 

    public static volatile SingularAttribute<VendaMarc, Marcacao> idMarcacao;
    public static volatile SingularAttribute<VendaMarc, BigDecimal> idVendamarc;
    public static volatile SingularAttribute<VendaMarc, Venda> idVenda;

}