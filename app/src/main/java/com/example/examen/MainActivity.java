package com.example.examen;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText editTextPrimerParcial;
    private EditText editTextSegundoParcial;
    private Button btnCalcularPromedio;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextPrimerParcial = findViewById(R.id.editTextPrimerParcial);
        editTextSegundoParcial = findViewById(R.id.editTextSegundoParcial);
        btnCalcularPromedio = findViewById(R.id.btnCalcularPromedio);
        textViewResultado = findViewById(R.id.textViewResultado);

        btnCalcularPromedio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcularPromedio();
            }
        });

    }
    private void calcularPromedio() {
        try {
            double primerParcial = Double.parseDouble(editTextPrimerParcial.getText().toString());
            double segundoParcial = Double.parseDouble(editTextSegundoParcial.getText().toString());

            double promedio = (primerParcial + segundoParcial) / 2;

            textViewResultado.setText("Promedio: " + promedio);
        } catch (NumberFormatException e) {
            textViewResultado.setText("Ingrese calificaciones válidas.");
        }
    }
}

