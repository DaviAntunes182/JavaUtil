public class MetodosInteger {
    public static void main(String[] args) {
        String valor1 = "29";
        String valor2 = "31";

        Integer num1 = Integer.valueOf(valor1);
        Integer num2 = Integer.parseInt(valor2);

        Integer soma = Integer.sum(num1, num2);

        System.out.printf("""
                %d + %d = %d
                """, num1, num2, soma);

    }
}
