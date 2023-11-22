package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonName = findViewById(R.id.button_name);
        buttonName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
        Button buttonURL = findViewById(R.id.button_url);
        buttonURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText url = findViewById(R.id.text_url);
                String urlText = String.valueOf(url.getText());
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlText));
                startActivity(intent);
            }
        });
        Button buttonGeo = findViewById(R.id.button_geo);
        buttonGeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
    }
}