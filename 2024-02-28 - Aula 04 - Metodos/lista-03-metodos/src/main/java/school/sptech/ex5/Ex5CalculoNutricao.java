package school.sptech.ex5;

import java.util.Scanner;

public class Ex5CalculoNutricao {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Ex5CalculoNutricaoMetodos metodos = new Ex5CalculoNutricaoMetodos();

    System.out.println("Digite o peso:");
    Double peso = input.nextDouble();

    System.out.println("Digite a altura:");
    Double altura = input.nextDouble();

    metodos.calculaIMC(peso,altura);
  }
}
