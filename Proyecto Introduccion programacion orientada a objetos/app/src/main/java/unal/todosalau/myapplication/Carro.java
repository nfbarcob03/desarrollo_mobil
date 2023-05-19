package unal.todosalau.myapplication;

public class Carro {
    private String color;
    private String marca;
    private String modelo;
    private int velocidad = 0;
    private int volumen_tanque;
    private int gasolina = 0;
    private boolean encendido = false;

    //Constructor vacio
    public Carro(){
        this.color="sin color";
        this.marca = "sin marca";
        this.modelo = "sin modelo";
        this.volumen_tanque = 100;
    }

    //Constructor con parametros
    public Carro(String color, String marca, String modelo, int volument_tanque){
        this.color = color;
        this.volumen_tanque  = volument_tanque;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVolumen_tanque() {
        return volumen_tanque;
    }

    public void setVolumen_tanque(int volumen_tanque) {
        this.volumen_tanque = volumen_tanque;
    }

    public int getGasolina() {
        return gasolina;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public void llenarTanque(){
        this.gasolina = this.volumen_tanque;
    }

    public void encenderCarro(){
        this.encendido = true;
    }

    public void apagarCarro(){
        this.encendido = false;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidad=" + velocidad +
                ", volumen_tanque=" + volumen_tanque +
                ", gasolina=" + gasolina +
                ", encendido=" + encendido +
                '}';
    }

    public String acelerar() {
        return "El carro está acelerando.";
    }
}
