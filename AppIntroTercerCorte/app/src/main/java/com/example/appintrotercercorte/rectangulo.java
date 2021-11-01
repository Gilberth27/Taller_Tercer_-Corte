package com.example.appintrotercercorte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class rectangulo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);
    }
    public void rectanguloP (View v) {
        EditText editText = (EditText) findViewById(R.id.editText11);
        EditText editText1 = (EditText) findViewById(R.id.editText12);
        TextView textView10 = (TextView) findViewById(R.id.textView10);


        int base = Integer.parseInt(editText.getText().toString());
        int altura = Integer.parseInt(editText1.getText().toString());
        int total = (2*base)+(2*altura);
        textView10.setText(String.valueOf("El perimetro del rectangulo  es " + total + " cm" ));

    }

    public void rectanguloA (View v) {
        EditText editText = (EditText) findViewById(R.id.editText11);
        EditText editText1 = (EditText) findViewById(R.id.editText12);
        TextView textView10 = (TextView) findViewById(R.id.textView10);


        int base = Integer.parseInt(editText.getText().toString());
        int altura = Integer.parseInt(editText1.getText().toString());
        int total = base * altura;
        textView10.setText(String.valueOf("El area del cuadrado es " + total + " cm2" ));

    }
}