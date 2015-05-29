package model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Lote;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-28T15:12:28")
@StaticMetamodel(Produto.class)
public class Produto_ { 

    public static volatile SingularAttribute<Produto, BigDecimal> preco;
    public static volatile SingularAttribute<Produto, Integer> idProduto;
    public static volatile CollectionAttribute<Produto, Lote> loteCollection;
    public static volatile SingularAttribute<Produto, String> descricao;

}