package com.loiane.estruturadados.vetor.pilha.exercicios;

import javax.swing.*;
import java.awt.*;
import java.util.Stack;

public class Exerc08 extends JFrame {

    private final Stack<Integer> original = new Stack<>();
    private final Stack<Integer> dest = new Stack<>();
    private final Stack<Integer> aux = new Stack<>();

    private final JPanel panelOriginal = new JPanel();
    private final JPanel panelAux = new JPanel();
    private final JPanel panelDest = new JPanel();

    public Exerc08() {  // <-- nome do construtor corrigido!
        setTitle("Torre de Hanoi - Visual");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(1, 3));

        panelOriginal.setBackground(Color.LIGHT_GRAY);
        panelAux.setBackground(Color.GRAY);
        panelDest.setBackground(Color.DARK_GRAY);

        add(panelOriginal);
        add(panelAux);
        add(panelDest);

        original.push(3);
        original.push(2);
        original.push(1);

        atualizarTorre();

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    torreDeHanoi(original.size(), original, dest, aux);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();

        setVisible(true);
    }

    public static void torreDeHanoi(int n, Stack<Integer> original, Stack<Integer> dest, Stack<Integer> aux) throws InterruptedException {
        if (n > 0) {
            torreDeHanoi(n - 1, original, aux, dest);
            dest.push(original.pop());
            System.out.println("-----");
            System.out.println("Original: " + original);
            System.out.println("Destino: " + dest);
            System.out.println("Aux: " + aux);
            Thread.sleep(1000);  // Adiciona pausa para sincronizar com Swing
            torreDeHanoi(n - 1, aux, dest, original);
        }
    }

    public void atualizarTorre() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                desenharTorre(panelOriginal, original);
                desenharTorre(panelAux, aux);
                desenharTorre(panelDest, dest);
            }
        });
    }

    public void desenharTorre(JPanel panel, Stack<Integer> torre) {
        panel.removeAll();
        panel.setLayout(new GridLayout(5, 1));

        Stack<Integer> copia = new Stack<>();
        copia.addAll(torre);

        while (!copia.isEmpty()) {
            int disco = copia.pop();
            JLabel label = new JLabel("Disco " + disco, SwingConstants.CENTER);
            label.setOpaque(true);
            label.setBackground(new Color(200 - disco * 30, 100 + disco * 30, 255));
            label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            panel.add(label);
        }

        panel.revalidate();
        panel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Exerc08();  // <-- Nome correto do construtor
            }
        });
    }
}
