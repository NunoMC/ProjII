package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Cliente;
import model.Funcionario;
import model.Linhaproduto;
import model.VendaMarc;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-28T15:12:28")
@StaticMetamodel(Venda.class)
public class Venda_ { 

    public static volatile CollectionAttribute<Venda, Linhaproduto> linhaprodutoCollection;
    public static volatile SingularAttribute<Venda, Date> dataVenda;
    public static volatile SingularAttribute<Venda, Cliente> idCliente;
    public static volatile SingularAttribute<Venda, Double> prcramo;
    public static volatile SingularAttribute<Venda, Funcionario> idFuncionario;
    public static volatile SingularAttribute<Venda, Double> precoTotal;
    public static volatile CollectionAttribute<Venda, VendaMarc> vendaMarcCollection;
    public static volatile SingularAttribute<Venda, Integer> idVenda;
    public static volatile SingularAttribute<Venda, Double> valorServico;

}