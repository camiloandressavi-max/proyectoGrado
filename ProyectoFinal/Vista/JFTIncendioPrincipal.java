package Vista;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class JFTIncendioPrincipal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JFTIncendioPrincipal extends JFrame implements ActionListener
{
    
    private JLabel lblUNGRD= new JLabel("UNGRD");
    private JLabel lblIncendios= new JLabel("Incendios Forestales");
    private JButton btnMunicipios= new JButton("Municipios Afectados");
    private JButton btnUnidadesTerrestres= new JButton ("Unidades Terrestres");
    private JButton btnHelicopteros= new JButton ("Helicopteros");
    private JButton btnOperacion = new JButton ("Iniciar Operaciones");
    private JFTMunicipios municipios;
    private JFTHelicoptero helicoptero;
    private JFTUnidadTerrestre terrestre;
    private JFTIniciarOperacion operacion;
    private CardLayout card= new CardLayout();
    private JPanel contenedor= new JPanel();

    public JFTIncendioPrincipal(){
        setTitle("Sistema De Accion Contra Incendios-UNGRD");
        setSize(1400,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        crearInterfaz();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void estilizarBoton(JButton boton){
    Color normal = new Color(30, 41, 59);
    Color conMouseEncima = new Color(51, 65, 85);
    Color presionado = new Color(249, 115, 22);

    boton.setMaximumSize(new Dimension(Integer.MAX_VALUE, 44));
    boton.setAlignmentX(Component.LEFT_ALIGNMENT);
    boton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
    boton.setForeground(new Color(226, 232, 240));
    boton.setFocusPainted(false);
    boton.setBorderPainted(false);
    boton.setOpaque(true);
    boton.setHorizontalAlignment(SwingConstants.LEFT);
    boton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

    boton.setBackground(normal);
    boton.getModel().addChangeListener(e -> {
        if (boton.getModel().isPressed()) {
            boton.setBackground(presionado);
        } else if (boton.getModel().isRollover()) {
            boton.setBackground(conMouseEncima);
        } else {
            boton.setBackground(normal);
        }
    });
    }  

    public void crearInterfaz(){
        municipios= new JFTMunicipios();
        helicoptero= new JFTHelicoptero();
        terrestre= new JFTUnidadTerrestre();
        operacion= new JFTIniciarOperacion();
        JPanel principal = new JPanel ();
        principal.setLayout(new BorderLayout());
        
        JPanel lateral= new JPanel();
        lateral.setLayout(new BoxLayout(lateral,BoxLayout.Y_AXIS));
        
        estilizarBoton(btnMunicipios);
        estilizarBoton(btnUnidadesTerrestres);
        estilizarBoton(btnHelicopteros);
        estilizarBoton(btnOperacion);  
        
        lateral.add(lblUNGRD);
        lateral.add(Box.createRigidArea(new Dimension(0,4)));
        lateral.add(lblIncendios);
        lateral.add(Box.createRigidArea(new Dimension(0,4)));
        lateral.add(btnMunicipios);
        lateral.add(Box.createRigidArea(new Dimension(0,4)));
        lateral.add(btnUnidadesTerrestres);
        lateral.add(Box.createRigidArea(new Dimension(0,4)));
        lateral.add(btnHelicopteros);
        lateral.add(Box.createRigidArea(new Dimension(0,4)));
        lateral.add(btnOperacion);
        lateral.setBackground(new Color(30, 41, 59));
        lateral.setPreferredSize(new Dimension(220, 0));
        lateral.setBorder(BorderFactory.createEmptyBorder(24, 16, 24, 16));
        
        lblUNGRD.setFont(new Font("Segoe UI", Font.BOLD, 20));
        lblUNGRD.setForeground(Color.WHITE);
        lblUNGRD.setAlignmentX(Component.LEFT_ALIGNMENT);

        lblIncendios.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        lblIncendios.setForeground(new Color(203, 213, 225));
        lblIncendios.setAlignmentX(Component.LEFT_ALIGNMENT); 
     
        
        principal.add(lateral,BorderLayout.WEST);
        
        contenedor.setLayout(card);
        
        principal.add(contenedor,BorderLayout.CENTER);
        
        contenedor.add(municipios, "municipios");
        contenedor.add(terrestre, "terrestre");
        contenedor.add(helicoptero, "helicoptero");
        contenedor.add(operacion, "operacion");
        
        btnMunicipios.addActionListener(this);
        btnUnidadesTerrestres.addActionListener(this);
        btnHelicopteros.addActionListener(this);
        btnOperacion.addActionListener(this);
        
        add(principal);
    } 
    
    public void actionPerformed(ActionEvent e){
        String comando= e.getActionCommand();
        if (comando.equals("Municipios Afectados")) {
            card.show(contenedor, "municipios");
        }else if (comando.equals ("Unidades Terrestres")){
            card.show(contenedor, "terrestre");
        }else if (comando.equals ("Helicopteros")){
            card.show(contenedor, "helicoptero");
        }else if (comando.equals ("Iniciar Operaciones")){
            card.show(contenedor, "operacion");

}
}

}