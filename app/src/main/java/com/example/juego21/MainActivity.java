package com.example.juego21;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4,btn5, reiniciar;
    TextView numero,numerosuma;
    int suma=0, num1, num2, num3, num4, num5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.boton1);
        btn2 = findViewById(R.id.boton2);
        btn3 = findViewById(R.id.boton3);
        btn4 = findViewById(R.id.boton4);
        btn5 = findViewById(R.id.boton5);
        reiniciar = findViewById(R.id.returngame);
        numerosuma = findViewById(R.id.suma);
        numero = findViewById(R.id.numero);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        reiniciar.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.boton1:
                Random alnumero1 = new Random();
                num1 = alnumero1.nextInt(10)+1;
                suma = num1+suma;
                Log.d("aleatorio", String.valueOf(suma));
                numerosuma.setText(String.valueOf(suma));
                numero.setText(String.valueOf(num1));
                btn1.setClickable(false);break;
            case R.id.boton2:
                Random alnumero2 = new Random();
                num2 = alnumero2.nextInt(10)+1;
                suma = suma + alnumero2.nextInt(10)+1;
                numerosuma.setText(String.valueOf(suma));
                numero.setText(String.valueOf(num2));
                btn2.setClickable(false);break;
            case R.id.boton3:
                Random alnumero3 = new Random();
                num3 = alnumero3.nextInt(10)+1;
                suma = suma + alnumero3.nextInt( 10)+1;
                numerosuma.setText(String.valueOf(suma));
                numero.setText(String.valueOf(num3));
                btn3.setClickable(false);break;
            case R.id.boton4:
                Random alnumero4 = new Random();
                num4 = alnumero4.nextInt(10)+1;
                suma = suma + alnumero4.nextInt( 10)+1;
                numerosuma.setText(String.valueOf(suma));
                numero.setText(String.valueOf(num4));
                btn4.setClickable(false);break;
            case R.id.boton5:
                Random alnumero5 = new Random();
                num5 = alnumero5.nextInt(10)+1;
                suma = suma + alnumero5.nextInt(10)+1;
                numerosuma.setText(String.valueOf(suma));
                numero.setText(String.valueOf(num5));
                btn5.setClickable(false);
                checar();break;
            case R.id.returngame:
                btn1.setClickable(true);
                btn2.setClickable(true);
                btn3.setClickable(true);
                btn4.setClickable(true);
                btn5.setClickable(true);
                numerosuma.setText("0");
                suma = 0;
        }
    }

    public void checar(){
        if (suma == 21){
            Toast.makeText(this, "Ganaste", Toast.LENGTH_SHORT).show();
        }
        else if (suma>21){
            Toast.makeText(this, "Te pasate del numero perdiste", Toast.LENGTH_SHORT).show();
        }
        else if (suma<21){
            Toast.makeText(this, "No llegaste al numero, perdiste", Toast.LENGTH_SHORT).show();
        }
    }

}

