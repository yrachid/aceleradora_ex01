/**
 * Created by root on 16/10/14.
 */
public class Conta {

    private Pessoa dono;
    private int numero;
    private double saldo;
    private double limite;



    public String saque(int quantidade){
        if(saldo>=quantidade){
            saldo-=quantidade;
//        String notas="";
//        while(quantidade<2){
//            if(quantidade>=100){
//                quantidade-=100;
//                notas+="R$100,00 ";
//            }else if(quantidade>=50){
//                quantidade-=50;
//                notas+="R$50,00 ";
//            }else if(quantidade>=20){
//                quantidade-=20;
//                notas+="R$20,00 ";
//            }else if(quantidade>=10){
//                quantidade-=10;
//                notas+="R$10,00 ";
//            }else if(quantidade>=5){
//                quantidade-=5;
//                notas+="R$5,00 ";
//            }else if(quantidade>=2){
//                quantidade-=2;
//                notas+="R$2,00 ";
//            }
//        }
            return "Saque com sucesso, R$"+quantidade;
        }
        return "Saldo Insuficiente. Saldo: R$"+saldo;
    }

    public String depositar(double quantidade){
        saldo+=quantidade;
        return "Deposito realizado. Saldo: R$"+saldo;
    }

    public String transfereConta(Conta destino, double quantidade){
        if(this.saldo>=quantidade){
            this.saldo-=quantidade;
            return destino.depositar(quantidade);
        }
        return "Não foi possível fazer a transferência, Seu saldo é R$" + this.pegaSaldo() +
                ". O Saldo da conta destino é R$"+destino.pegaSaldo();
    }

    public double pegaSaldo() {
        return saldo;
    }

    public int pegaNumero() {
        return numero;
    }

    public String pegaNomeDoDono() {
        return dono.pegaNome();
    }

}
