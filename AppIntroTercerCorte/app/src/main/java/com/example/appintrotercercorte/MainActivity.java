package com.example.appintrotercercorte;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */


    public void buttonClicked(View view) {
        switch (view.getId()) {
            case R.id.btnrectangulo:
                Intent intent = new Intent(this, rectangulo.class);
                startActivity(intent);
                break;
            case R.id.btncuadrado:
                Intent intent1 = new Intent(this, cuadrado.class);
                startActivity(intent1);
                break;
            case R.id.btntriangulo:
                Intent intent2 = new Intent(this, triangulo.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
    }
}