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

        // Criação dos painéis secundários
        JPanel navigationPanel = createNavigationPanel();
        JPanel notesPanel = createNotesPanel();
        JPanel newNotesPanel = createNewNotesPanel();

        // Adição dos painéis à janela
        contentPanel.add(Box.createRigidArea(new Dimension(10, 30)));
        contentPanel.add(navigationPanel, BorderLayout.NORTH);
        contentPanel.add(Box.createVerticalGlue());
        contentPanel.add(notesPanel, BorderLayout.CENTER);
        contentPanel.add(Box.createVerticalGlue());
        contentPanel.add(newNotesPanel, BorderLayout.SOUTH);
        contentPanel.add(Box.createRigidArea(new Dimension(10, 30)));

        return contentPanel;
    }

    private static JPanel createNavigationPanel() {
        JPanel navigationPanel = new JPanel();
        navigationPanel.setBackground(new Color(18, 255, 0));
        navigationPanel.setLayout(new BoxLayout(navigationPanel, BoxLayout.X_AXIS));

        // Criação dos componentes do painel
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

        // Adição dos componentes do painel
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

    private static JPanel createNotesPanel() {
        JPanel notesPanel = new JPanel();
        notesPanel.setBackground(new Color(196, 196, 196));
        notesPanel.setLayout(new FlowLayout());

        // Criação dos componentes do painel

        // Adição dos componentes do painel
        notesPanel.add(Box.createRigidArea(new Dimension(20, 50)));
        notesPanel.add(Box.createRigidArea(new Dimension(20, 50)));

        return  notesPanel;
    }

    private static JPanel createNewNotesPanel() {
        JPanel criarNotesPanel = new JPanel();
        criarNotesPanel.setLayout(new BoxLayout(criarNotesPanel, BoxLayout.X_AXIS));
        criarNotesPanel.setBackground(new Color(18, 255, 0));

        // Criação dos componentes do painel
        JTextField notesLabel = new JTextField("");
        notesLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        notesLabel.setPreferredSize(new Dimension(200, 30));
        notesLabel.setMaximumSize(new Dimension(200, 30));
        notesLabel.setForeground(new Color(255, 255, 255));
        notesLabel.setBackground(new Color(18, 255, 0));
        notesLabel.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        notesLabel.setToolTipText("Criar Uma Nota...");

        JButton listaButton = getImagensButtons("Bloco_Notas/Icon/Lista.png", 30, 30);
        listaButton.setPreferredSize(new Dimension(30, 30));
        listaButton.setMaximumSize(new Dimension(30, 30));
        listaButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        listaButton.setToolTipText("Adicionar Nota");

        JButton canetaButton = getImagensButtons("Bloco_Notas/Icon/Caneta.png", 30, 30);
        canetaButton.setPreferredSize(new Dimension(30, 30));
        canetaButton.setMaximumSize(new Dimension(30, 30));
        canetaButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        canetaButton.setToolTipText("Editar Nota");

        JButton gravadorButton = getImagensButtons("Bloco_Notas/Icon/Gravado.png", 30, 30);
        gravadorButton.setPreferredSize(new Dimension(30, 30));
        gravadorButton.setMaximumSize(new Dimension(30, 30));
        gravadorButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        gravadorButton.setToolTipText("Gravar Voz");

        JButton cameraButton  = getImagensButtons("Bloco_Notas/Icon/Camera.png", 30, 30);
        cameraButton.setPreferredSize(new Dimension(30, 30));
        cameraButton.setMaximumSize(new Dimension(30, 30));
        cameraButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cameraButton.setToolTipText("Anexar Foto");

        // Adição dos componentes do painel
        criarNotesPanel.add(Box.createRigidArea(new Dimension(20, 50)));
        criarNotesPanel.add(notesLabel);
        criarNotesPanel.add(Box.createHorizontalGlue());
        criarNotesPanel.add(listaButton);
        criarNotesPanel.add(Box.createHorizontalGlue());
        criarNotesPanel.add(canetaButton);
        criarNotesPanel.add(Box.createHorizontalGlue());
        criarNotesPanel.add(gravadorButton);
        criarNotesPanel.add(Box.createHorizontalGlue());
        criarNotesPanel.add(cameraButton);
        criarNotesPanel.add(Box.createRigidArea(new Dimension(20, 50)));

        return criarNotesPanel;
    }

    // Criação do método para renderizar os ícones nos botões
    private static JButton getImagensButtons(String imagePatch, int width, int height) {
        ImageIcon imageIcon = new ImageIcon(imagePatch);
        Image image = imageIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);

        ImageIcon resizedIcon = new ImageIcon(image);

        JButton button = new JButton(resizedIcon);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        button.setFocusPainted(false);

        return button;
    }
}
