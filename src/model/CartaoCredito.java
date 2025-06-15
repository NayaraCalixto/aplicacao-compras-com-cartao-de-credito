package model;

import java.util.ArrayList;
import java.util.List;

public class CartaoCredito {
    private double limite; //burrraa
    private double saldoCartao;
    private List<Compras> compras;

    public CartaoCredito(double limite) { // buraaa
        this.limite = limite;
        this.saldoCartao = limite;
        this.compras = new ArrayList<>();
    }

    public double getSaldoCartao() {
        return saldoCartao;
    }

    public double getLimite() {
        return limite;
    }

    public List<Compras> getCompras() {
        return compras;
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldoCartao);
    }
        
    public boolean transferir(Compras compra) { // burraaa
        if(this.saldoCartao >= compra.getPrecoProduto()) {
            this.saldoCartao -= compra.getPrecoProduto();
            this.compras.add(compra);
            return true;
        }  
            return false;
        }
    
}
