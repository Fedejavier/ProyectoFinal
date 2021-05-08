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
        
    }

}