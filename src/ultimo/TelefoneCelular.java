package ultimo;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by root on 16/10/14.
 */
public class TelefoneCelular {
    private long      numero;
    private String    modelo;
    private ArrayList<Contato> contatos;

    public TelefoneCelular(){
        contatos = new ArrayList<Contato>();
    }

    public void addContato(Contato c){
        contatos.add(c);
    }

    public void removerContato(String nome){
        for(int i=0;i<contatos.size();i++){
            if(contatos.get(i).getNome().equals(nome)){
                contatos.remove(i);
                break;
            }
        }
    }

    public void ordenaCrescente(){
        Contato aux = null;
        Contato aux2 = null;

        for (int i=0;i < contatos.size();i++){
            for (int j=i;j < contatos.size();j++){

                if (contatos.get(i).getNome().compareTo(contatos.get(j).getNome()) > 0){
                    aux = contatos.get(i);
                    aux2 = contatos.get(j);

                    contatos.remove(i);
                    contatos.add(i, aux2);

                    contatos.remove(j);
                    contatos.add(j, aux);

                }

            }
        }
    }

    public void ordenaDecrescente(){

        Contato aux = null;
        Contato aux2 = null;

        for (int i=0;i < contatos.size();i++){
            for (int j=i;j < contatos.size();j++){

                if (contatos.get(i).getNome().compareTo(contatos.get(j).getNome()) < 0){
                    aux = contatos.get(i);
                    aux2 = contatos.get(j);

                    contatos.remove(i);
                    contatos.add(i, aux2);

                    contatos.remove(j);
                    contatos.add(j, aux);

                }

            }
        }

    }

    public void mostrarContatos(){
        for(Contato c: contatos){
            System.out.println(c.getNome() + " " + c.getIdade());
        }
    }

}
