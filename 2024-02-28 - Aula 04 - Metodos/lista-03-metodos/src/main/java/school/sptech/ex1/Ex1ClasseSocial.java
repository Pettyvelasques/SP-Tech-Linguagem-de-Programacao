package school.sptech.ex1;

import java.util.Scanner;

public class Ex1ClasseSocial {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Ex1ClasseSocialMetodos metodos = new Ex1ClasseSocialMetodos();

    System.out.println("Digite sua renda:");
    Double renda = input.nextDouble();
    Double salariosMinimos = metodos.calcularQtdSalariosMinimos(renda);
    String classeSocial = metodos.classeSocial(salariosMinimos);

    System.out.println("""
            
            Você recebe aproximadamente %.1f salários-mínimos
            Você pertence a classe social: %s""".formatted(salariosMinimos, classeSocial));

  }
}
