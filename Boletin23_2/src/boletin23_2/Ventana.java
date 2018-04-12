
package boletin23_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana implements ActionListener {
    JFrame marco;
    JPanel panel;
    JButton boton1,boton2;
    
    public Ventana(){
        marco = new JFrame("CURSO DAM");
        panel = new JPanel();
        boton1 = new JButton("Programación");
        boton2 = new JButton("Bases");
        
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
            marco.setTitle("Programación");
        }else{
            marco.setTitle("Bases");
        }
    }
}
