package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TemperatureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);

        EditText e;
        TextView tv1;
        Button len;

        e=findViewById(R.id.cel);
        tv1=findViewById(R.id.Far);
        len=findViewById(R.id.tempConvert);

        len.setBackgroundColor(Color.rgb(146, 223, 224));
        len.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double convert= Double.parseDouble(e.getText().toString());
                tv1.setText(String.valueOf(convert*1.8+32)+"F");

            }
        });

    }
}