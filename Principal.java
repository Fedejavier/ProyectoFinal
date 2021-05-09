import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{

    private JMenuBar mb;
    private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
    private JMenuItem miCalculo, miRojo, miNegro, miMorado, miElCreador, miSalir, miNuevo;
    private JLabel labelLogo, labelBienvenido, labelTitle, labelNombre, labelAPaterno, labelAMaterno, labelDepartamento, labelAntiguedad, labelResultado, labelfooter;
    private JTextField txtNombreTrabajador, txtAPaterno, txtAMaterno;
    private JComboBox comboDepartamento, comboAntiguedad;
    private JScrollPane scrollpane1;
    private JTextArea textarea1;

    public Principal(){
        setLayout(null);
        setTitle("Pantalla principal");
        getContentPane().setBackground(new Color(255,0,0));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        
        mb = new JMenuBar();
        mb.setBackground(new Color(255,0,0));
        setJMenuBar(mb);

        menuOpciones = new JMenu("Opciones");
        menuOpciones.setBackground(new Color(255,0,0));
        menuOpciones.setFont(new Font("Andale Mono",1,14));
        menuOpciones.setForeground(new Color(255,255,255));
        mb.add(menuOpciones);

        menuCalcular = new JMenu("Calcular");
        menuCalcular.setBackground(new Color(255,0,0));
        menuCalcular.setFont(new Font("Andale Mono",1,14));
        menuCalcular.setForeground(new Color(255,255,255));
        mb.add(menuCalcular);

        menuAcercaDe = new JMenu("Acerca de");
        menuAcercaDe.setBackground(new Color(255,0,0));
        menuAcercaDe.setFont(new Font("Andale Mono",1,14));
        menuAcercaDe.setForeground(new Color(255,255,255));
        mb.add(menuAcercaDe);

        menuColorFondo = new JMenu("Color de Fondo");
        menuColorFondo.setFont(new Font("Andale Mono",1,14));
        menuColorFondo.setForeground(new Color(255,0,0));
        menuOpciones.add(menuColorFondo);

        miCalculo = new JMenuItem("Vacaciones");
        miCalculo.setFont(new Font("Andale Mono",1,14));
        miCalculo.setForeground(new Color(255,0,0));
        menuCalcular.add(miCalculo);
        miCalculo.addActionListener(this);

        miRojo = new JMenuItem("Rojo");
        miRojo.setFont(new Font("Andale Mono",1,14));
        miRojo.setForeground(new Color(255,0,0));
        menuColorFondo.add(miRojo);
        miRojo.addActionListener(this);

        miNegro = new JMenuItem("Negro");
        miNegro.setFont(new Font("Andale Mono",1,14));
        miNegro.setForeground(new Color(255,0,0));
        menuColorFondo.add(miNegro);
        miNegro.addActionListener(this);
        
        miMorado = new JMenuItem("Morado");
        miMorado.setFont(new Font("Andale Mono",1,14));
        miMorado.setForeground(new Color(255,0,0));
        menuColorFondo.add(miMorado);
        miMorado.addActionListener(this);

        miNuevo = new JMenuItem("Nuevo");
        miNuevo.setFont(new Font("Andale Mono",1,14));
        miNuevo.setForeground(new Color(255,0,0));
        menuOpciones.add(miNuevo);
        miNuevo.addActionListener(this);

        miElCreador = new JMenuItem("El Creador");
        miElCreador.setFont(new Font("Andale Mono",1,14));
        miElCreador.setForeground(new Color(255,0,0));
        menuAcercaDe.add(miElCreador);
        miElCreador.addActionListener(this);

        miSalir = new JMenuItem("Salir");
        miSalir.setFont(new Font("Andale Mono",1,14));
        miSalir.setForeground(new Color(255,0,0));
        menuOpciones.add(miSalir);
        miSalir.addActionListener(this);

        ImageIcon imagen = new ImageIcon("images/logo-coca.png");
        labelLogo = new JLabel(imagen);
        labelLogo.setBounds(5,5,250,100);
        add(labelLogo);

        labelBienvenido = new JLabel("Bienvenido");
        labelBienvenido.setBounds(200,30,300,50);
        labelBienvenido.setFont(new Font("Andale Mono",1,32));
        labelBienvenido.setForeground(new Color(255,255,255));
        add(labelBienvenido);

        labelTitle = new JLabel("Datos del Trabajador para el Calculo de Vacaciones");
        labelTitle.setBounds(45,140,900,25);
        labelTitle.setFont(new Font("Andale Mono",1,24));
        labelTitle.setForeground(new Color(255,255,255));
        add(labelTitle);

        labelNombre = new JLabel("Nombre");
        labelNombre.setBounds(25,188,180,25);
        labelNombre.setFont(new Font("Andale Mono",1,12));
        labelNombre.setForeground(new Color(255,255,255));
        add(labelNombre);

        txtNombreTrabajador = new JTextField();
        txtNombreTrabajador.setBounds(25,213,150,25);
        txtNombreTrabajador.setBackground(new java.awt.color(224,224,224));
        txtNombreTrabajador.setFont(new java.awt.font("Andale MOno",1,14));
        txtNombreTrabajador.setForeground(new java.awt.color(255,0,0));
        add(txtNombreTrabajador);
        




        
    }

}