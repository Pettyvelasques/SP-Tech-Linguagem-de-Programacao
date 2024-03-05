package school.sptech.ex4;

import java.util.Scanner;

public class Ex4DescontoProgressivo {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Ex4DescontoProgressivoMetodos metodos = new Ex4DescontoProgressivoMetodos();

    System.out.println("Digite o valor unitário do produto:");
    Double valor = input.nextDouble();

    System.out.println("Digite a quantidade:");
    Integer quantidade = input.nextInt();

    Double valorTotal = metodos.calcularDesconto(valor, quantidade);
    metodos.exibirNotaFistal(valor, quantidade, valorTotal);
  }
}
