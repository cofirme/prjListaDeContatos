package br.edu.prjListaDeContatos;

import javax.swing.*;

public class main {


    public static void main(String[] args) {

        JFrame janela = new JFrame("ListaDeContatos");
        janela.setContentPane(new TelaListaContatos().getAgenda());
        janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        janela.pack();
        janela.setVisible(true);
    }
}





