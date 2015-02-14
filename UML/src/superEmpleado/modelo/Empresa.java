package superEmpleado.modelo;

public class Empresa {
    /**
     * @attribute
     */
    final public static int AT=70500;

    /**
     * @attribute
     */
    final public static double CAJA=0.04;

    /**
     * @attribute
     */
    final public static double FSP=0.01;

    /**
     * @attribute
     */
    final public static double ICBF=0.03;

    /**
     * @attribute
     */
    final public static double PENSION=0.04;

    /**
     * @attribute
     */
    final public static double SALUD=0.04;
    /**
     * @attribute
     */
    final public static double SENA=0.02;

    /**
     * @attribute
     */
   final public static int SML=589500;

    /**
     * @attribute
     */
    private int caja;

    /**
     * @attribute
     */
    private int cesantias;

    /**
     * @attribute
     */
    private int icbf;

    /**
     * @attribute
     */
    private int interesesCesantias;

    /**
     * @attribute
     */
    private int sena;

    /**
     * @attribute
     */
    private int totalNomina;

    /**
     * @attribute
     */
    private int totalParafiscales;
    
    private Empleado empleado[];

    public Empresa() {
        sena=0;
        icbf=0;
        caja=0;
        totalParafiscales=0;
        interesesCesantias=0;
        totalNomina=0;
        empleado = new Empleado[5];
    }

    public void CalcularParafiscales() {
        totalParafiscales = (sena+icbf+caja);
    }

    public void calcularCaja(int totalNomina) {
        caja = (int) (totalNomina*CAJA);
    }

    public void calcularCesantias() {
        cesantias = (int) (totalNomina/12);
    }

    public void calcularICBF() {
        icbf = (int) (totalNomina*ICBF);
    }

    public void calcularSena() {
        sena = (int) (totalNomina*SENA);
    }

    public void calcularTotalNomina(int totalPagar) {
        totalNomina += totalPagar;
    }

    public int getCaja() {
        return caja;
    }

    public int getIcbf() {
        return icbf;
    }

    public int getInteresesCesantias() {
        return interesesCesantias;
    }

    public int getSena() {
        return sena;
    }
    
    public int getCesantias() {
        return cesantias;
    }

    public int getTotalNomina() {
        return totalNomina;
    }

    public int getTotalParafiscales() {
        return totalParafiscales;
    }
}
