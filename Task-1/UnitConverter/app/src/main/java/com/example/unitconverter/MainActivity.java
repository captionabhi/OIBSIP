package com.example.unitconverter;
import static com.example.unitconverter.R.color.buttonb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1,b2;

        b1=findViewById(R.id.length);
        b2=findViewById(R.id.temp);
        b1.setBackgroundColor(Color.rgb(162, 222, 193));
        b2.setBackgroundColor(Color.rgb(239, 240, 170));
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startLengthActivity();
            }
        });

        b2=findViewById(R.id.temp);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startTemperatureActivity();
            }
        });

    }

    private void startTemperatureActivity() {
        Intent intent1=new Intent(this,TemperatureActivity.class);
        startActivity(intent1);
    }

    private void startLengthActivity() {
        Intent intent2=new Intent(this,LengthActivity.class);
        startActivity(intent2);
    }
}