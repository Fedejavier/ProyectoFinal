import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener{

    private JTextField textfields;
    private JLabel label1, label2, label3, label4;
    private JButton boton1;
    public static String texto = "";
    
    public Bienvenida(){

        setLayout(null);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255,0,0));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        ImageIcon imagen = new ImageIcon("images/logo-coca.png");
        label1 = new JLabel(imagen);
        label1.setBounds(25,15,300,150);
        add(label1);

        label2 = new JLabel("Sistema de Control de Vacaciones");
        label2.setBounds(35,135,300,30);
        label2.setFont(new Font("Andale Mono",3, 18));
        label2.setForeground(new Color(255,255,255));
        add(label2);

        label3 = new JLabel("Ingrese su Nombre");
        label3.setBounds(45,212,200,30);
        label3.setFont(new Font("Andale Mono",1, 12));
        label3.setForeground(new Color(255,255,255));
        add(label3);

        label4 = new JLabel("©2021 The Coca-Cola Company");
        label4.setBounds(85,375,300,30);
        label4.setFont(new Font("Andale Mono",1, 12));
        label4.setForeground(new Color(255,255,255));
        add(label4);

        textfields = new JTextField();
        textfields.setBounds(45,240,255,25);
        textfields.setBackground(new Color(224,224,224));
        textfields.setFont(new Font("Andalo Mono", 1 , 14));
        textfields.setForeground(new Color(255,0,0));
        add(textfields);

        boton1 = new JButton("Ingresar");
        boton1.setBounds(125,280,100,30);
        boton1.setBackground(new Color(255,255,255));
        boton1.setFont(new Font("Andale Mono", 1 , 14));
        boton1.setForeground(new Color(255,0,0));
        boton1.addActionListener(this);
        add(boton1);

        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==boton1){
            texto = textfields.getText().trim();
            if(texto.equals("")){
                JOptionPane.showMessageDialog(null,"Debes ingresar tu nombre.");
            }else{
                Licencia ventanalicencia = new Licencia();
                ventanalicencia.setBounds(0,0,620,400);
                ventanalicencia.setVisible(true);
                ventanalicencia.setResizable(false);
                ventanalicencia.setLocationRelativeTo(null);
                this.setVisible(false);
            }

        }

    }
    public static void main(String args[]){
        Bienvenida ventanabienvenida = new Bienvenida();
        ventanabienvenida.setBounds(0,0,370,450);
        ventanabienvenida.setVisible(true);
        ventanabienvenida.setResizable(false);
        ventanabienvenida.setLocationRelativeTo(null);

    }
}
0  00 