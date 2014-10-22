/**
 * Created by root on 16/10/14.
 */
public class Registradora {

    private double total;

    public Registradora() {
        total = 0;
    }

    public void adicionaParecela(double valor){
        this.total += valor;
    }

    public double  getTotalSemTaxa(){
        return total;
    }

    public double getTotalComTaxa(){
        return total + total * 0.10;
    }

    public double pagar(double pagamento, boolean taxa){

        if(taxa){
            total += total * 0.10;
        }

        if(total > pagamento){
            System.out.println("Caloteiro.");
            return 0;
        }

        return total - pagamento;

    }
}
