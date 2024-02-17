package cuentas;

/**
 * Clase 'CCuenta' que permite gestionar la cuenta bancaria de un usuario.
 * @author Jacinto Casasaltas Perales
 * @version 1.0
 * @since 17/02/2024
 */
public class CCuenta {
    /**
     * Nombre del Usuario de la Cuenta.
     */
    private String nombre;
    /**
     * Número de Cuenta.
     */
    private String cuenta;
    /**
     * Saldo existente en la cuenta.
     */
    private double saldo;
    /**
     * Tipo de Interés aplicable a la cuenta.
     */
    private double tipoInterés;

    /**
     * Método Constructor Vacío.
     */
    public CCuenta()
    {
    }

    /**
     * Método Constructor Alternativo.
     * @param nom Parámetro de tipo 'String' con el nombre del usuario.
     * @param cue Parámetro de tipo 'String' con el número de cuenta.
     * @param sal Parámetro de tipo 'double' con el saldo de la cuenta.
     * @param tipo Parámetro de tipo 'double' con el tipo de interés.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Método para obtener el Nombre del Usuario.
     * @return El nombre del usuario de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el Nombre del Usuario.
     * @param nombre Parámetro de tipo 'String' con el nombre del usuario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el Número de Cuenta.
     * @return El número de cuenta bancaria
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método para establecer el Número de Cuenta.
     * @param cuenta Parámetro de tipo 'String' con el número de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método para obtener el Saldo de la Cuenta.
     * @return El saldo existente en la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método para establecer el Saldo de la Cuenta.
     * @param saldo Parámetro de tipo 'double' con el saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método para obtener el Tipo de Interés de la Cuenta.
     * @return El tipo de interés aplicable a la cuenta
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método para establecer el Tipo de Interés de la Cuenta.
     * @param tipoInterés Parámetro de tipo 'double' con el tipo de interés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Método para obtener el Saldo de la Cuenta.
     * @return El saldo existente en la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método para realizar el Ingreso de una cantidad de dinero.
     * @param cantidad Parámetro de tipo 'double' con la cantidad a ingresar
     * @throws Exception Controla que la cantidad no sea negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Método para Retirar una cantidad de dinero de la cuenta.
     * @param cantidad Parámetro de tipo 'double' con la cantidad a retirar
     * @throws Exception Controla que la cantidad a retirar es correcta
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
