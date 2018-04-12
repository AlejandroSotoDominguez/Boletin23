
package boletin23_1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ventana implements ActionListener {
    JFrame marco;
    JPanel panel;
    JButton boton;
    JLabel texto;
    
    public Ventana(){
        marco = new JFrame();
        panel = new JPanel();
        
        boton = new JButton("Premer");
        marco.setSize(400,200);
        texto = new JLabel("Premiches o botón");
        panel.add(texto);
        panel.add(boton);
        marco.add(panel);
        
        boton.addActionListener(this);
        texto.setVisible(false);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        texto.setVisible(true);
    }
    
    
}
