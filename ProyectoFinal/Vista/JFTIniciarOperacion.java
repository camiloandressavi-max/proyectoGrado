package Vista;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Modelo.*;
/**
 * Write a description of class JFTIniciarOperacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JFTIniciarOperacion extends JPanel
{
    private JLabel lblTitulo = new JLabel("Iniciar Operaciones");
    private JLabel lblIncendio = new JLabel ("Incendio: ");
    private JLabel lblFecha = new JLabel ("Fecha De La Operacion: ");
    private JLabel lblMunicipio= new JLabel ("Municipio Afectado: ");
    private JLabel lblUnidad= new JLabel ("Unidad Terrestre A Desplegar: ");
    private JLabel lblHelicoptero= new JLabel ("Helicoptero A Desplegar: ");
    private JTextField txtFecha= new JTextField();
    private JComboBox<Object> cmbIncendio = new JComboBox<>();
    private JComboBox<MunicipiosAfectados> cmbMunicipio = new JComboBox<MunicipiosAfectados>();
    private JComboBox<UnidadTerrestre> cmbUnidad= new JComboBox<UnidadTerrestre>();
    private JComboBox<Helicoptero> cmbHelicoptero= new JComboBox<Helicoptero>();
    private JButton btnOperacion= new JButton("Iniciar Operacion");
   
    private JTextArea txtRespuestasOperacion= new JTextArea();
    
    private JScrollPane s= new JScrollPane(txtRespuestasOperacion);
    
    
    public JFTIniciarOperacion(){
        setBackground(new Color(15, 23, 42));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        estilizarTitulo(lblTitulo);
        
        txtRespuestasOperacion.setEditable(false);
        txtRespuestasOperacion.setBackground(new Color(30, 41, 59));
        txtRespuestasOperacion.setForeground(new Color(226, 232, 240));
        txtRespuestasOperacion.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        
        s.getViewport().setBackground(new Color(30, 41, 59));
        
        JPanel panelTitulo = new JPanel();
        panelTitulo.setLayout(new BorderLayout());
        panelTitulo.setBackground(new Color(15, 23, 42));
        panelTitulo.add(lblTitulo, BorderLayout.WEST);
        
        JPanel principal= new JPanel ();
        principal.setLayout(new GridLayout(1,2, 15, 0));
        principal.setBackground(new Color(15, 23, 42));
        
        JPanel operacion= new JPanel();
        operacion.setLayout(new GridBagLayout());
        operacion.setBackground(new Color(15, 23, 42));
        
        GridBagConstraints gbcLabel = new GridBagConstraints();
        gbcLabel.insets = new Insets(8, 8, 8, 8);
        gbcLabel.anchor = GridBagConstraints.WEST;
        gbcLabel.fill = GridBagConstraints.NONE;
        
        GridBagConstraints gbcComponent = new GridBagConstraints();
        gbcComponent.insets = new Insets(8, 8, 8, 8);
        gbcComponent.anchor = GridBagConstraints.WEST;
        gbcComponent.fill = GridBagConstraints.HORIZONTAL;
        gbcComponent.weightx = 1.0;
        
        estilizarLabel(lblIncendio);
        estilizarLabel(lblFecha);
        estilizarLabel(lblMunicipio);
        estilizarLabel(lblUnidad);
        estilizarLabel(lblHelicoptero);
 
        estilizarTextField(txtFecha);
        estilizarComboBox(cmbIncendio);
        estilizarComboBox(cmbMunicipio);
        estilizarComboBox(cmbUnidad);
        estilizarComboBox(cmbHelicoptero);
        
        estilizarBoton(btnOperacion);
        
        gbcLabel.gridx = 0; gbcLabel.gridy = 0;
        operacion.add(lblFecha, gbcLabel);
        gbcComponent.gridx = 1; gbcComponent.gridy = 0;
        operacion.add(txtFecha, gbcComponent);
 
        gbcLabel.gridx = 0; gbcLabel.gridy = 1;
        operacion.add(lblMunicipio, gbcLabel);
        gbcComponent.gridx = 1; gbcComponent.gridy = 1;
        operacion.add(cmbMunicipio, gbcComponent);
 
        gbcLabel.gridx = 0; gbcLabel.gridy = 2;
        operacion.add(lblIncendio, gbcLabel);
        gbcComponent.gridx = 1; gbcComponent.gridy = 2;
        operacion.add(cmbIncendio, gbcComponent);
 
        gbcLabel.gridx = 0; gbcLabel.gridy = 3;
        operacion.add(lblUnidad, gbcLabel);
        gbcComponent.gridx = 1; gbcComponent.gridy = 3;
        operacion.add(cmbUnidad, gbcComponent);
 
        gbcLabel.gridx = 0; gbcLabel.gridy = 4;
        operacion.add(lblHelicoptero, gbcLabel);
        gbcComponent.gridx = 1; gbcComponent.gridy = 4;
        operacion.add(cmbHelicoptero, gbcComponent);
 
        gbcLabel.gridx = 0; gbcLabel.gridy = 5;
        gbcLabel.fill = GridBagConstraints.NONE;
        operacion.add(btnOperacion, gbcLabel);
        
        principal.add(operacion);
        principal.add(new JLabel(""));
        
        JPanel lista= new JPanel();
        lista.setLayout(new BorderLayout());
        lista.setBackground(new Color(15, 23, 42));
        lista.add(s,BorderLayout.CENTER);
        
        principal.add(lista);
        
        setLayout(new BorderLayout(0, 15));
        add(panelTitulo, BorderLayout.NORTH);
        add(principal, BorderLayout.CENTER);
        
        setVisible(true);
    }
    
    private void estilizarTitulo(JLabel label) {
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Segoe UI", Font.BOLD, 18));
    }
    
    private void estilizarLabel(JLabel label) {
        label.setForeground(new Color(203, 213, 225));
        label.setFont(new Font("Segoe UI", Font.PLAIN, 12));
    }
    
    private void estilizarTextField(JTextField field) {
        field.setPreferredSize(new Dimension(200, 32));
        field.setBackground(new Color(30, 41, 59));
        field.setForeground(new Color(226, 232, 240));
        field.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        field.setCaretColor(new Color(226, 232, 240));
        field.setBorder(BorderFactory.createLineBorder(new Color(51, 65, 85), 1));
    }
    
    private void estilizarComboBox(JComboBox<?> cmb) {
        cmb.setPreferredSize(new Dimension(200, 32));
        cmb.setBackground(new Color(30, 41, 59));
        cmb.setForeground(new Color(226, 232, 240));
        cmb.setFont(new Font("Segoe UI", Font.PLAIN, 12));
    }
    
    private void estilizarBoton(JButton boton) {
        boton.setPreferredSize(new Dimension(160, 36));
        
        Color normal = new Color(30, 41, 59);
        Color presionado = new Color(234, 88, 12);
        Color conMouseEncima = new Color(51, 65, 85);
        
        boton.setBackground(normal);
        boton.setForeground(new Color(226, 232, 240));
        boton.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        boton.setFocusPainted(false);
        boton.setBorderPainted(false);
        boton.setOpaque(true);
        boton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
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
}