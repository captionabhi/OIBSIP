package com.example.unitconverter;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LengthActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        EditText et1;
        TextView tv1;
        Button len;

        et1=findViewById(R.id.cm);
        tv1=findViewById(R.id.Meter);
        len=findViewById(R.id.lenConvert);
        len.setBackgroundColor(Color.rgb(146, 223, 224));
        len.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double convert= Double.parseDouble(et1.getText().toString());
                tv1.setText(String.valueOf(convert*0.01)+"M");

            }
        });



    }
}