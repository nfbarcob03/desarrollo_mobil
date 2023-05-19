package unal.todosalau.myapplication;

public class Camioneta extends Carro {
    private boolean traccion4x4;

    public Camioneta() {
        super();
        this.traccion4x4 = false;
    }

    public Camioneta(String color, String marca, String modelo, int volumen_tanque, boolean traccion4x4) {
        super(color, marca, modelo, volumen_tanque);
        this.traccion4x4 = traccion4x4;
    }

    public boolean isTraccion4x4() {
        return traccion4x4;
    }

    public void setTraccion4x4(boolean traccion4x4) {
        this.traccion4x4 = traccion4x4;
    }

    @Override
    public String toString() {
        return "Camioneta{" +
                "color='" + getColor() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", velocidad=" + getVelocidad() +
                ", volumen_tanque=" + getVolumen_tanque() +
                ", gasolina=" + getGasolina() +
                ", encendido=" + isEncendido() +
                ", traccion4x4=" + traccion4x4 +
                '}';
    }
    @Override
    public String acelerar() {
        return "La camioneta está acelerando.";
    }
}
