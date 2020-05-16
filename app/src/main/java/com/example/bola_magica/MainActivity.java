package com.example.bola_magica;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {
    private ImageView Ball;
    private TextView respuesta;

    private String [] respuestaArray = {"Es cierto", "Definitivamente es así", "Sin duda", "Sí definitivamente", "Puede confiar en él", "Como yo lo veo, sí",
            "Lo más probable", "Perspectiva buena", "Sí", "Las señales apuntan a sí", "Respuesta confusa intente de nuevo", "Pregunte de nuevo más tarde",
            "Mejor no decirte ahora", "No puedo predecir ahora", "Concéntrate y pregunta de nuevo", "No cuentes con eso",
            "Mi respuesta es no", "Mis fuentes dicen que no", "Outlook no es tan bueno", "Muy dudoso"};

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referencia imagen
        Ball = findViewById(R.id.boton);

        //referencia segundo texto
        respuesta = findViewById(R.id.respuesta);

        Ball.setOnClickListener((View.OnClickListener) this);
        Toast.makeText(MainActivity.this, "Buscando tu destino", LENGTH_SHORT).show();

    }
    @Override
    public void onClick(View v){


    switch (v.getId()){
        case R.id.boton:
            int randon = new Random().nextInt(respuestaArray.length);
            respuesta.setText(respuestaArray(randon));

            break;

          }
    }
}


