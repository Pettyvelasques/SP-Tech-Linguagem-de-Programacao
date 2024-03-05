package school.sptech.ex2;

import java.util.Scanner;

public class Ex2CalculoAluno {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Ex2CalculoAlunoMetodos metodos = new Ex2CalculoAlunoMetodos();

    System.out.println("Digite a nota 1:");
    Double nota1 = input.nextDouble();

    System.out.println("Digite a nota 2:");
    Double nota2 = input.nextDouble();

    Double media = metodos.calcularMedia(nota1, nota2);
    System.out.println("""
            
            Média: %.2f""".formatted(media));
  }
}
