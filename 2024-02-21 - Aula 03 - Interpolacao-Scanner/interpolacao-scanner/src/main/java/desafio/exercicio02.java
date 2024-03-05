package desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Integer> listaInt = new ArrayList();

        System.out.println("Insira o primeiro número:");
        listaInt.add(input.nextInt());
        System.out.println("Insira o segundo número:");
        listaInt.add(input.nextInt());
        System.out.println("Insira o terceiro número:");
        listaInt.add(input.nextInt());

        System.out.println(listaInt);
        for (int i=listaInt.size()-1; i>0;i--){
            if(listaInt.get(i) % 2 == 0){
                listaInt.remove(i);
            }
        }
        System.out.println("Após a remoção dos index pares, sua lista ficou da seguinte forma");
        System.out.println(listaInt);

        input.close();
    }
}
