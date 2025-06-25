package GUI;
import models.Pokemon;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static models.Pokemon.crearPokemon;
public class Pokemon_UI{
    public JPanel panel;
    public JTextField pokemonId;
    public JTextField pokemonName;
    public JTextField pokemonLevel;
    public JCheckBox pokemonLegend;
    public JButton guardarButton;
    public Pokemon_UI() {
        guardarButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int id = Integer.parseInt(pokemonId.getText());
                String name = pokemonName.getText();
                int level = Integer.parseInt(pokemonLevel.getText());
                boolean legendary = pokemonLegend.isSelected();
                crearPokemon(id, name, level, legendary);
                JOptionPane.showMessageDialog(null,
                        "¡Has capturado a " + name + "!",
                        "Pokémon capturado",
                        JOptionPane.INFORMATION_MESSAGE);
                pokemonId.setText("");
                pokemonName.setText("");
                pokemonLevel.setText("");
                pokemonLegend.setSelected(false);
            }
        });
    }
}