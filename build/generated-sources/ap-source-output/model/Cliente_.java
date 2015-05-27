package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Marcacao;
import model.Venda;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-14T16:11:14")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Integer> idCliente;
    public static volatile SingularAttribute<Cliente, String> nome;
    public static volatile CollectionAttribute<Cliente, Marcacao> marcacaoCollection;
    public static volatile CollectionAttribute<Cliente, Venda> vendaCollection;
    public static volatile SingularAttribute<Cliente, String> morada;

}