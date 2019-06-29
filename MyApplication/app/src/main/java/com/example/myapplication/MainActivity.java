package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  private   Button Convert ,Exit;
   private EditText millimeters;
   private TextView inches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Convert = (Button)findViewById(R.id.convt);
        Exit =(Button)findViewById(R.id.exit);
        millimeters=(EditText)findViewById(R.id.textmill);
        inches = (TextView)findViewById(R.id.inchview);

        double Millimetere = Double.parseDouble(millimeters.getText().toString());
       final double inch = Millimetere/25.4;


        Convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inches.setText(Double.toString(inch));
            }
        });
        Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });
    }
}
