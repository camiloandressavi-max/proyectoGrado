package Vista;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;


/**
 * Write a description of class JFTMunicipuos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JFTMunicipios extends JPanel
{
    private JLabel lblTitulo = new JLabel("Municipios afectados");
    private JLabel lblCodigo = new JLabel ("Codigo Del Incendio: ");
    private JLabel lblNombreMunicipio= new JLabel ("Nombre Del Municipio Afectado: ");
    private JLabel lblPoblacion= new JLabel ("Poblacion Del Municipio: ");
    private JTextField txtCodigo= new JTextField();
    private JTextField txtNombreMunicipio= new JTextField();
    private JTextField txtPoblacion= new JTextField();
    private JButton btnRegistrarMunicipios= new JButton("Registrar Municipios");
    private JButton btnListarMunicipios = new JButton("Listar Municipios");
    private JTextArea txtRespuestas= new JTextArea();
    
    private JScrollPane s= new JScrollPane(txtRespuestas);
    
    
    public JFTMunicipios(){
        setBackground(new Color(15, 23, 42));
        setBorder(new EmptyBorder(20, 20, 20, 20));
        
        estilizarTitulo(lblTitulo);
        
        txtRespuestas.setEditable(false);
        txtRespuestas.setBackground(new Color(30, 41, 59));
        txtRespuestas.setForeground(new Color(226, 232, 240));
        txtRespuestas.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        
        s.getViewport().setBackground(new Color(30, 41, 59));
        
        JPanel panelTitulo = new JPanel();
        panelTitulo.setLayout(new BorderLayout());
        panelTitulo.setBackground(new Color(15, 23, 42));
        panelTitulo.add(lblTitulo, BorderLayout.WEST);
        
        JPanel principal= new JPanel ();
        principal.setLayout(new GridLayout(1,2, 15, 0));
        principal.setBackground(new Color(15, 23, 42));
        
        JPanel municipios= new JPanel();
        municipios.setLayout(new GridBagLayout());
        municipios.setBackground(new Color(15, 23, 42));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.anchor = GridBagConstraints.WEST;
        
        estilizarLabel(lblCodigo);
        estilizarLabel(lblNombreMunicipio);
        estilizarLabel(lblPoblacion);
        
        estilizarTextField(txtCodigo);
        estilizarTextField(txtNombreMunicipio);
        estilizarTextField(txtPoblacion);
        
        estilizarBoton(btnRegistrarMunicipios);
        estilizarBoton(btnListarMunicipios);
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        municipios.add(lblCodigo, gbc);
        gbc.gridx = 1;
        municipios.add(txtCodigo, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        municipios.add(lblNombreMunicipio, gbc);
        gbc.gridx = 1;
        municipios.add(txtNombreMunicipio, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        municipios.add(lblPoblacion, gbc);
        gbc.gridx = 1;
        municipios.add(txtPoblacion, gbc);
        
        gbc.gridx = 0; gbc.gridy = 3;
        municipios.add(btnRegistrarMunicipios, gbc);
        gbc.gridx = 1;
        municipios.add(btnListarMunicipios, gbc);
        
        principal.add(municipios);
        
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