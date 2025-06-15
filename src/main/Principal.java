
import java.util.Collections;
import java.util.Scanner;

import model.CartaoCredito;
import model.Compras;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o limite do cartão: ");
        double valorLimite = scan.nextDouble();
        CartaoCredito cartaoCredito = new CartaoCredito(valorLimite);
        scan.nextLine();

        int operacao = -1;
        while (operacao != 0){
            
            System.out.println("Digite a descrição da compra: ");
            String nomeDigitado = scan.nextLine();

            System.out.println("Digite o valor da compra: ");
            double precoDigitado = scan.nextDouble();
            scan.nextLine();

            Compras compras = new Compras(nomeDigitado, precoDigitado);
            boolean sucesso = cartaoCredito.transferir(compras); // passa a compra

            if (sucesso) {
                System.out.println("Compra realizada com sucesso!");
            } else {
                System.out.println("Saldo insuficiente!");
                break; // encerra imediatamente ao falhar
            }

            System.out.println("\nMenu:\n ");
            System.out.println("1 - para continuar");
            System.out.println("0 - para sair");
            operacao = scan.nextInt();
            scan.nextLine();

        }

        System.out.println("*******************************");
        System.out.println("COMPRAS REALIZADAS:\n");
        Collections.sort(cartaoCredito.getCompras());
        
        for (Compras lista : cartaoCredito.getCompras()) {
            System.out.println(lista);
        }

        System.out.println("*******************************");
        System.out.println("\nSaldo do cartão: " + cartaoCredito.getSaldoCartao());


        scan.close();
        
    }
}
