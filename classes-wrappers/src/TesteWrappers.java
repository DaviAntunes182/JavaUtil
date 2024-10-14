import java.util.ArrayList;
import java.util.List;

public class TesteWrappers {
    public static void main(String[] args) {
        Integer intRef = 29;
        System.out.println(intRef.intValue());

        Double douRef = 3.2;
        System.out.println(douRef.doubleValue());

        Boolean bRef = Boolean.TRUE;
        System.out.println(bRef.booleanValue());

        Number refNumero = Double.valueOf(Integer.valueOf(10));
        System.out.println(refNumero.doubleValue());

        List<Number> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(10.0);
        numeros.add(10.0f);
    }
}
