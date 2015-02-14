package superEmpleado.modelo;

public class Empleado {
    /**
     * @attribute
     */
    private String apeEmpleado;

    /**
     * @attribute
     */
    private int auxTrans;

    /**
     * @attribute
     */
    private int codigo;

    /**
     * @attribute
     */
    private int fsp;

    /**
     * @attribute
     */
    private String nombreEmpleado;

    /**
     * @attribute
     */
    private int pension;

    /**
     * @attribute
     */
    private int quincena;

    /**
     * @attribute
     */
    private int salario;

    /**
     * @attribute
     */
    private int salud;

    /**
     * @attribute
     */
    private int totalDescuentos;

    /**
     * @attribute
     */
    private int totalDevengado;

    /**
     * @attribute
     */
    private int totalPagar;

    public Empleado() {
        codigo=0;
        nombreEmpleado="";
        apeEmpleado="";
        salario=0;
        quincena=0;
        auxTrans=0;
        totalDevengado=0;
        salud=0;
        pension=0;
        fsp=0;
        totalDescuentos=0;
        totalPagar=0;
    }

    public void asignarEmpleado(int codP, String nomP, String apeP, int salP) {
    }

    public void calcularAuxTransporte(int dias) {
    }

    public void calcularFSP(int dias) {
    }

    public void calcularPension(int dias) {
    }

    public void calcularQuincena(int dias) {
    }

    public void calcularSalud(int dias) {
    }

    public int calcularTotalDescuentos() {
        return totalDescuentos;
    }

    public void calcularTotalDevengado() {
    }

    public void calcularTotalPagar() {
    }

    public String getApeEmpleado() {
        return apeEmpleado;
    }

    public int getAuxTrans() {
        return auxTrans;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getFsp() {
        return fsp;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public int getPension() {
        return pension;
    }

    public int getQuincena() {
        return quincena;
    }

    public int getSalario() {
        return salario;
    }

    public int getSalud() {
        return salud;
    }

    public int getTotalDevengado() {
        return totalDevengado;
    }
}
