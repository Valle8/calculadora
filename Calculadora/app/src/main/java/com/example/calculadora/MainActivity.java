package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView tv;
    double n1,n2, res;
    int Operador;
    boolean puntoB = false;

    public static final int VACIA = 0;
    public static final int RESTA = 1;
    public static final int SUMA = 2;
    public static final int DIVISION = 3;
    public static final int MULTIPLICACION = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnPunto(View view){
        if (puntoB==false) {
            tv = (TextView) findViewById(R.id.textView);
            tv.setText(tv.getText() + ".");
            puntoB = true;
        }

    }

    public void btnCero(View view){
        tv = (TextView) findViewById(R.id.textView);
        tv.setText(tv.getText()+"0");
    }

    public void btnUno(View view){
        tv = (TextView) findViewById(R.id.textView);
        tv.setText(tv.getText()+"1");
    }

    public void btnDos(View view){
        tv = (TextView) findViewById(R.id.textView);
        tv.setText(tv.getText()+"2");
    }

    public void btnTres(View view){
        tv = (TextView) findViewById(R.id.textView);
        tv.setText(tv.getText()+"3");
    }

    public void btnCuatro(View view){
        tv = (TextView) findViewById(R.id.textView);
        tv.setText(tv.getText()+"4");
    }

    public void btnCinco(View view){
        tv = (TextView) findViewById(R.id.textView);
        tv.setText(tv.getText()+"5");
    }

    public void btnSeis(View view){
        tv = (TextView) findViewById(R.id.textView);
        tv.setText(tv.getText()+"6");
    }

    public void btnSiete(View view){
        tv = (TextView) findViewById(R.id.textView);
        tv.setText(tv.getText()+"7");
    }

    public void btnOcho(View view){
        tv = (TextView) findViewById(R.id.textView);
        tv.setText(tv.getText()+"8");
    }

    public void btnNueve(View view){
        tv = (TextView) findViewById(R.id.textView);
        tv.setText(tv.getText()+"9");
    }

    public void guardarValor1 (View view){
        tv = (TextView) findViewById(R.id.textView);
        n1 =Double.parseDouble(tv.getText().toString());
        tv.setText(" ");
    }

    public void btnBorrar(View view) {
        n1 = 0.0;
        n2 = 0.0;
        puntoB=false;
        tv = findViewById(R.id.textView);
        tv.setText("");
    }

    public void btnDivision (View view) {
        Operador = DIVISION;
        guardarValor1(view);
    }

    public void btnMultiplicacion (View view) {
        Operador = MULTIPLICACION;
        guardarValor1(view);
    }

    public void btnSuma (View view) {
        Operador = SUMA;
        guardarValor1(view);
    }

    public void btnResta (View view) {
        Operador = RESTA;
        guardarValor1(view);
    }

    public void btnIgual (View view) {
        tv = (TextView) findViewById(R.id.textView);
        n2 = Double.parseDouble(tv.getText().toString());
        if (Operador==SUMA){
            res = n1 + n2;
        } else if(Operador==RESTA){
            res = n1 -n2;
        } else if (Operador==MULTIPLICACION){
            res = n1*n2;
        }else if (Operador==DIVISION){
            res = n1/n2;
        }
        tv.setText("" + res);
    }
}