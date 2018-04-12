
package boletin23_4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana implements ActionListener {
    JFrame marco;
    JPanel panel;
    JButton boton;
    
    public Ventana() {
        marco = new JFrame("Ventana 1");
        panel = new JPanel();
        boton = new JButton("Abrir");
        
        marco.setSize(400,200);
        panel.add(boton);
        marco.add(panel);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        boton.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ventana2();
    }
    
    public void ventana2() {
        marco = new JFrame("Ventana 2");
        panel = new JPanel();
        
        marco.setSize(300,200);
        marco.add(panel);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        boton.addActionListener(this);
        
    }
}
