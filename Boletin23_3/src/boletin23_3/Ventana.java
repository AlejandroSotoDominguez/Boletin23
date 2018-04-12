
package boletin23_3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ventana implements ActionListener {
    JFrame marco;
    JPanel panel;
    JButton boton1,boton2;
    
    public Ventana(){
        marco = new JFrame();
        panel = new JPanel();
        boton1 = new JButton("Saludo");
        boton2 = new JButton("Despedida");
        
        marco.setSize(400,200);
        panel.add(boton1);
        panel.add(boton2);
        marco.add(panel);
        
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object boton = e.getSource();
        if(boton==boton1){
            JOptionPane.showMessageDialog(null, "Un saludo a DAM");
        }else{
            JOptionPane.showMessageDialog(null, "Fin del programa");
        }
    }
}
