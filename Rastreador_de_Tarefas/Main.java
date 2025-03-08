package Rastreador_de_Tarefas;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Rastreador de Tarefas");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setMaximumSize(new Dimension(420, 720));
        janela.setMinimumSize(new Dimension(420, 720));

        // Criação do painel principal da janela
        JPanel homePanel = createHomePanel();
        janela.add(homePanel);

        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }

    private static JPanel createHomePanel() {
        JPanel homePanel = new JPanel();
        homePanel.setLayout(new BorderLayout());
        homePanel.setBackground(new Color(203, 229, 255, 255));

        // Criação dos paineis secundários
        JPanel topPanel = createTopPanel();

        // Adição dos paineis secundários
        homePanel.add(Box.createVerticalGlue());
        homePanel.add(topPanel, BorderLayout.NORTH);
        homePanel.add(Box.createVerticalGlue());

        return homePanel; // Retorna o painel
    }

    private static JPanel createTopPanel() {
        JPanel topPanel = new JPanel();
        topPanel.setBackground(new Color(255, 247, 0, 255));

        // Criação dos componentes do painel

        // Adição dos componentes do painel

        return  topPanel; // Retorna o painel
    }
}
