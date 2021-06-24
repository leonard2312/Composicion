/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.accesorios;

/**
 *
 * @author leona
 */
public class CPU {
    private String Marca;
    private String Modelo;
    private int VelocidadProcesador;

    public CPU() {
    }

    public CPU(String Marca, String Modelo, int VelocidadProcesador) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.VelocidadProcesador = VelocidadProcesador;
    }

    public int getVelocidadProcesador() {
        return VelocidadProcesador;
    }

    public void setVelocidadProcesador(int VelocidadProcesador) {
        this.VelocidadProcesador = VelocidadProcesador;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    @Override
    public String toString() {
        return "CPU{" + "Marca=" + Marca + ", Modelo=" + Modelo + ", VelocidadProcesador=" + VelocidadProcesador + '}';
    }
    
    
}
