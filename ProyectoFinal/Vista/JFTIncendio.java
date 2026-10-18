package Vista;
import Modelo.*;
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
    public JTextField txtNombreMunicipio = new JTextField(10);
    public JTextField txtPoblacionMunicipio = new JTextField(10);
    public JComboBox<NivelDeAlerta> cmbNivelAlerta = new JComboBox<>(NivelDeAlerta.values());
    public JTextField txtCantidadIncendios = new JTextField(10);
    public JButton btnRegistrarMunicipio = new JButton("Registrar");
    public JButton btnListarMunicipios = new JButton("Listar Municipios");
    public JTextArea txtAreaIncendios = new JTextArea(6, 25);
    
    public JTextField txtCodigoTerrestre = new JTextField(10);
    public JTextField txtCantidadIntegrantesTerrestre = new JTextField(10);
    public JCheckBox chkCertificadoTerrestre = new JCheckBox("Equipo Certificado");
    public JButton btnRegistrarTerrestre = new JButton("Registrar Terrestre");
    public JButton btnListarTerrestres = new JButton("Listar Terrestres");
    public JTextArea txtAreaRescatistas = new JTextArea(6, 25);

    public JTextField txtCodigoHeli = new JTextField(10);
    public JTextField txtPilotoHeli = new JTextField(10);
    public JButton btnRegistrarHelicopteros = new JButton("Registrar Helicópteros");
    public JButton btnListaHelicoptero = new JButton("Lista Helicóptero");
    public JTextArea txtAreaHelicopteros = new JTextArea(6, 25);
    
    public JTextField txtFechaOperacion = new JTextField(10);
    public JComboBox<String> cmbMunicipioOp = new JComboBox<>(new String[]{"Seleccionar..."});
    public JComboBox<String> cmbUnidadTerrestreOp = new JComboBox<>(new String[]{"Seleccionar..."});
    public JComboBox<String> cmbHelicopteroOp = new JComboBox<>(new String[]{"Seleccionar..."});
    public JButton btnIniciarOperacion = new JButton("Iniciar Operacion");
    public JTextArea txtAreaOperaciones = new JTextArea(6, 25);

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
        panelIncendios.setBorder(BorderFactory.createTitledBorder("Registrar Municipios Afectados"));
        JPanel incendios = new JPanel(new GridLayout(4, 3, 5, 5));
        incendios.add(new JLabel("Municipio"));
        incendios.add(txtNombreMunicipio);
        incendios.add(btnRegistrarMunicipio);
        incendios.add(new JLabel("Población"));
        incendios.add(txtPoblacionMunicipio);
        incendios.add(btnListarMunicipios);
        incendios.add(new JLabel("Nivel de Alerta"));
        incendios.add(cmbNivelAlerta);
        incendios.add(new JLabel(""));
        incendios.add(new JLabel("Cant. Incendios"));
        incendios.add(txtCantidadIncendios);
        incendios.add(new JLabel(""));
        panelIncendios.add(incendios, BorderLayout.NORTH);
        panelIncendios.add(new JScrollPane(txtAreaIncendios), BorderLayout.CENTER);
        panelCentral.add(panelIncendios);

        JPanel panelRescatistas = new JPanel(new BorderLayout(5, 5));
        panelRescatistas.setBorder(BorderFactory.createTitledBorder("Registrar Unidades Terrestres"));
        JPanel rescatistas = new JPanel(new GridLayout(3, 3, 5, 5));
        rescatistas.add(new JLabel("Código Equipo"));
        rescatistas.add(txtCodigoTerrestre);
        rescatistas.add(btnRegistrarTerrestre);
        rescatistas.add(new JLabel("Cant. Integrantes"));
        rescatistas.add(txtCantidadIntegrantesTerrestre);
        rescatistas.add(btnListarTerrestres);
        rescatistas.add(chkCertificadoTerrestre);
        rescatistas.add(new JLabel(""));
        rescatistas.add(new JLabel(""));
        panelRescatistas.add(rescatistas, BorderLayout.NORTH);
        panelRescatistas.add(new JScrollPane(txtAreaRescatistas), BorderLayout.CENTER);
        panelCentral.add(panelRescatistas);

        JPanel panelHelicopteros = new JPanel(new BorderLayout(5, 5));
        panelHelicopteros.setBorder(BorderFactory.createTitledBorder("Helicópteros"));
        JPanel helicopteros = new JPanel(new GridLayout(2, 3, 5, 5));
        helicopteros.add(new JLabel("Código"));
        helicopteros.add(txtCodigoHeli);
        helicopteros.add(btnRegistrarHelicopteros);
        helicopteros.add(new JLabel("Piloto"));
        helicopteros.add(txtPilotoHeli);
        helicopteros.add(btnListaHelicoptero);
        panelHelicopteros.add(helicopteros, BorderLayout.NORTH);
        panelHelicopteros.add(new JScrollPane(txtAreaHelicopteros), BorderLayout.CENTER);
        panelCentral.add(panelHelicopteros);

        JPanel panelOperaciones = new JPanel(new BorderLayout(5, 5));
        panelOperaciones.setBorder(BorderFactory.createTitledBorder("Operaciones De Rescate"));
        JPanel operaciones = new JPanel(new GridLayout(4, 3, 5, 5));
        operaciones.add(new JLabel("Fecha (dd/mm/aaaa)"));
        operaciones.add(txtFechaOperacion);
        operaciones.add(btnIniciarOperacion);
        operaciones.add(new JLabel("Municipio"));
        operaciones.add(cmbMunicipioOp);
        operaciones.add(new JLabel(""));
        operaciones.add(new JLabel("Unidad Terrestre"));
        operaciones.add(cmbUnidadTerrestreOp);
        operaciones.add(new JLabel(""));
        operaciones.add(new JLabel("Helicóptero"));
        operaciones.add(cmbHelicopteroOp);
        operaciones.add(new JLabel(""));
        panelOperaciones.add(operaciones, BorderLayout.NORTH);
        panelOperaciones.add(new JScrollPane(txtAreaOperaciones), BorderLayout.CENTER);
        panelCentral.add(panelOperaciones);

        add(panelCentral, BorderLayout.CENTER);
    }
}