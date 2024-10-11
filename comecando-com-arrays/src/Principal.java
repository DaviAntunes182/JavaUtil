public class Principal {
    public static void main(String[] args) {
        //Para iniciar um array primitivo devemos dizer seu tamanho
        int[] idades = new int[5];

        //Podemos usar o loop for para popular este array primitivo
        for (int i = 0; i < idades.length; i++) {
            idades[i] = i * 9;
        }
        //Podemos usar o for também para ler este array
        for (int i = 0; i < idades.length; i++) {
            if(i != 4){
                System.out.print(idades[i] + ", ");
            }else{
                System.out.print(idades[i]);
            }
        }

    }
}
