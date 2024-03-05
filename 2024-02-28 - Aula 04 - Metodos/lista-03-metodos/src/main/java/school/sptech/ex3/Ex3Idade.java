package school.sptech.ex3;

import java.util.Scanner;

public class Ex3Idade {

  public static void main(String[] args) {
    Scanner inputLine = new Scanner(System.in);
    Ex3IdadeMetodos metodos = new Ex3IdadeMetodos();

    System.out.println("Digite a idade:");
    Integer idade = inputLine.nextInt();
  }
}
