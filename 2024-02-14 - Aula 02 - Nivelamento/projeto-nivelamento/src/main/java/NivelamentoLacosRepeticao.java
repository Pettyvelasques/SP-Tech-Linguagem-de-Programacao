import java.util.concurrent.ThreadLocalRandom;

public class NivelamentoLacosRepeticao {
    public static void main(String[] args) {
//        for (int i = 0; i <= 10; i++){
//            System.out.println("Valor de i+: " + i);
//        }
//
//        for (int i = 10; i >= 0; i--){
//            System.out.println("Valor de i-: " + i);
//        }
//
//        for (Double i = 10.0; i >= 9.0; i-=0.10){
//            System.out.println("Valor de D.i-: " + i);
//        }

//        Integer numeroSorteado = 1;
//        while(numeroSorteado != 0){
//            System.out.println(numeroSorteado);
//            numeroSorteado = ThreadLocalRandom.current().nextInt(0,10);
//        }

        Integer numeroSorteadoDois;
        do {
            numeroSorteadoDois = ThreadLocalRandom.current().nextInt(0,10);
            System.out.println(numeroSorteadoDois);
        }   while (numeroSorteadoDois != 0);
    }
}
