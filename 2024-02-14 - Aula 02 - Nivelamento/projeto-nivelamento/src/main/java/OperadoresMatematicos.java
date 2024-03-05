public class OperadoresMatematicos {
    public static void main(String[] args) {
        //No JS:
        // + - / * %
        // ++
        // --
        // +=
        // -=
        // No Java, é a mesma coisa.
        // Menos a potência (**), esse não tem no Java

        Double num01 = 10.0;
        Double num02 = 3.0;

        System.out.println("Soma: " + (num01 + num02));
        System.out.println("Multiplicação: " + (num01 * num02));
        System.out.println("Divisão: " + (num01 / num02));
        System.out.println("Subtração: " + (num01 - num02));
        System.out.println("Resto de Divisão: " + (num01 % num02));

        Double resultadoPotencia = Math.pow(num01, num02);
        System.out.println("Potência: " + resultadoPotencia);
        System.out.println("Potência sem variavel: " + Math.pow(num01, num02));
    }
}
