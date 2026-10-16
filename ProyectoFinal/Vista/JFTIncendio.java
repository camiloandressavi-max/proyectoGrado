package Vista;

import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class JFTIncendio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JFTIncendio extends JFrame 
{
    
    //primer panel
    public JTextField txtMunicipioIncendio = new JTextField(10);
    public JTextField txtNivelAlerta = new JTextField(10);
    public JTextField txtCantidadIncendios = new JTextField(10);
    public JButton btnRegistrarIncendio = new JButton("Registrar");
    public JButton btnListarIncendios = new JButton("Listar Incendios");
    public JTextArea areaIncendios = new JTextArea(6, 25);
    
    //segundo panel
    public JTextField txtNombreRescatista = new JTextField(10);
    public JTextField txtCodigoRescatista = new JTextField(10);
    public JTextField txtCertificadoRescatista = new JTextField(10);
    public JButton btnRegistrarRescatistas = new JButton("Registrar Rescatistas");
    public JButton btnListarRescatistas = new JButton("Listar rescatistas");
    public JTextArea areaRescatistas = new JTextArea(6, 25);

    
    //tercer panel
    public JTextField txtCodigoHeli = new JTextField(10);
    public JTextField txtPilotoHeli = new JTextField(10);
    public JCheckBox chkBambiBucket = new JCheckBox("Posee bambi Bucket");
    public JButton btnRegistrarHelicopteros = new JButton("Registrar Helicópteros");
    public JButton btnListaHelicoptero = new JButton("Lista helicóptero");
    public JTextArea areaHelicopteros = new JTextArea(6, 25);
    
    //cuarto panel
    public JTextField txtMunicipioOperacion = new JTextField(10);
    public JComboBox<String> cmbUnidadTerrestre = new JComboBox<>(new String[]{"Item 1"});
    public JComboBox<String> cmbHelicopteroOp = new JComboBox<>(new String[]{"Item 1"});
    public JButton btnIniciarOperacion = new JButton("Iniciar Operacion");
    public JTextArea areaOperaciones = new JTextArea(6, 25);

    public JFTIncendio() {
        setTitle("Sistema de Gestión de Riesgo - UNGRD");
        setSize(1100, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        crearInterfaz();
        
        setVisible(true);
    }

    private void crearInterfaz() {
        setLayout(new BorderLayout(10, 10));

        JPanel panelSuperior = new JPanel();
        panelSuperior.setLayout(new BoxLayout(panelSuperior, BoxLayout.Y_AXIS));

        JLabel lblTitulo = new JLabel("Sistema de respuesta a desastres", JLabel.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 28));
        lblTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);

        ImageIcon iconoOriginal = new ImageIcon("C:/Users/Camilo Salazar/OneDrive/Documentos/ProyectoFinal/Imagenes/descarga.jpg");
        JLabel lblImagen = new JLabel(iconoOriginal);
        lblImagen.setAlignmentX(Component.CENTER_ALIGNMENT);

        
        panelSuperior.add(lblTitulo);        
        panelSuperior.add(lblImagen);

        add(panelSuperior, BorderLayout.NORTH);

        JPanel panelCentral = new JPanel(new GridLayout(2, 2, 10, 10));

        JPanel panelIncendios = new JPanel(new BorderLayout(5, 5));
        panelIncendios.setBorder(BorderFactory.createTitledBorder("Registrar Incendios"));
        JPanel incendios = new JPanel(new GridLayout(3, 3, 5, 5));
        incendios.add(new JLabel("Municipio"));
        incendios.add(txtMunicipioIncendio);
        incendios.add(btnRegistrarIncendio);
        incendios.add(new JLabel("Nivel de Alerta"));
        incendios.add(txtNivelAlerta);
        incendios.add(btnListarIncendios);
        incendios.add(new JLabel("Cantidad de incendios"));
        incendios.add(txtCantidadIncendios);
        incendios.add(new JLabel(""));
        panelIncendios.add(incendios, BorderLayout.NORTH);
        panelIncendios.add(new JScrollPane(areaIncendios), BorderLayout.CENTER);
        panelCentral.add(panelIncendios);

        JPanel panelRescatistas = new JPanel(new BorderLayout(5, 5));
        panelRescatistas.setBorder(BorderFactory.createTitledBorder("Registrar Rescatistas Terrestres"));
        JPanel rescatistas = new JPanel(new GridLayout(3, 3, 5, 5));
        rescatistas.add(new JLabel("nombre"));
        rescatistas.add(txtNombreRescatista);
        rescatistas.add(btnRegistrarRescatistas);
        rescatistas.add(new JLabel("codigo"));
        rescatistas.add(txtCodigoRescatista);
        rescatistas.add(btnListarRescatistas);
        rescatistas.add(new JLabel("certificado"));
        rescatistas.add(txtCertificadoRescatista);
        rescatistas.add(new JLabel(""));
        panelRescatistas.add(rescatistas, BorderLayout.NORTH);
        panelRescatistas.add(new JScrollPane(areaRescatistas), BorderLayout.CENTER);
        panelCentral.add(panelRescatistas);

        JPanel panelHelicopteros = new JPanel(new BorderLayout(5, 5));
        panelHelicopteros.setBorder(BorderFactory.createTitledBorder("Helicopteros"));
        JPanel helicopteros = new JPanel(new GridLayout(3, 3, 5, 5));
        helicopteros.add(new JLabel("Codigo"));
        helicopteros.add(txtCodigoHeli);
        helicopteros.add(btnRegistrarHelicopteros);
        helicopteros.add(new JLabel("Piloto"));
        helicopteros.add(txtPilotoHeli);
        helicopteros.add(btnListaHelicoptero);
        helicopteros.add(chkBambiBucket);
        helicopteros.add(new JLabel(""));
        helicopteros.add(new JLabel(""));
        panelHelicopteros.add(helicopteros, BorderLayout.NORTH);
        panelHelicopteros.add(new JScrollPane(areaHelicopteros), BorderLayout.CENTER);
        panelCentral.add(panelHelicopteros);

        JPanel panelOperaciones = new JPanel(new BorderLayout(5, 5));
        panelOperaciones.setBorder(BorderFactory.createTitledBorder("Operaciones De Rescate"));
        JPanel operaciones = new JPanel(new GridLayout(3, 3, 5, 5));
        operaciones.add(new JLabel("Municipio"));
        operaciones.add(txtMunicipioOperacion);
        operaciones.add(btnIniciarOperacion);
        operaciones.add(new JLabel("Unidad Terrestre"));
        operaciones.add(cmbUnidadTerrestre);
        operaciones.add(new JLabel(""));
        operaciones.add(new JLabel("Helicoptero"));
        operaciones.add(cmbHelicopteroOp);
        operaciones.add(new JLabel(""));
        panelOperaciones.add(operaciones, BorderLayout.NORTH);
        panelOperaciones.add(new JScrollPane(areaOperaciones), BorderLayout.CENTER);
        panelCentral.add(panelOperaciones);

        add(panelCentral, BorderLayout.CENTER);
    }
}