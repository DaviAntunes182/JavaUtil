package modelo;

public class GuardardorDeContas {
    public Object[] referencias;
    private int posiLivre;
    public GuardardorDeContas(){
        this.referencias = new Object[10];
        this.posiLivre = 0;
    }

    public void adicionar(Object ref) {
        this.referencias[this.posiLivre] = ref;
        this.posiLivre++;
    }

    public int getQuantidadeDeElementos(){
        return this.posiLivre;
    }

    public Object getRef(int pos){
        return this.referencias[pos];
    }
}
