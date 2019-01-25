package com.example.sethu.pjct;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Add extends AppCompatActivity {
    EditText n1, n2, n3,n4;
    Button bb, bb1;
    String s1, s2, s3, s4;
    int number1, number2, number3, number4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        n1 = (EditText) findViewById(R.id.num1);
        n2 = (EditText) findViewById(R.id.num2);
        n3 = (EditText) findViewById(R.id.num3);
        n4=(EditText)findViewById(R.id.num4);
        bb = (Button) findViewById(R.id.ad);
        bb1 = (Button) findViewById(R.id.bk);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1 = n1.getText().toString();
                s2 = n2.getText().toString();
                s3 = n3.getText().toString();
                number1 = Integer.parseInt(s1);
                number2 = Integer.parseInt(s2);
                number3 = Integer.parseInt(s3);
                number4 = number1 + number2 + number3;
                s4 = String.valueOf(number4);
                n4.setText(s4);



            }
        });
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s=new Intent(getApplicationContext(),WelcomeActivity.class);
                startActivity(s); n1 = (EditText) findViewById(R.id.num1);

            }
        });

    }

}


