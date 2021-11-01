package com.example.appintrotercercorte;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


import android.view.View;
import  android.widget.EditText;



public class Cuadrado extends AppCompatActivit implements View.OnClickListener {

    EditText txtlado;
    EditText txtlado2;
    Button btnperimetro;
    Button btnarea;
    TextView txtresultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtlado = (EditText) findViewById (R.id.txtlado);
        txtresultado = (TextView) findViewById (R.id.txtresultado);
        btnperimetro = (Button) findViewById (R.id.btnperimetro);

    }


    public void onClick(View v) {
        int lado1 = Integer.parseInt(txtlado.getText().toString());
        int total = lado1 + lado1 + lado1 +lado1;
        txtresultado.setText("El perimetro es: " + total);

        int area = Integer.parseInt(txtlado.getText().toString());
        int totalA = area * 4;
        txtresultado.setText("El area  es: " + totalA);


        int Perimetro1 = Integer.parseInt(txtlado.getText().toString());
        int Perimetro2 = Integer.parseInt(txtlado.getText().toString());
        int totalR = (Perimetro1 *2 )+(Perimetro2*2);
        txtresultado.setText("El perimetro es: " + totalR);

        int area1 = Integer.parseInt(txtlado.getText().toString());
        int area2 = Integer.parseInt(txtlado2.getText().toString());
        int totalRARec = area1 * area2;
        txtresultado.setText("El area  es: " + totalRARec);
    }
}