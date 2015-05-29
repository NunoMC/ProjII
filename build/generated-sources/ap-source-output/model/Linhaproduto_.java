package model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Lote;
import model.Venda;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-28T15:12:28")
@StaticMetamodel(Linhaproduto.class)
public class Linhaproduto_ { 

    public static volatile SingularAttribute<Linhaproduto, Integer> idLinhaproduto;
    public static volatile SingularAttribute<Linhaproduto, BigDecimal> valor;
    public static volatile SingularAttribute<Linhaproduto, BigDecimal> quantidade;
    public static volatile SingularAttribute<Linhaproduto, Lote> idLote;
    public static volatile SingularAttribute<Linhaproduto, Venda> idVenda;

}