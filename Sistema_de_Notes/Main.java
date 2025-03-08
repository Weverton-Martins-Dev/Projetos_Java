package Sistema_de_Notes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        // Criação da janela
        JFrame janela = new JFrame("Rastreador de Tarefas");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setMaximumSize(new Dimension(420, 720));
        janela.setMinimumSize(new Dimension(420, 720));
        janela.setLayout(new BorderLayout()); // Definindo o layout da janela

        // Criação do painel principal da janela
        JPanel homePanel = createHomePanel();
        janela.add(homePanel, BorderLayout.CENTER); // Adiciona o painel principal

        janela.setLocationRelativeTo(null); // Centraliza a janela
        janela.setVisible(true); // Exibe a janela
    }

    private static JPanel createHomePanel() {
        JPanel homePanel = new JPanel();
        homePanel.setLayout(new BorderLayout());

        // Criação dos paineis secundários
        JPanel topPanel = createTopPanel();

        // Adição dos paineis secundários
        homePanel.add(topPanel, BorderLayout.NORTH); // Adiciona o painel superior

        return homePanel; // Retorna o painel
    }

    private static JPanel createTopPanel() {
        JPanel topPanel = new JPanel();
        topPanel.setBackground(new Color(18, 255, 0, 255));
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));

        // Criação dos componentes do painel
        JButton menuMobile = createButtonImagem("/Sistema_de_Notes/Icon/Menu.png", 30, 30);
        menuMobile.setPreferredSize(new Dimension(30, 30));
        menuMobile.setMinimumSize(new Dimension(30, 30));
        menuMobile.setCursor(new Cursor(Cursor.HAND_CURSOR));
        menuMobile.setToolTipText("Menu De Opções");
        menuMobile.setContentAreaFilled(false);
        menuMobile.setBorderPainted(false);
        menuMobile.setFocusPainted(false);

        JLabel titleTop = new JLabel("Notes");
        titleTop.setFont(new Font("Arial", Font.BOLD, 30));
        titleTop.setToolTipText("Notes");

        JButton searchTop = createButtonImagem("/Sistema_de_Notes/Icon/Search.png", 30, 30);
        searchTop.setPreferredSize(new Dimension(30, 30));
        searchTop.setMinimumSize(new Dimension(30, 30));
        searchTop.setCursor(new Cursor(Cursor.HAND_CURSOR));
        searchTop.setToolTipText("Pesquisar Notas");
        searchTop.setContentAreaFilled(false);
        searchTop.setBorderPainted(false);
        searchTop.setFocusPainted(false);

        JButton settingTop = createButtonImagem("/Sistema_de_Notes/Icon/Setting.png", 30, 30);
        settingTop.setPreferredSize(new Dimension(30, 30));
        settingTop.setMinimumSize(new Dimension(30, 30));
        settingTop.setCursor(new Cursor(Cursor.HAND_CURSOR));
        settingTop.setToolTipText("Configurações");
        settingTop.setContentAreaFilled(false);
        settingTop.setBorderPainted(false);
        settingTop.setFocusPainted(false);

        // Adição dos componentes do painel
        topPanel.add(Box.createHorizontalStrut(20));
        topPanel.add(menuMobile);
        topPanel.add(Box.createHorizontalStrut(20));
        topPanel.add(titleTop);
        topPanel.add(Box.createHorizontalGlue());
        topPanel.add(searchTop);
        topPanel.add(Box.createHorizontalStrut(30));
        topPanel.add(settingTop);
        topPanel.add(Box.createHorizontalStrut(20));

        return topPanel; // Retorna o painel
    }

    private static JButton createButtonImagem(String imagePath, int width, int height) {
        // Carrega a imagem
        ImageIcon originalIcon = new ImageIcon(Objects.requireNonNull(Main.class.getResource(imagePath))); // Usando getClass().getResource

        // Redimensiona a imagem
        Image scaledImage = originalIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        // Cria o botão com a imagem redimensionada
        return new JButton(scaledIcon);
    }
}