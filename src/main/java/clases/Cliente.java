package clases;

public class Cliente {

    private String nombre;
    private String cedula;
    private String tipoDePago;
    private int saldoDisponible;

    public Cliente() {
    }

    public Cliente(String nombre, String cedula, String tipoDePago, int saldoDisponible) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.tipoDePago = tipoDePago;
        this.saldoDisponible = saldoDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTipoDePago() {
        return tipoDePago;
    }

    public void setTipoDePago(String tipoDePago) {
        this.tipoDePago = tipoDePago;
    }

    public int getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(int saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }
}
