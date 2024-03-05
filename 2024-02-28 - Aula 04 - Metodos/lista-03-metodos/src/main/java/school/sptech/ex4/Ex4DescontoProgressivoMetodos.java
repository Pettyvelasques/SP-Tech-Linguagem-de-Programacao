package school.sptech.ex4;

public class Ex4DescontoProgressivoMetodos {
  // Coloque os métodos aqui
    Double calcularDesconto(Double valor, Integer quantidade){
        if (quantidade == 1){
            Double valorTotal = valor * 0.9;
            return valorTotal;
        } else if (quantidade == 2) {
            Double valorTotal = valor * 0.8;
            return valorTotal;
        } else if (quantidade >= 3) {
            Double valorTotal = valor * 0.7;
            return valorTotal;
        } else {
            return valor;
        }
    }

    void exibirNotaFistal(Double valor, Integer quantidade, Double valorTotal){
        System.out.println("""
                ------------------------------
                Valor do produto: R$%.2f
                Quantidade: %d
                ------------------------------
                Valor com desconto: R$%.2f""".formatted(valor, quantidade, valorTotal));
    }
}
