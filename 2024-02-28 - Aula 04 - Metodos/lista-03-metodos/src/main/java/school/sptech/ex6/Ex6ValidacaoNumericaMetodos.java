package school.sptech.ex6;

public class Ex6ValidacaoNumericaMetodos {
  // Coloque os métodos aqui
    void verificarPrimo(Integer numero){
        Integer divisores = 0;
        for (Integer i=1 ; i<=numero ; i++){
            if(numero % i == 0){
                divisores++;
                //System.out.println("""
                //        %d %% %d = 0""".formatted(numero, i));
            }
        }
        if (divisores.equals(2) || numero.equals(0)){
            System.out.println("É primo");
        }
        else{
            System.out.println("Não é primo");
        }
    }
}
