package com.example.sethu.pjct;

import android.content.Intent;
import android.graphics.Region;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginactivity extends AppCompatActivity {
    EditText s,p;
    Button b,b1;
    String st,pasd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);
        s=(EditText)findViewById(R.id.sd);
        p=(EditText)findViewById(R.id.pass);
        b=(Button)findViewById(R.id.login);
        b1=(Button)findViewById(R.id.register);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                st=s.getText().toString();
                pasd=p.getText().toString();
                if (st.equals("mzc")&&pasd.equals("college")){
                    Intent q=new Intent(getApplicationContext(),WelcomeActivity.class);
                    startActivity(q);
                }
                else {
                    Toast.makeText(getApplicationContext(),"error",Toast.LENGTH_LONG).show();
                }

            }
        });
        b1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent w=new Intent(getApplicationContext(), RegActivity.class);
                startActivity(w);

            }
        }));

    }
}
