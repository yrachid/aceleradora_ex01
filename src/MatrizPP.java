import java.util.ArrayList;
import java.util.Random;

/**
 * Created by root on 17/10/14.
 */
public class MatrizPP {

    private static String [] alunos = {"JO", "CA", "AL", "MA", "LU.V", "EV", "JOHN", "LU.J","HE","LU.R","ANA","YA"};
    private static int [] selectedIndexes = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};

    private static ArrayList<String> alunosList;

    private static boolean inArray(int[]array, int value){
        for(int i: array)
            if(i == value)
                return true;

        return false;
    }

    private static int add(int[]array, int value){
        for(int i=0;i<array.length;i++){
            if(array[i] == -1) {
                array[i] = value;
                return i;
            }
        }

        return array.length;
    }


    public static void main(String[] args) {
//        int primeiroAluno;
//        int segundoAluno;
//
//        Random r;
//
//        r = new Random();
//
//        for (int i = 0; i < 6; i++) {
//            primeiroAluno = r.nextInt(11) + 1;
//            segundoAluno  = r.nextInt(11) + 1;
//
//            while (inArray(selectedIndexes, primeiroAluno)) {
//                primeiroAluno = r.nextInt(11) + 1;
//            }
//
//            while (inArray(selectedIndexes, segundoAluno)) {
//                segundoAluno = r.nextInt(11) + 1;
//            }
//
//            if(primeiroAluno == segundoAluno){
//                i = (i>0)? i--:0;
//                continue;
//            }
//
//            add(selectedIndexes, primeiroAluno);
//            add(selectedIndexes, segundoAluno);
//
//            System.out.println(alunos[primeiroAluno] + " - " + alunos[segundoAluno]);
//        }

        System.out.println('A' > 'b');

    }
}
