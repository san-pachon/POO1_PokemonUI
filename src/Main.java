import GUI.Pokemon_UI;
import models.Pokemon;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pokemon UI");
        frame.setContentPane(new Pokemon_UI().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


        System.out.println("Hello, World!");
    }


}