/**
 * Created by root on 16/10/14.
 */
public class Olimpiada {

    private double [] notas;

    public Olimpiada(double n1, double n2, double n3, double n4, double n5, double n6){

        notas = new double[6];

        notas[0] = n1;
        notas[1] = n2;
        notas[2] = n3;
        notas[3] = n4;
        notas[4] = n5;
        notas[5] = n6;

        double holder;
        for(int i=0;i<notas.length;i++){
            for(int j=0;j<notas.length; j++){
                if(notas[i] < notas[j]){
                    holder = notas[i];

                    notas[i] = notas[j];
                    notas[j] = holder;
                }
            }
        }

    }

    public double getMaiorNota(){

        return notas[5];

    }

    public double getMenorNota(){

        return notas[0];

    }

    public double mediaAtleta(){

        double media = 0;

        for(int i=1;i<4;i++){
            media += notas[i];
        }

        return media / 4;

    }

    public int getQuantidadeNotasBaixas(){

        int contador = 0;
        for(int i=0;i<notas.length;i++){
            if(notas[i] < 6)
                contador++;
        }
        return contador;
    }
}
