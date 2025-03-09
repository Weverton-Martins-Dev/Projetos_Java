package Bloco_Notas;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Bloco De Notas");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setMaximumSize(new Dimension(420, 720));
        janela.setMinimumSize(new Dimension(420, 720));
        janela.setLayout(new BorderLayout());

        // Adição de um painel geral da janela
        JPanel contentPanel = createContentPanel();
        janela.add(contentPanel);

        janela.pack(); // Ajusta o tamanho da janela com base nos componentes
        janela.setLocationRelativeTo(null); // Centraliza a janela no centro
        janela.setResizable(false); // Impede o redimensionamento da janela
        janela.setVisible(true);
    }

    private static JPanel createContentPanel() {
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());

        // Criação dos paineis secundários
        JPanel navigationPanel = createNavegationPanel();

        // Adição dos paineis à janela
        contentPanel.add(Box.createRigidArea(new Dimension(10, 30)));
        contentPanel.add(navigationPanel, BorderLayout.NORTH);
        contentPanel.add(Box.createRigidArea(new Dimension(10, 30)));

        return contentPanel;
    }

    private static JPanel createNavegationPanel() {
        JPanel navigationPanel = new JPanel();
        navigationPanel.setBackground(new Color(18, 255, 0));
        navigationPanel.setLayout(new BoxLayout(navigationPanel, BoxLayout.X_AXIS));

        // Criação dos componentes
        JButton menuButton = getImagensButtons("Bloco_Notas/Icon/Barra_menu.png", 30, 40);
        menuButton.setPreferredSize(new Dimension(30, 40));
        menuButton.setMaximumSize(new Dimension(30, 40));
        menuButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        menuButton.setToolTipText("Menu De Opções");

        JLabel titleLabel = new JLabel("Notes");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 30));
        titleLabel.setForeground(new Color(255, 255, 255));
        titleLabel.setToolTipText("Notes");

        JButton searchButton = getImagensButtons("Bloco_Notas/Icon/Search.png", 40, 40);
        searchButton.setPreferredSize(new Dimension(40, 40));
        searchButton.setMaximumSize(new Dimension(40, 40));
        searchButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        searchButton.setToolTipText("Pesquisar");

        JButton settingsButton = getImagensButtons("Bloco_Notas/Icon/Settings.png", 40, 40);
        settingsButton.setPreferredSize(new Dimension(40, 40));
        settingsButton.setMaximumSize(new Dimension(40, 40));
        settingsButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        settingsButton.setToolTipText("Configurações");

        // Adição dos componentes
        navigationPanel.add(Box.createRigidArea(new Dimension(20, 50)));
        navigationPanel.add(menuButton);
        navigationPanel.add(Box.createRigidArea(new Dimension(20, 0)));
        navigationPanel.add(titleLabel);
        navigationPanel.add(Box.createHorizontalGlue());
        navigationPanel.add(searchButton);
        navigationPanel.add(Box.createRigidArea(new Dimension(20, 0)));
        navigationPanel.add(settingsButton);
        navigationPanel.add(Box.createRigidArea(new Dimension(20, 50)));

        return navigationPanel;
    }

    private static JButton getImagensButtons(String imagePatch, int width, int height) {
        ImageIcon imageIcon = new ImageIcon(imagePatch);
        Image image = imageIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);

        ImageIcon resizedIcon = new ImageIcon(image);

        JButton button = new JButton(resizedIcon);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);

        return button;
    }
}
