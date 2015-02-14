package superEmpleado.modelo;

public class Empresa {
    /**
     * @attribute
     */
    public int AT;

    /**
     * @attribute
     */
    public double CAJA;

    /**
     * @attribute
     */
    public double FSP;

    /**
     * @attribute
     */
    public double ICBF;

    /**
     * @attribute
     */
    public double PENSION;

    /**
     * @attribute
     */
    public double SALUD;

    /**
     * @attribute
     */
    public int SML;

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

    public Empresa() {
    }

    public void CalcularParafiscales() {
    }

    public void calcularCaja() {
    }

    public void calcularCesantias() {
    }

    public void calcularICBF() {
    }

    public void calcularSena() {
    }

    public void calcularTotalNomina() {
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

    public int getTotalNomina() {
        return totalNomina;
    }

    public int getTotalParafiscales() {
        return totalParafiscales;
    }
}
