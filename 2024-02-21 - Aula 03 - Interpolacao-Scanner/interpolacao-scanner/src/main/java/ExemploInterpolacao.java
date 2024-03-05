public class ExemploInterpolacao {
    public static void main(String[] args) {
        String nome = "Patrick Velasques";
        Double altura = 1.86;
        Integer idade = 30;
        String nomePet = "Loki";

        // Na interpolacao usamosEstrela
        // %s para stringEstrela
        // %d para inteiros
        // %.2f para double (2 repreenta a quantidade de casas decimais)
        // %b para booleano
        String fraseFormatada = String.format(
                """
                Meu nome é: %s
                Minha idade é: %d
                Minha altura é: %.2f
                Nome do meu pet é: %s
                """, nome, idade, altura, nomePet
        );
        System.out.println(fraseFormatada);

        String fraseFormatada2 =
                """
                Meu nome é: %s
                Minha idade é: %d
                Minha altura é: %.2f
                Nome do meu pet é: %s
                """.formatted(nome, idade, altura, nomePet);
        System.out.println(fraseFormatada2);

        Boolean petVacinado = true;
        String frasePetVacinado = petVacinado ? "Sim" : "Não";
        System.out.println("""
                Meu nome é: %s
                Minha idade é: %d
                Minha altura é: %.2f
                Nome do meu pet é: %s
                Pet Vacinado Variavel: %s
                Pet Vacinado Args: %s
                """.formatted(nome, idade, altura, nomePet, frasePetVacinado, (petVacinado ? "Sim" : "Não"))
        );

        //Se iver menos de 15 anos, o salario é 800 reais
        //Se tiver mais de 15 anos, o salario é 1600 reais
        Integer idadeParaSalario = 14;
        Double salario = idadeParaSalario < 15 ? 800.0 : 1600.0;
        System.out.println(salario);

        Boolean maiorIdade = idadeParaSalario >= 18;
        System.out.println(maiorIdade);
    }
}
