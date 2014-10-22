/**
 * Created by root on 16/10/14.
 */
public class Elevador {
    private int andar;
    private int andarMaximo;

    public Elevador(int andar, int andarMaximo){
        this.andar=andar;
        this.andarMaximo=andarMaximo;
    }

    public void subir(){
        if(andar==andarMaximo){
            System.out.println("Ja esta no andar maximo");
        }else{
            andar++;
        }
    }

    public void descer(){
        if(andar==1){
            System.out.println("Ja esta no andar minimo");
        }else{
            andar--;
        }
    }

    public int getAndar() {
        return andar;
    }
}
