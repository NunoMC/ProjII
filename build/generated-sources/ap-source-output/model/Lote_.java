package model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Linhaproduto;
import model.Produto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-14T16:11:14")
@StaticMetamodel(Lote.class)
public class Lote_ { 

    public static volatile SingularAttribute<Lote, BigDecimal> preco;
    public static volatile CollectionAttribute<Lote, Linhaproduto> linhaprodutoCollection;
    public static volatile SingularAttribute<Lote, BigInteger> qtdlixo;
    public static volatile SingularAttribute<Lote, Produto> idProduto;
    public static volatile SingularAttribute<Lote, BigDecimal> qtdcompra;
    public static volatile SingularAttribute<Lote, Date> dataChegada;
    public static volatile SingularAttribute<Lote, Integer> idLote;
    public static volatile SingularAttribute<Lote, BigInteger> quantidade;

}