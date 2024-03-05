package desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Integer> listaInt = new ArrayList();

        System.out.println("Insira o primeiro número:");
        listaInt.add(input.nextInt());
        System.out.println("Insira o segundo número:");
        listaInt.add(input.nextInt());
        System.out.println("Insira o terceiro número:");
        listaInt.add(input.nextInt());

        Integer somaLista = 0;
        for (int i=0; i<listaInt.size();i++){
            somaLista += listaInt.get(i);
        }
        System.out.println("Sua lista está da seguinte forma");
        System.out.println(listaInt);
        System.out.println("\nA soma dos números da lista é");
        System.out.println(somaLista);

        input.close();
    }
}
