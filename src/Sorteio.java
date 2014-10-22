import java.util.Random;

/**
 * Created by root on 16/10/14.
 */
public class Sorteio {
    private int numeroSorteado;
    private Random r;

    public Sorteio(){
        r = new Random();
        numeroSorteado= r.nextInt(29)+1;
    }

    public int palpite(int chute){
        return numeroSorteado-chute;
    }
}
