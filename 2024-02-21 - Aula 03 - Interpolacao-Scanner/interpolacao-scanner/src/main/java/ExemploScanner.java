import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        //String nome = "Patrick";
        //String nome2 = new String("Patrick");

        Scanner input = new Scanner(System.in);
        Scanner inputLine = new Scanner(System.in);

        System.out.println("Olá, qual seu nome:");
        String nomeCompleto = inputLine.nextLine();

        System.out.println("Qual a sua idade:");
        Integer idade = input.nextInt();

        System.out.println("Qual sua área de trabalho");
        String trabalho = inputLine.nextLine();

        System.out.println("Qual seu salario");
        Double salario = input.nextDouble();

        //System.out.printf("""
        //        Seu nome é %s
        //        Sua idade é %d
        //        Sua área de trabalho é %s%n""", nomeCompleto, idade, trabalho);

        System.out.println("""
                Seu nome é %s
                Sua idade é %d
                Sua área de trabalho é %s
                Seu salário real é %.2f""".formatted(nomeCompleto, idade, trabalho, salario));

        input.close();
        inputLine.close();
    }
}
