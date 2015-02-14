package uml;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.EventQueue;

import java.awt.Font;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import superEmpleado.modelo.Empleado;
import superEmpleado.modelo.Empresa;

//import oracle.jdeveloper.layout.PaneLayout;

public class Nomina extends JFrame {
    
    private JPanel jPanel1 = new JPanel();
    private JLabel jLabel1 = new JLabel();
   // private PaneLayout paneLayout1 = new oracle.jdeveloper.layout.PaneLayout();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JTextField textCodigo = new JTextField();
    private JTextField textNombre = new JTextField();
    private JTextField textApellido = new JTextField();
    private JPanel jPanel2 = new JPanel();
    private JButton btnDatos = new JButton();
    private JButton btnNomina = new JButton();
    private JButton btnSalir = new JButton();
    private JPanel jPanel3 = new JPanel();
    private JPanel jPanel4 = new JPanel();
    private JPanel jPanel5 = new JPanel();
    private JLabel jLabel4 = new JLabel();
    private JLabel jLabel5 = new JLabel();
    private JLabel jLabel6 = new JLabel();
    private JLabel jLabel7 = new JLabel();
    private JLabel jLabel8 = new JLabel();
    private JLabel jLabel9 = new JLabel();
    private JLabel jLabel10 = new JLabel();
    private JLabel jLabel11 = new JLabel();
    private JLabel jLabel12 = new JLabel();
    private JLabel jLabel13 = new JLabel();
    private JLabel jLabel14 = new JLabel();
    private JTextField textPension = new JTextField();
    private JTextField textSalario = new JTextField();
    private JTextField textQuincena = new JTextField();
    private JTextField textApellido4;
    private JTextField textTransporte = new JTextField();
    private JTextField textTotalDevengado = new JTextField();
    private JTextField textSalud = new JTextField();
    private JTextField textFSP = new JTextField();
    private JTextField textApellido9;
    private JTextField textTotalDescuentos = new JTextField();
    private JTextField textPagar = new JTextField();
    private JTextField textAcumuladoNomina = new JTextField();
    private JPanel jPanel6 = new JPanel();

    public static void main(String args[]) {
            EventQueue.invokeLater(new Runnable() {
                  public void run() {
                      new Nomina().setVisible(true);
                  }
              });
          }

    public Nomina() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(677, 535));
        this.setTitle( "Nómina" );
        this.setBackground(new Color(115, 115, 115));
        jPanel1.setBounds(new Rectangle(10, 10, 650, 70));
        jPanel1.setBorder(BorderFactory.createTitledBorder("Empleado"));
        jPanel1.setFocusable(false);
        jPanel1.setNextFocusableComponent(jLabel1);
        jPanel1.setLayout(null);
        jPanel1.setBackground(new Color(231, 231, 231));
        jLabel1.setText("Código");
        jLabel1.setHorizontalTextPosition(SwingConstants.LEFT);
        jLabel1.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel1.setBounds(new Rectangle(10, 15, 55, 30));
        jLabel1.setFont(new Font("Tahoma", 1, 12));
        jLabel2.setText("Nombres");
        jLabel2.setHorizontalTextPosition(SwingConstants.LEFT);
        jLabel2.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel2.setBounds(new Rectangle(185, 15, 55, 30));
        jLabel2.setFont(new Font("Tahoma", 1, 12));
        jLabel3.setText("Apellidos");
        jLabel3.setHorizontalTextPosition(SwingConstants.LEFT);
        jLabel3.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel3.setBounds(new Rectangle(410, 15, 55, 30));
        jLabel3.setFont(new Font("Tahoma", 1, 12));
        textCodigo.setBounds(new Rectangle(60, 20, 105, 20));
        textNombre.setBounds(new Rectangle(250, 20, 150, 20));
        textApellido.setBounds(new Rectangle(480, 20, 150, 20));
        jPanel2.setBounds(new Rectangle(10, 100, 645, 50));
        jPanel2.setLayout(null);
        jPanel2.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        jPanel2.setBackground(new Color(231, 231, 231));
        btnDatos.setText("Adicionar Empleado");
        btnDatos.setBounds(new Rectangle(20, 15, 155, 20));
        btnDatos.setFont(new Font("Tahoma", 1, 12));
        btnDatos.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    btnDatos_actionPerformed(e);
                }
            });
        btnNomina.setText("Nomina");
        btnNomina.setBounds(new Rectangle(245, 15, 155, 20));
        btnNomina.setFont(new Font("Tahoma", 1, 12));
        btnNomina.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    btnNomina_actionPerformed(e);
                }
            });
        btnSalir.setText("Salir");
        btnSalir.setBounds(new Rectangle(460, 15, 155, 20));
        btnSalir.setFont(new Font("Tahoma", 1, 12));
        btnSalir.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    btnSalir_actionPerformed(e);
                }
            });
        jPanel3.setBounds(new Rectangle(10, 10, 650, 70));
        jPanel3.setBorder(BorderFactory.createTitledBorder("Empleado"));
        jPanel3.setFocusable(false);
        jPanel3.setNextFocusableComponent(jLabel6);
        jPanel3.setLayout(null);
        jPanel3.setBackground(new Color(231, 231, 231));
        jPanel4.setBounds(new Rectangle(10, 10, 650, 70));
        jPanel4.setBorder(BorderFactory.createTitledBorder("Empleado"));
        jPanel4.setFocusable(false);
        jPanel4.setNextFocusableComponent(jLabel6);
        jPanel4.setLayout(null);
        jPanel4.setBackground(new Color(231, 231, 231));
        jPanel5.setBounds(new Rectangle(10, 165, 645, 215));
        jPanel5.setBorder(BorderFactory.createTitledBorder("Resultado Nómina"));
        jPanel5.setLayout(null);
        jLabel4.setText("jLabel4");
        jLabel5.setText("Salario Base");
        jLabel5.setHorizontalTextPosition(SwingConstants.LEFT);
        jLabel5.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel5.setBounds(new Rectangle(65, 25, 55, 30));
        jLabel5.setFont(new Font("Tahoma", 1, 12));
        jLabel6.setText("Pensión");
        jLabel6.setHorizontalTextPosition(SwingConstants.LEFT);
        jLabel6.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel6.setBounds(new Rectangle(375, 25, 55, 30));
        jLabel6.setFont(new Font("Tahoma", 1, 12));
        jLabel7.setText("Quincena");
        jLabel7.setHorizontalTextPosition(SwingConstants.LEFT);
        jLabel7.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel7.setBounds(new Rectangle(65, 55, 75, 30));
        jLabel7.setFont(new Font("Tahoma", 1, 12));
        jLabel8.setText("Transporte");
        jLabel8.setHorizontalTextPosition(SwingConstants.LEFT);
        jLabel8.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel8.setBounds(new Rectangle(65, 85, 70, 30));
        jLabel8.setFont(new Font("Tahoma", 1, 12));
        jLabel9.setText("Total");
        jLabel9.setHorizontalTextPosition(SwingConstants.LEFT);
        jLabel9.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel9.setBounds(new Rectangle(65, 115, 55, 30));
        jLabel9.setFont(new Font("Tahoma", 1, 12));
        jLabel10.setText("Total a Pagar");
        jLabel10.setHorizontalTextPosition(SwingConstants.LEFT);
        jLabel10.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel10.setBounds(new Rectangle(190, 155, 110, 30));
        jLabel10.setFont(new Font("Tahoma", 1, 12));
        jLabel11.setText("Salud");
        jLabel11.setHorizontalTextPosition(SwingConstants.LEFT);
        jLabel11.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel11.setBounds(new Rectangle(375, 55, 55, 30));
        jLabel11.setFont(new Font("Tahoma", 1, 12));
        jLabel12.setText("FSP");
        jLabel12.setHorizontalTextPosition(SwingConstants.LEFT);
        jLabel12.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel12.setBounds(new Rectangle(375, 85, 55, 30));
        jLabel12.setFont(new Font("Tahoma", 1, 12));
        jLabel13.setText("Total");
        jLabel13.setHorizontalTextPosition(SwingConstants.LEFT);
        jLabel13.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel13.setBounds(new Rectangle(370, 115, 55, 30));
        jLabel13.setFont(new Font("Tahoma", 1, 12));
        jLabel14.setText("Acumulado Nómina");
        jLabel14.setHorizontalTextPosition(SwingConstants.LEFT);
        jLabel14.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel14.setBounds(new Rectangle(190, 180, 165, 30));
        jLabel14.setFont(new Font("Tahoma", 1, 12));
        textPension.setBounds(new Rectangle(460, 30, 150, 20));
        textSalario.setBounds(new Rectangle(190, 30, 150, 20));
        textQuincena.setBounds(new Rectangle(190, 60, 150, 20));
        textTransporte.setBounds(new Rectangle(190, 90, 150, 20));
        textTotalDevengado.setBounds(new Rectangle(190, 120, 150, 20));
        textSalud.setBounds(new Rectangle(460, 60, 150, 20));
        textFSP.setBounds(new Rectangle(460, 90, 150, 20));
        textTotalDescuentos.setBounds(new Rectangle(460, 125, 150, 20));
        textPagar.setBounds(new Rectangle(370, 155, 240, 20));
        textAcumuladoNomina.setBounds(new Rectangle(370, 185, 240, 20));
        jPanel6.setBounds(new Rectangle(10, 395, 645, 95));
        jPanel6.setBorder(BorderFactory.createTitledBorder("Parafiscales y Otros"));
        jPanel1.add(textApellido, null);
        jPanel1.add(textNombre, null);
        jPanel1.add(textCodigo, null);
        jPanel1.add(jLabel3, null);
        jPanel1.add(jLabel2, null);
        jPanel1.add(jLabel1, null);
        jPanel2.add(btnSalir, null);
        jPanel2.add(btnNomina, null);
        jPanel2.add(btnDatos, null);
        jPanel5.add(textAcumuladoNomina, null);
        jPanel5.add(textPagar, null);
        jPanel5.add(textTotalDescuentos, null);
        jPanel5.add(textFSP, null);
        jPanel5.add(textSalud, null);
        jPanel5.add(textTotalDevengado, null);
        jPanel5.add(textTransporte, null);
        jPanel5.add(textQuincena, null);
        jPanel5.add(textSalario, null);
        jPanel5.add(textPension, null);
        jPanel5.add(jLabel14, null);
        jPanel5.add(jLabel13, null);
        jPanel5.add(jLabel12, null);
        jPanel5.add(jLabel11, null);
        jPanel5.add(jLabel10, null);
        jPanel5.add(jLabel9, null);
        jPanel5.add(jLabel8, null);
        jPanel5.add(jLabel7, null);
        jPanel5.add(jLabel6, null);
        jPanel5.add(jLabel5, null);
        this.getContentPane().add(jPanel6, null);
        this.getContentPane().add(jPanel5, null);
        this.getContentPane().add(jPanel2, null);
        this.getContentPane().add(jPanel1, null);
       
    }

    private void btnSalir_actionPerformed(ActionEvent e) {
        //System.exit(0);
        dispose();
    }

    private void btnDatos_actionPerformed(ActionEvent e) {
        int i = 0, codigo=0, salario=0;
             String cadena, nombre, apellido;
             cadena = JOptionPane.showInputDialog("CODIGO EMPLEADO");
             codigo = Integer.parseInt(cadena);
             nombre = JOptionPane.showInputDialog("NOMBRE EMPLEADO");
             apellido = JOptionPane.showInputDialog("APELLIDO EMPLEADO");
             cadena = JOptionPane.showInputDialog("SALARIO DEL EMPLEADO");
             salario = Integer.parseInt(cadena);
             empleado[i] = new Empleado();
             empleado[i].asignarEmpleado(codigo, nombre, apellido,salario);
             mostrar(i);
             i++;

    }

    private void btnNomina_actionPerformed(ActionEvent e) {
        int i=0;
              String cadena =JOptionPane.showInputDialog("Digite los días laborados por el empleado");
              empleado[i].calcularQuincena(Integer.parseInt(cadena));
              empleado[i].calcularAuxTransporte(Integer.parseInt(cadena));
              empleado[i].calcularTotalDevengado();
              empleado[i].calcularSalud(Integer.parseInt(cadena));
              empleado[i].calcularPension(Integer.parseInt(cadena));
              empleado[i].calcularFSP(Integer.parseInt(cadena));
              empleado[i].calcularTotalDescuentos();
              empleado[i].calcularTotalPagar();
              //empresa.calcularTotalNomina(empleado[i].darTotalPagar());

              mostrar(i);
              i++;

    }
    
    public void mostrar(int i)
     {
       DecimalFormat df = ( DecimalFormat )NumberFormat.getInstance( );
       df.applyPattern( "$###,##0.##" );
       textCodigo.setText(String.valueOf(empleado[i].getCodigo()));
       textNombre.setText(empleado[i].getNombreEmpleado());
       textApellido.setText(empleado[i].getApeEmpleado());
       textSalario.setText(df.format(empleado[i].getSalario()));
       textQuincena.setText(df.format(empleado[i].getQuincena()));
       textTransporte.setText(df.format(empleado[i].getAuxTrans()));
       textTotalDevengado.setText(df.format(empleado[i].getTotalDevengado()));
       textSalud.setText(df.format(empleado[i].getSalud()));
       textPension.setText(df.format(empleado[i].getPension()));
       textFSP.setText(df.format(empleado[i].getFsp()));
       textTotalDescuentos.setText(df.format(empleado[i].getTotalDescuentos()));
       textPagar.setText(df.format(empleado[i].getTotalPagar()));
       //acumula el total a pagar del empleado utilizando el metodo calcularTotalNomina de Empresa
       Empresa.calcularTotalNomina(empleado[i].getTotalPagar());
       //Asigna al textbox el total que se acumula mediante el método darTotalNomina
       textAcumuladoNomina.setText(df.format(empresa.getTotalNomina()));
      }

}
