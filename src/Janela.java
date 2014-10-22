import javax.swing.*;
import java.awt.*;

/**
 * Created by root on 16/10/14.
 */
public class Janela extends JFrame {
    JButton butao;
    JLabel texto;
    public Janela(){
        texto = new JLabel("bUTÃO:");
        butao = new JButton("OK");
        butao.setSize(20,20);
        this.getContentPane().add(texto);
        this.getContentPane().add(butao);
        this.setSize(100,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
//
//    public static void main(String[] args) {
//        Janela j = new Janela();
//    }

}
