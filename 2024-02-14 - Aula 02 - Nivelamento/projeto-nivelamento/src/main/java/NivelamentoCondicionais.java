import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class NivelamentoCondicionais {
    public static void main(String[] args) {
        Integer numero01 = 10;
        Integer numero02 = 1;

        if(numero01 > numero02){
            System.out.println("Variável numero01 é maior que numero02");
        } else if (numero01.equals(numero02)) {
            System.out.println("As variaveis possuem valores iguais");
        }
        else {
            System.out.println("Variável numero01 é menor que numero02");
        };

        String nome01 = "Patrick";
        String nome02 = "Velasques";

        if (nome01.equals(nome02)) {
            System.out.println("Nomes iguais");
        }
        else {
            System.out.println("Nomes diferentes");
        }

        System.out.println(nome01.length());

        Boolean booleano = numero01.equals(numero02);
        if(booleano) {
            System.out.println("true");
        } else if (!booleano){
            System.out.println("false");
        }

        ThreadLocalRandom randomico = ThreadLocalRandom.current();

        Integer numeroRandomico = randomico.nextInt(9, 10);
        Double numeroRandomico2 = ThreadLocalRandom.current().nextDouble(9, 10);

        System.out.println(numeroRandomico);
        System.out.println(numeroRandomico2);
    }
}
