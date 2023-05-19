package unal.todosalau.energysavybogotaenergeticus;

public class CalculadoraConsumo {
    public static int calcularConsumoDiario(Electrodomestico electrodomestico) {
        return electrodomestico.getPotencia() * 24;
    }

    public static int calcularConsumoDiario(Electrodomestico electrodomestico, int horasUso) {
        return electrodomestico.getPotencia() * horasUso * electrodomestico.getEficiencia();
    }
}
