package ultimo;

/**
 * Created by root on 16/10/14.
 */
public class Contato {
    private String nome;
    private int idade;
    private String email;

    public Contato(String nome, int idade, String email){
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public int compare(Object o){
        Contato outer = (Contato) o;

        return this.getNome().compareToIgnoreCase(outer.getNome());
    }


}
