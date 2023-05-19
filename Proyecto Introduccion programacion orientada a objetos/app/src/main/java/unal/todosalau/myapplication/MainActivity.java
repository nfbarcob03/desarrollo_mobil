package unal.todosalau.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Creación de una instancia de Carro
        Carro carroSinAtributos = new Carro();
        Log.i("carroConstructorVacio",carroSinAtributos.toString());

        Carro carroConAtributos = new Carro("Rojo", "renault",
                "2021",100);
        Log.i("encendidoCarroConstructorNoVacioOn",
                String.valueOf(carroConAtributos.isEncendido()));
        Log.i("gasolinaConstructorNoVacioOn",
                String.valueOf(carroConAtributos.getGasolina()));
        Log.i("carroConstructorNoVacio",carroConAtributos.toString());
        Log.i("isCarroConstructorNoVacioOn",
                String.valueOf(carroConAtributos.isEncendido()));
        carroConAtributos.encenderCarro();
        Log.i("isCarroConstructorVacioOn",
                String.valueOf(carroConAtributos.isEncendido()));

        // Creación de una instancia de Automovil
        Automovil automovil = new Automovil("Rojo", "Toyota", "Corolla", 50, 4);

        // Impresiones utilizando Log.i() para demostrar la herencia y los valores de los atributos
        Log.i("Ejemplo", "Automovil:");
        Log.i("Ejemplo", "Color: " + automovil.getColor());
        Log.i("Ejemplo", "Marca: " + automovil.getMarca());
        Log.i("Ejemplo", "Modelo: " + automovil.getModelo());
        Log.i("Ejemplo", "Velocidad: " + automovil.getVelocidad());
        Log.i("Ejemplo", "Volumen del Tanque: " + automovil.getVolumen_tanque());
        Log.i("Ejemplo", "Gasolina: " + automovil.getGasolina());
        Log.i("Ejemplo", "Encendido: " + automovil.isEncendido());
        Log.i("Ejemplo", "Puertas: " + automovil.getPuertas());


        // Creación de una instancia de Camioneta
        Camioneta camioneta = new Camioneta("Azul", "Ford", "Ranger", 70, true);

        // Impresiones utilizando Log.i() para demostrar la herencia y los valores de los atributos
        Log.i("Ejemplo", "Camioneta:");
        Log.i("Ejemplo", "Color: " + camioneta.getColor());
        Log.i("Ejemplo", "Marca: " + camioneta.getMarca());
        Log.i("Ejemplo", "Modelo: " + camioneta.getModelo());
        Log.i("Ejemplo", "Velocidad: " + camioneta.getVelocidad());
        Log.i("Ejemplo", "Volumen del Tanque: " + camioneta.getVolumen_tanque());
        Log.i("Ejemplo", "Gasolina: " + camioneta.getGasolina());
        Log.i("Ejemplo", "Encendido: " + camioneta.isEncendido());
        Log.i("Ejemplo", "Tracción 4x4: " + camioneta.isTraccion4x4());

        Log.i("Ejemplo","acelerar: " + carroConAtributos.acelerar());     // Salida: El carro está acelerando.
        Log.i("Ejemplo","acelerar: " + automovil.acelerar());
        Log.i("Ejemplo","acelerar: " + camioneta.acelerar());

    }


}