package unal.todosalau.myapplication;

public class Automovil extends Carro {
    private int puertas;

    public Automovil() {
        super();
        this.puertas = 0;
    }

    public Automovil(String color, String marca, String modelo, int volumen_tanque, int puertas) {
        super(color, marca, modelo, volumen_tanque);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "color='" + getColor() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", velocidad=" + getVelocidad() +
                ", volumen_tanque=" + getVolumen_tanque() +
                ", gasolina=" + getGasolina() +
                ", encendido=" + isEncendido() +
                ", puertas=" + puertas +
                '}';
    }
    @Override
    public String acelerar() {
        return"El automóvil está acelerando.";
    }
}