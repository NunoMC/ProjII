package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Marcacao;
import model.Venda;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-14T16:11:14")
@StaticMetamodel(Funcionario.class)
public class Funcionario_ { 

    public static volatile SingularAttribute<Funcionario, String> nome;
    public static volatile SingularAttribute<Funcionario, Integer> idFuncionario;
    public static volatile CollectionAttribute<Funcionario, Marcacao> marcacaoCollection;
    public static volatile CollectionAttribute<Funcionario, Venda> vendaCollection;

}