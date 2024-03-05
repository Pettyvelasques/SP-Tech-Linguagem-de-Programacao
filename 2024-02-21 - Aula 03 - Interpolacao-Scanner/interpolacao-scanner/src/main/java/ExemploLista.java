import java.util.ArrayList;
import java.util.List;

public class ExemploLista {
    public static void main(String[] args) {

        //Métodos importantes do List
        //size()
        List listaEstranha = new ArrayList();
        listaEstranha.add("Nome");
        listaEstranha.add(12);
        listaEstranha.add(3.9);
        listaEstranha.add(false);

        System.out.println("\nLista aceita qualquer coisa (não use)");
        System.out.println(listaEstranha);



        List<String> listaStrings = new ArrayList();
        listaStrings.add("William");
        listaStrings.add("Giuliana");

        System.out.println("\nLista de String");
        System.out.println(listaStrings);


        List<Integer> listaInt = new ArrayList<>();
        listaInt.add(12);
        listaInt.add(10);

        System.out.println("\nLista de Integer");
        System.out.println(listaInt);


        System.out.println("\nExibindo os valores dentro da lista usando for");
        for (int i=0; i<listaStrings.size(); i++){
            String nomeAuxiliar = listaStrings.get(i);
            System.out.println(nomeAuxiliar);
        }


        System.out.println("\nAcessando o index 1");
        System.out.println("\n"+listaStrings.get(1));

        listaStrings.remove(1);
        listaStrings.remove(0);
        System.out.println("\n"+listaStrings);

        //if (listaStrings.size() == 0) {
        //    System.out.println("Lista vazia");
        //}
        if (listaStrings.isEmpty()) {
            System.out.println("Lista vazia");
        }

        listaStrings.add("Patrick");
        listaStrings.add("Guilherme");
        listaStrings.add("Renata");
        listaStrings.add("Julia");
        System.out.println("\nAdicionei novos membros");
        System.out.println(listaStrings);


        listaStrings.add(1,"Vitória");
        System.out.println("\nAdicionando elemento no index 1");
        System.out.println(listaStrings);

        listaStrings.set(1,"Maria");
        System.out.println("\nTrocando o valor pelo index");
        System.out.println(listaStrings);

        listaStrings.add(listaStrings.size(),"Giuliana");
        System.out.println("\nAdicionando ao final da lista");
        System.out.println(listaStrings);

        listaStrings.clear();
        System.out.println("\nLimpando toda a lista");
        System.out.println(listaStrings);

    }
}
