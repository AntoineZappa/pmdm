package edu.pmdm.sharemybike;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnlogin = findViewById(R.id.btnLogin);
        btnlogin.setOnClickListener(v -> {
            //start next activity (BikeActivity)
            Intent i = new Intent(getApplicationContext(), BikeActivity.class);
            startActivity(i);
        });
    }
}