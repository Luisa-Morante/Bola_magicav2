package com.example.bola_magica;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {
    private ImageView Ball;
    private TextView respuesta;

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

}
