package ultimo;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by root on 21/10/14.
 */
public class Main {
    public static void main(String[] args) {
        TelefoneCelular t1 = new TelefoneCelular();

        t1.addContato(new Contato("Eab", 12, "T"));
        t1.addContato(new Contato("Eab", 13, "T"));
        t1.addContato(new Contato("Gab", 12, "T"));
        t1.addContato(new Contato("Bac", 10, "T"));
        t1.addContato(new Contato("Abc", 20, "T"));
        t1.addContato(new Contato("Hab", 12, "T"));
        t1.addContato(new Contato("Cab", 12, "T"));
        t1.addContato(new Contato("Iab", 12, "T"));
        t1.addContato(new Contato("Dab", 12, "T"));
        t1.addContato(new Contato("Fab", 12, "T"));


        ArrayList<TelefoneCelular> celulares = new ArrayList<TelefoneCelular>();
        celulares.add(t1);

        PessoaOcupada po = new PessoaOcupada( "Teste", new Date(), "11111111111",  celulares);


        System.out.println(po.getDtNascimento());
        po.getCelulares().get(0).ordenaDecrescente();
        po.getCelulares().get(0).removerContato("Eab");

        po.getCelulares().get(0).mostrarContatos();

    }
}
