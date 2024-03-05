package school.sptech.ex1;
import java.util.List;
public class Ex1ClasseSocialMetodos {
    // Coloque os métodos aqui
    Double calcularQtdSalariosMinimos(Double rendaFamiliar) {
        Double salariosMin = rendaFamiliar / 1045;
        return salariosMin;
    }

    String classeSocial(Double salarioMin){
        if(salarioMin <= 2){
            return "E";
        } else if (salarioMin <= 4) {
            return "D";
        } else if (salarioMin <= 10) {
            return "C";
        } else if (salarioMin <= 20) {
            return  "B";
        }
        else {
            return "A";
        }
    }
}
