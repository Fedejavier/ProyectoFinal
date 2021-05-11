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
        labelBienvenido.setBounds(350,30,300,50);
        labelBienvenido.setFont(new Font("Andale Mono",1,32));
        labelBienvenido.setForeground(new Color(255,255,255));
        add(labelBienvenido);

        labelTitle = new JLabel("Datos del Trabajador para el Calculo de Vacaciones");
        labelTitle.setBounds(20,140,900,25);
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
        txtNombreTrabajador.setBackground(new java.awt.Color(224,224,224));
        txtNombreTrabajador.setFont(new java.awt.Font("Andale Mono",1,14));
        txtNombreTrabajador.setForeground(new java.awt.Color(255,0,0));
        add(txtNombreTrabajador);
        
        labelAPaterno = new JLabel("Apellido Paterno");
        labelAPaterno.setBounds(25,248,180,25);
        labelAPaterno.setFont(new Font("Andale Mono",1,12));
        labelAPaterno.setForeground(new Color(255,255,255));
        add(labelAPaterno);

        txtAPaterno = new JTextField();
        txtAPaterno.setBounds(25,273,150,25);
        txtAPaterno.setBackground(new java.awt.Color(224,224,224));
        txtAPaterno.setFont(new java.awt.Font("Andale Mono",1,14));
        txtAPaterno.setForeground(new java.awt.Color(255,0,0));
        add(txtAPaterno);

        labelAMaterno = new JLabel("Apellido Materno");
        labelAMaterno.setBounds(25,308,180,25);
        labelAMaterno.setFont(new Font("Andale Mono",1,12));
        labelAMaterno.setForeground(new Color(255,255,255));
        add(labelAMaterno);

        txtAMaterno = new JTextField();
        txtAMaterno.setBounds(25,334,150,25);
        txtAMaterno.setBackground(new java.awt.Color(224,224,224));
        txtAMaterno.setFont(new java.awt.Font("Andale Mono",1,14));
        txtAMaterno.setForeground(new java.awt.Color(255,0,0));
        add(txtAMaterno);

        labelDepartamento = new JLabel("Selecciona el Departamento");
        labelDepartamento.setBounds(220,188,180,25);
        labelDepartamento.setFont(new Font("Andale Mono",1,12));
        labelDepartamento.setForeground(new Color(255,255,255));
        add(labelDepartamento);

        comboDepartamento = new JComboBox();
        comboDepartamento.setBounds(220,213,220,25);
        comboDepartamento.setBackground(new java.awt.Color(224,224,224));
        comboDepartamento.setFont(new java.awt.Font("Andale Mono",1,14));
        comboDepartamento.setForeground(new java.awt.Color(255,0,0));
        add(comboDepartamento);
        comboDepartamento.addItem("");
        comboDepartamento.addItem("Atencion al Cliente");
        comboDepartamento.addItem("Departamento LOgistica");
        comboDepartamento.addItem("Departamento de Gerencia");

        labelAntiguedad = new JLabel("Selecciona la Antiguedad");
        labelAntiguedad.setBounds(220,248,180,25);
        labelAntiguedad.setFont(new Font("Andale Mono",1,12));
        labelAntiguedad.setForeground(new Color(255,255,255));
        add(labelAntiguedad);

        comboAntiguedad = new JComboBox();
        comboAntiguedad.setBounds(220,273,220,25);
        comboAntiguedad.setBackground(new java.awt.Color(224,224,224));
        comboAntiguedad.setFont(new java.awt.Font("Andale Mono",1,14));
        comboAntiguedad.setForeground(new java.awt.Color(255,0,0));
        add(comboAntiguedad);
        comboAntiguedad.addItem("");
        comboAntiguedad.addItem("1 año de Servicio");
        comboAntiguedad.addItem("2 a 6 Años de Servicio");
        comboAntiguedad.addItem("7 años o mas de Servicio");

        labelResultado = new JLabel("Resultado del Calculo");
        labelResultado.setBounds(220,307,180,25);
        labelResultado.setFont(new Font("Andale Mono",1,12));
        labelResultado.setForeground(new Color(255,255,255));
        add(labelResultado);

        textarea1 = new JTextArea();
        textarea1.setEditable(false);
        textarea1.setBackground(new Color(224,224,224));
        textarea1.setFont(new Font("Andale Mono",1,11));
        textarea1.setForeground(new Color(255,0,0));
        textarea1.setText("\n  Aqui aparece el resultado del calculo de las vacaciones.");
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(220,333,385,90);
        add(scrollpane1);

        labelfooter = new JLabel("©2021 the Coca-Cola Company  / Todos los derechos reservados");
        labelfooter.setBounds(135,445,500,30);
        labelfooter.setFont(new java.awt.Font("Andale Mono",1,12));
        labelfooter.setForeground(new java.awt.Color(255,255,255));
        add(labelfooter);

               
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==miCalculo){

        }
        if(e.getSource()==miRojo){

        }
        if(e.getSource()==miNegro){

        }
        if(e.getSource()==miMorado){

        }
        if(e.getSource()==miNuevo){

        }
        if(e.getSource()==miSalir){

        }
        if(e.getSource()==miElCreador){

        }
    }
    public static void main(String args[]) {
        Principal ventaPrincipal = new Principal();
        ventaPrincipal.setBounds(0,0,640,535);
        ventaPrincipal.setVisible(true);
        ventaPrincipal.setResizable(false);
        ventaPrincipal.setLocationRelativeTo(null);


    }

}