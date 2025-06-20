package GUI;

import models.Pokemon;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static models.Pokemon.crearPokemon;

public class Pokemon_UI {

    public JPanel panel;
    public JTextField pokemonId;
    public JTextField pokemonName;
    public JTextField pokemonLevel;
    public JCheckBox pokemonLegend;
    public JButton guardarButton;

    public Pokemon_UI() {
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                crearPokemon(
                        Integer.parseInt(pokemonId.getText()),
                        pokemonName.getText(),
                        Integer.parseInt(pokemonLevel.getText()),
                        pokemonLegend.isSelected()

                );


            }
        });
    }
}
