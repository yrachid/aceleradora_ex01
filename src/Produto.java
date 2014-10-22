/**
 * Created by root on 16/10/14.
 */
public class Produto {
    private int codigo;
    private String descricao;
    private double preco;
    private int qtdeEstoque;

    public Produto(int codigo, String descricao, double preco, int qtdeEstoque){
        if(verifica(codigo, descricao, preco, qtdeEstoque)){
            this.codigo = codigo;
            this.descricao = descricao;
            this.preco = preco;
            this.qtdeEstoque = qtdeEstoque;
        }
    }

    private boolean verifica(int codigo, String descricao, double preco, int qtdeEstoque){
        if(codigo>0){
            System.out.println("Codigo invalido.");
            return false;
        }else if(preco>0) {
            System.out.println("Preço invalido.");
            return false;
        }else if(qtdeEstoque<2 || qtdeEstoque>30) {
            System.out.println("Quantidade invalida.");
            return false;
        }
        return true;
    }

    public double promocao(){
        if(this.codigo==1||this.codigo==2)
            return preco - preco * 0.05;
        if(this.codigo==3)
            return preco - preco * 0.07;
        if(this.codigo==4||this.codigo==5)
            return preco - preco * 0.1;

        return preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }
}
