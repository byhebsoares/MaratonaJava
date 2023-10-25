package src.javacore.Kenum.test;

import src.javacore.Kenum.dominio.TipoCliente;
import src.javacore.Kenum.dominio.Cliente;
import src.javacore.Kenum.dominio.Cliente.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Hebert", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Hebert",TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
