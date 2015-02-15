package superEmpleado.modelo;
import java.sql.*;

public class Conexion {
    public String driver, url, ip, bd, usr, pass;
    public Connection conexion;

    public Conexion(String ip, String bd, String usr, String pass) {
        driver = "com.mysql.jdbc.Driver";
        this.bd = bd;
        this.usr = usr;
        this.pass = pass;
        url = new String("jdbc:mysql://" + ip + "/" + bd);
        try {
            Class.forName(driver).newInstance();
            conexion = DriverManager.getConnection(url, usr, pass);
            System.out.println("Conexion a Base de Datos " + bd + " Ok");
        }

        catch (Exception exc) {
            System.out.println("Error al tratar de abrir la base de Datos " + bd + " : " + exc);
        }
    }

    public Connection getConexion() {
        return conexion;
    }

    public Connection CerrarConexion() throws SQLException {
        conexion.close();
        conexion = null;
        return conexion;
    }

    
    
}
Conexion nomiconexion = new Conexion("localhost","nomina","root","DashSash$2013");
