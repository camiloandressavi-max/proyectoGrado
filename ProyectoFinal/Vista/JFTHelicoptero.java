package Vista;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Write a description of class JFTHelicoptero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JFTHelicoptero extends JPanel
{
    private JLabel lblTitulo = new JLabel("Helicopteros");
    private JLabel lblNombre = new JLabel ("Nombre Del Piloto: ");
    private JLabel lblCodigo= new JLabel ("Codigo Del Helicoptero: ");
    private JTextField txtNombre= new JTextField();
    private JTextField txtCodigo= new JTextField();
    private JCheckBox chkBambiBucket= new JCheckBox ("Posee Bambi Bucket");
    private JLabel lblRelleno= new JLabel("");
    private JButton btnRegistrarHelicopteros= new JButton("Registrar Helicopteros");
    private JButton btnListarHelicopteros = new JButton("Listar Helicopteros");
    private JTextArea txtRespuestasHelicoptero= new JTextArea();
    
    private JScrollPane s= new JScrollPane(txtRespuestasHelicoptero);
    
    
    public JFTHelicoptero(){
        setBackground(new Color(15, 23, 42));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        estilizarTitulo(lblTitulo);
        
        txtRespuestasHelicoptero.setEditable(false);
        txtRespuestasHelicoptero.setBackground(new Color(30, 41, 59));
        txtRespuestasHelicoptero.setForeground(new Color(226, 232, 240));
        txtRespuestasHelicoptero.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        
        s.getViewport().setBackground(new Color(30, 41, 59));
        
        JPanel panelTitulo = new JPanel();
        panelTitulo.setLayout(new BorderLayout());
        panelTitulo.setBackground(new Color(15, 23, 42));
        panelTitulo.add(lblTitulo, BorderLayout.WEST);
        
        JPanel principal= new JPanel ();
        principal.setLayout(new GridLayout(1,2, 15, 0));
        principal.setBackground(new Color(15, 23, 42));
        
        JPanel helicoptero= new JPanel();
        helicoptero.setLayout(new GridBagLayout());
        helicoptero.setBackground(new Color(15, 23, 42));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.anchor = GridBagConstraints.WEST;
        
        estilizarLabel(lblNombre);
        estilizarLabel(lblCodigo);
        
        estilizarTextField(txtNombre);
        estilizarTextField(txtCodigo);
        
        estilizarCheckBox(chkBambiBucket);
        estilizarLabel(lblRelleno);
        
        estilizarBoton(btnRegistrarHelicopteros);
        estilizarBoton(btnListarHelicopteros);
        
        gbc.gridx = 0; gbc.gridy = 0;
        helicoptero.add(lblNombre, gbc);
        gbc.gridx = 1;
        helicoptero.add(txtNombre, gbc);
        
        gbc.gridx = 0; gbc.gridy = 1;
        helicoptero.add(lblCodigo, gbc);
        gbc.gridx = 1;
        helicoptero.add(txtCodigo, gbc);
        
        gbc.gridx = 0; gbc.gridy = 2;
        helicoptero.add(chkBambiBucket, gbc);
        gbc.gridx = 1;
        helicoptero.add(lblRelleno, gbc);
        
        gbc.gridx = 0; gbc.gridy = 3;
        helicoptero.add(btnRegistrarHelicopteros, gbc);
        gbc.gridx = 1;
        helicoptero.add(btnListarHelicopteros, gbc);
        
        principal.add(helicoptero);
        
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