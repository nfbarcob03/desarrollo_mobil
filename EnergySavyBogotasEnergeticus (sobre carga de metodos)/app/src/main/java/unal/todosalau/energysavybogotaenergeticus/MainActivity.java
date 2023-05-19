package unal.todosalau.energysavybogotaenergeticus;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etHoursOfUse;
    private Button btnCalculate;
    private TextView tvResult;
    private EditText etName;
    private EditText etPotence;
    private EditText etResistence;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etHoursOfUse = findViewById(R.id.etHourOfUse);
        etName = findViewById(R.id.etName);
        etPotence = findViewById(R.id.etPotence);
        etResistence = findViewById(R.id.etResistence);
        btnCalculate = findViewById(R.id.btnCalculate);
        tvResult = findViewById(R.id.tvResult);

        btnCalculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                calculateEnergyConsumption();
                closeKeyboard();

            }
        });
    }
    private void calculateEnergyConsumption() {
        String hoursOfUseStr = etHoursOfUse.getText().toString();
        String name =  etName.getText().toString();
        String potence = etPotence.getText().toString();
        String resistence =  etResistence.getText().toString();
        String warningText = "";
        boolean showAlert = false;
        Electrodomestico electrodomestico;

        if (!name.isEmpty() && !potence.isEmpty() && !resistence.isEmpty()) {
            electrodomestico = new Electrodomestico(name, Integer.parseInt(potence), Integer.parseInt(resistence));
        } else {
            showAlert = true;
            warningText = warningText + "Si no se completa la información del electrodomestico, se realiza el calculo" +
                    " Con el electrodomestico por defecto: una Laptop. ";


            electrodomestico = setDefaultElectrodomestic();
            etName.setText(electrodomestico.getNombre());
            etPotence.setText(String.valueOf(electrodomestico.getPotencia()));
            etResistence.setText(String.valueOf(electrodomestico.getEficiencia()));

        }

        if(!hoursOfUseStr.isEmpty()){
            tvResult.setText(electrodomestico.getNombre() + " " + String.valueOf(CalculadoraConsumo.calcularConsumoDiario(electrodomestico,
                    Integer.parseInt(hoursOfUseStr))));
        }else{
            showAlert = true;
            warningText = warningText + "Se hace el calculo por defecto para 24 horas";
            tvResult.setText(electrodomestico.getNombre() + " " +
                    String.valueOf(CalculadoraConsumo.calcularConsumoDiario(electrodomestico)));
            etHoursOfUse.setText(String.valueOf(24));
        }
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Alert Dialog");
        alertDialogBuilder.setMessage(warningText);
        if (showAlert){
            alertDialogBuilder.setNeutralButton("I got it", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(MainActivity.this, "Default electrodomestic", Toast.LENGTH_LONG).show();
                }
            });
            final AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }


    }

    private Electrodomestico setDefaultElectrodomestic(){
        return new Electrodomestico("Laptop", 50, 90);
    }
    private void closeKeyboard()
    {
        // this will give us the view
        // which is currently focus
        // in this layout
        View view = this.getCurrentFocus();

        // if nothing is currently
        // focus then this will protect
        // the app from crash
        if (view != null) {

            // now assign the system
            // service to InputMethodManager
            InputMethodManager manager
                    = (InputMethodManager)
                    getSystemService(
                            Context.INPUT_METHOD_SERVICE);
            manager
                    .hideSoftInputFromWindow(
                            view.getWindowToken(), 0);
        }
    }

}
