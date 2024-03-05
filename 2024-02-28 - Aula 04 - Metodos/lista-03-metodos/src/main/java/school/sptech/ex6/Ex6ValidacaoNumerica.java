package school.sptech.ex6;

import java.util.Scanner;

public class Ex6ValidacaoNumerica {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Ex6ValidacaoNumericaMetodos metodos = new Ex6ValidacaoNumericaMetodos();

    System.out.println("Digite um número:");
    Integer numero = input.nextInt();

    if (numero >= 0){
      metodos.verificarPrimo(numero);
      //System.out.println("""
      //        $s""".formatted(resultado));
      main(args);
    }else {
      System.out.println("Fim da execução");
    }
  }
}
