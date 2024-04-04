package Questão1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantas maçãs deseja comprar?: ");
        int quantidadeDeMacas = sc.nextInt();

        CompradeMaca compra = new CompradeMaca(quantidadeDeMacas);

        System.out.println("O custo total da compra é: R$ "+ compra.calcularCustoTotal());

    }
}