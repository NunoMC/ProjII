package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Cliente;
import model.Funcionario;
import model.VendaMarc;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-28T15:12:28")
@StaticMetamodel(Marcacao.class)
public class Marcacao_ { 

    public static volatile SingularAttribute<Marcacao, Cliente> idCliente;
    public static volatile SingularAttribute<Marcacao, Integer> idMarcacao;
    public static volatile SingularAttribute<Marcacao, Funcionario> idFuncionario;
    public static volatile CollectionAttribute<Marcacao, VendaMarc> vendaMarcCollection;
    public static volatile SingularAttribute<Marcacao, Date> dataMarcacao;
    public static volatile SingularAttribute<Marcacao, String> local;
    public static volatile SingularAttribute<Marcacao, String> descricao;
    public static volatile SingularAttribute<Marcacao, Date> dataServico;

}