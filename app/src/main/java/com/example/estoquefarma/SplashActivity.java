package com.example.estoquefarma;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new android.os.Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, SplashActivity.class);
            startActivity(intent);
            finish();
        }, 2000); // 2 segundos de splash screen
    }



}
