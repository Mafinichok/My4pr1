package com.example.my4pr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView prinimay = findViewById(R.id.textViewBLAbLabla);

        Bundle arguments = getIntent().getExtras();

        String monet = arguments.getString("name");
        prinimay.setText(monet);
    }
}