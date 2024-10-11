import modelo.Conta;
import modelo.ContaCorrente;
import modelo.GuardardorDeContas;

public class Principal {
    public static void main(String[] args) {
        GuardardorDeContas guardador = new GuardardorDeContas();

        Conta cc1 = new ContaCorrente(11, 22);
        guardador.adicionar(cc1);
        Conta cc2 = new ContaCorrente(22, 33);
        guardador.adicionar(cc2);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta red = (Conta) guardador.getRef(1);
        System.out.println(red.getNumero());
    }
}
