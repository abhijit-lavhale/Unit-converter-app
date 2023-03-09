package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView welcome_text;
    TextView result_text;
    Button btn;
    EditText editText;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcome_text = findViewById(R.id.heading_of_app);
        result_text = findViewById(R.id.result_textview);
        btn = findViewById(R.id.btn);
        editText = findViewById(R.id.editText);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                double kilos_entered = Double.parseDouble(editText.getText().toString());

                result_text.setText(""+convertTOPounds(kilos_entered) +"lb");

            }
        });

    }
    public double convertTOPounds(double kilos){
        double pounds_result = kilos*2.20462;
        return pounds_result;


    }
}