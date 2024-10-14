import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        //Para cada tipo primitivo existe uma Classe Wrapper
        //Primitivo
        int idade = 29;

        //Objeto
        Integer idadeObj = 29;
        double idadeDou = idadeObj.doubleValue();

        //Listas guardam apenas referências -> Objetos

        //Errado -> AutoBoxing
        List numeros = new ArrayList();
        numeros.add(idade);

        //Correto -> Classes Wrappers
        List<Integer> numerosObj = new ArrayList<Integer>();
        numerosObj.add(idadeObj);
    }
}
