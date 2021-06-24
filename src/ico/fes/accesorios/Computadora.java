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
public class Computadora {
    private String Marca;
    private String Modelo;
    
    private CPU cpu;
    private Monitor moni;
    private Mouse mouse;
    private Teclado tecla;

    public Computadora() {
    }

    public Computadora(String Marca, String Modelo, CPU cpu, Monitor moni, Mouse mouse, Teclado tecla) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.cpu = cpu;
        this.moni = moni;
        this.mouse = mouse;
        this.tecla = tecla;
    }

    public Teclado getTecla() {
        return tecla;
    }

    public void setTecla(Teclado tecla) {
        this.tecla = tecla;
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

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Monitor getMoni() {
        return moni;
    }

    public void setMoni(Monitor moni) {
        this.moni = moni;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "Computadora{" + "Marca=" + Marca + ", Modelo=" + Modelo + ", cpu=" + cpu + ", moni=" + moni + ", mouse=" + mouse + ", tecla=" + tecla + '}';
    }
    
    
}
