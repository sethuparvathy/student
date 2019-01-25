package com.example.sethu.pjct;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Subactivity extends AppCompatActivity {
    EditText n1, n2,n3;
    Button bb2, bb3;
    String s1, s2, s3;
    int number1, number2, number3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subactivity);
        n1 = (EditText) findViewById(R.id.no1);
        n2 = (EditText) findViewById(R.id.no2);
        n3=(EditText)findViewById(R.id.no3);

        bb2 = (Button) findViewById(R.id.sb);
        bb3 = (Button) findViewById(R.id.bk);
        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1 = n1.getText().toString();
                s2 = n2.getText().toString();

                number1 = Integer.parseInt(s1);
                number2 = Integer.parseInt(s2);

                number3 = number1 - number2;
                s3 = String.valueOf(number3);
                Toast.makeText(getApplicationContext(), s3, Toast.LENGTH_LONG).show();
                n3.setText(s3);
                n3.setVisibility(view.VISIBLE);

            }
        });
        bb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(getApplicationContext(), WelcomeActivity.class);
                startActivity(s);
                n1 = (EditText) findViewById(R.id.num1);

                ;
            }
        });
    }
}




