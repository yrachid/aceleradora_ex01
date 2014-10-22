package ultimo;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by root on 16/10/14.
 */
public class PessoaOcupada {

    private String      nome;
    private Date        dtNascimento;
    private String      rg;
    private ArrayList<TelefoneCelular> celulares;

    public PessoaOcupada(String nome, Date dtNascimento, String rg, ArrayList<TelefoneCelular> celulares) {
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.rg = rg;
        this.celulares = celulares;
    }

    public String getNome() {
        return nome;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public String getRg() {
        return rg;
    }

    public ArrayList<TelefoneCelular> getCelulares() {
        return celulares;
    }
}
