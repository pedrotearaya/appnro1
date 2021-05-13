package com.example.appnro1;

import android.support.v7.app.AppCompactActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageButton boton;
    private TextView respuesta;
    private String [] respuestaArray ={"Es cierto", "Definitivamente es así", "Sin duda", "Sí definitivamente", "Puede confiar en él", "Como yo lo veo, sí",
            "Lo más probable", "Perspectiva buena", "Sí", "Las señales apuntan a sí", "Respuesta confusa intente de nuevo", "Pregunte de nuevo más tarde",
            "Mejor no decirte ahora", "No puedo predecir ahora", "Concéntrate y pregunta de nuevo", "No cuentes con eso",
            "Mi respuesta es no", "Mis fuentes dicen que no", "Outlook no es tan bueno", "Muy dudoso"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referencia imagen
        boton = findViewById(R.id.btn);
        //referencia texto
        respuesta = findViewById(R.id.answer);

        //proceso
        boton.setOnClickListener(this);
        Toast.makeText(MainActivity.this, " CONSULTA TU SUERTE", Toast.LENGTH_SHORT.show());
       // Toast.makeText(context:MainActivity.this), text:"PRUEBA SUERTE",Toast.LENGTH_SHORT.show();
    }
    @Override
    public void onClick(View v){
        //crear metodo
        switch (v.getId()) {
            case R.id.btn:

                int rand = new Random().nextInt(respuestaArray.length);
                respuesta.setText(respuestaArray[rand]);
                break;
        }
    }
}



