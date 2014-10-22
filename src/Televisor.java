/**
 * Created by root on 16/10/14.
 */
public class Televisor {
    private int volume;
    private int canal;
    private int volumeLimite;
    private int canalLimite;

    public Televisor(int volume, int volumeLimite, int canal, int canalLimite){
        this.volume=volume;
        this.volumeLimite=volumeLimite;
        this.canal=canal;
        this.canalLimite=canalLimite;
    }

    public Televisor(){
        this.volume=5;
        this.volumeLimite=10;
        this.canal=12;
        this.canalLimite=200;
    }

    public void sobeCanal(){

        if(canal == canalLimite)
            canal = 1;
        else
            canal++;

    }

    public void desceCanal(){
        if(canal == 1)
            canal = canalLimite;
        else
            canal --;

    }

    public void sobeVolume(){
        if(volume == volumeLimite)
            System.out.println("Volume já está no máximo.");
        else
            volume++;


    }

    public void desceVolume(){

        if(volume -1 == 0) {
            System.out.println("Mudo.");
            volume--;
        }

        else if(volume -1 < 0)
            System.out.println("Já está no mudo.");
        else
            volume--;
    }

    public void escolheCanal(int canal){
        if(canal > this.canalLimite || canal < 0)
            System.out.println("Canal inexistente.");

        else
            this.canal = canal;

    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }
}
