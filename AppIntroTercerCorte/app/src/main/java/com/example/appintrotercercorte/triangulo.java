package com.example.appintrotercercorte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class triangulo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);
    }

    public void trianguloA(View view) {
        EditText editTextBase = (EditText) findViewById(R.id.editTextBase);
        EditText editTextAltura = (EditText) findViewById(R.id.editTextAltura);
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        EditText editText3 = (EditText) findViewById(R.id.editText3);
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        TextView textView5 = (TextView) findViewById(R.id.textView5);


        int lado1 = Integer.parseInt(editText1.getText().toString());
        int lado2 = Integer.parseInt(editText2.getText().toString());
        int lado3 = Integer.parseInt(editText3.getText().toString());

        int base = Integer.parseInt(editTextBase.getText().toString());
        int altura = Integer.parseInt(editTextAltura.getText().toString());

        int area = (base * altura) / 2 ;
        int  perimetro = lado1 + lado2 +lado3 ;
        textView4.setText(String.valueOf("El area del triangulo es " + area );
        textView5.setText(String.valueOf("El perimetro  del triangulo es " + perimetro);
    }
}