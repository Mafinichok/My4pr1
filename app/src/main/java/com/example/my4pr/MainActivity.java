package com.example.my4pr;

import androidx.activity.EdgeToEdge;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button knopka = findViewById(R.id.puppon);

        knopka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNextActivity(v);
            }
        });
    }

    public void onNextActivity(View view){
        EditText text_name = findViewById(R.id.polevod1);
        EditText text_midlename = findViewById(R.id.polevod2);
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("name", text_name.getText().toString());
        intent.putExtra("midlename", text_midlename.getText().toString());
        startActivity(intent);

    }



















}

