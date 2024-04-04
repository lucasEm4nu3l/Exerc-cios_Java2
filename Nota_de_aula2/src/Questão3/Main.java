package Questão3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os comprimentos dos três lados do triângulo:");
        System.out.print("Lado 1: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Lado 2: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Lado 3: ");
        double lado3 = scanner.nextDouble();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        if (triangulo.formaTriangulo()) {
            System.out.println("Os lados formam um triângulo do tipo: " + triangulo.tipoTriangulo());
        } else {
            System.out.println("Os lados não formam um triângulo.");
        }
    }
}
