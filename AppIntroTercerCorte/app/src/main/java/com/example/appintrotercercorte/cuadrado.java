package com.example.appintrotercercorte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class cuadrado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);
    }

        public void cuadradoA (View v) {
            EditText editText = (EditText) findViewById(R.id.editText);
            TextView textView2 = (TextView) findViewById(R.id.textView2);


        int lado1 = Integer.parseInt(editText.getText().toString());
        int total = lado1 + lado1 + lado1 +lado1;
        textView2.setText(String.valueOf("El perimetro del cuadrado es " + total + " cm" ));

    }
}