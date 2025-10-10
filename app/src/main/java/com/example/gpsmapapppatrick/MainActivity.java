package com.example.gpsmapapppatrick;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView titleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleText = findViewById(R.id.titleText);
        Button btnStart = findViewById(R.id.btnStart);

        btnStart.setOnClickListener(v -> {
            Toast.makeText(this, "¡Bienvenido, Patrick!", Toast.LENGTH_SHORT).show();

            Animation fadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out);
            titleText.startAnimation(fadeOut);

            // Espera 500ms para que la animación termine antes de cambiar de pantalla
            titleText.postDelayed(() -> {
                Intent intent = new Intent(this, MapCamaraActivity.class);
                startActivity(intent);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }, 500);
        });
    }
}