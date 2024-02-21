package com.example.detectick_app;

import static com.example.detectick_app.R.layout.activity_ticks;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TicksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_ticks);

        Button button13 =findViewById(R.id.rs_button);

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TicksActivity.this, RsActivity.class);
                startActivity(intent);
            }
        });

        Button button14 =findViewById(R.id.buttontoDR);

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TicksActivity.this, DrActivity.class);
                startActivity(intent);
            }
        });


        Button button15 =findViewById(R.id.irs_button);

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TicksActivity.this, IrsActivity.class);
                startActivity(intent);
            }
        });


    }
}