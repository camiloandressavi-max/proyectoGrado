package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 * Write a description of class JFTUnidadTerrestre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JFTUnidadTerrestre extends JPanel
{
    private JLabel lblTitulo = new JLabel("Unidades Terrestres");
    private JLabel lblCodigo = new JLabel ("Codigo De La Unidad Terrestre: ");
    private JLabel lblCantidad= new JLabel ("Cantidad De Personal De Rescate: ");
    private JTextField txtCodigo= new JTextField();
    private JTextField txtCantidad= new JTextField();
    private JCheckBox chkCertificado= new JCheckBox ("Posee Certificado");
    private JLabel lblRelleno= new JLabel("");
    private JButton btnRegistrarMunicipios= new JButton("Registrar Unidades Terrestres");
    private JButton btnListarMunicipios = new JButton("Listar Unidades Terrestres");
    private JTextArea txtRespuestasUnidad= new JTextArea();
    
    private JScrollPane s= new JScrollPane(txtRespuestasUnidad);
    
    
    public JFTUnidadTerrestre(){
        setBackground(new Color(15, 23, 42));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        // Estilo título
        estilizarTitulo(lblTitulo);
        
        txtRespuestasUnidad.setEditable(false);
        txtRespuestasUnidad.setBackground(new Color(30, 41, 59));
        txtRespuestasUnidad.setForeground(new Color(226, 232, 240));
        txtRespuestasUnidad.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        
        s.getViewport().setBackground(new Color(30, 41, 59));
        
        JPanel panelTitulo = new JPanel();
        panelTitulo.setLayout(new BorderLayout());
        panelTitulo.setBackground(new Color(15, 23, 42));
        panelTitulo.add(lblTitulo, BorderLayout.WEST);
        
        JPanel principal= new JPanel ();
        principal.setLayout(new GridLayout(1,2, 15, 0));
        principal.setBackground(new Color(15, 23, 42));
        
        JPanel unidad= new JPanel();
        unidad.setLayout(new GridBagLayout());
        unidad.setBackground(new Color(15, 23, 42));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.anchor = GridBagConstraints.WEST;
        
        estilizarLabel(lblCodigo);
        estilizarLabel(lblCantidad);
        
        estilizarTextField(txtCodigo);
        estilizarTextField(txtCantidad);
        
        estilizarCheckBox(chkCertificado);
        estilizarLabel(lblRelleno);
        
        estilizarBoton(btnRegistrarMunicipios);
        estilizarBoton(btnListarMunicipios);
        
        gbc.gridx = 0; gbc.gridy = 0;
        unidad.add(lblCodigo, gbc);
        gbc.gridx = 1;
        unidad.add(txtCodigo, gbc);
        
        gbc.gridx = 0; gbc.gridy = 1;
        unidad.add(lblCantidad, gbc);
        gbc.gridx = 1;
        unidad.add(txtCantidad, gbc);
        
        gbc.gridx = 0; gbc.gridy = 2;
        unidad.add(chkCertificado, gbc);
        gbc.gridx = 1;
        unidad.add(lblRelleno, gbc);
        
        gbc.gridx = 0; gbc.gridy = 3;
        unidad.add(btnRegistrarMunicipios, gbc);
        gbc.gridx = 1;
        unidad.add(btnListarMunicipios, gbc);
        
        principal.add(unidad);
        
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
    
    private void estilizarCheckBox(JCheckBox chk) {
        chk.setBackground(new Color(15, 23, 42));
        chk.setForeground(new Color(203, 213, 225));
        chk.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        chk.setOpaque(true);
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