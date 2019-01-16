package com.example.sethu.pjct;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegActivity extends AppCompatActivity {

    EditText name,admno,roll,clge,place,stud,pasd,conpsd;
    Button b2,b3;
    String n,a,r,c,p,s,ps,cp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        name=(EditText)findViewById(R.id.nam);
        admno=(EditText)findViewById(R.id.admn);
        roll=(EditText)findViewById(R.id.rno);
        clge=(EditText)findViewById(R.id.clg);
        place=(EditText)findViewById(R.id.plc);
        stud=(EditText)findViewById(R.id.sid);
        pasd=(EditText)findViewById(R.id.psw);
        conpsd=(EditText)findViewById(R.id.cpswd);
        b2=(Button)findViewById(R.id.reg);
        b3=(Button)findViewById(R.id.alreg);
        b2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n = name.getText().toString();
                a = admno.getText().toString();
                r = roll.getText().toString();
                c = clge.getText().toString();
                p = place.getText().toString();
                s=stud.getText().toString();
                ps= pasd.getText().toString();
                cp= conpsd.getText().toString();

                    Toast.makeText(getApplicationContext(), n, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), a, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), r, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), c, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), p, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), s, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), ps, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), cp, Toast.LENGTH_LONG).show();

                }
        }));
        b3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(getApplicationContext(),loginactivity.class);
                startActivity(m);
            }
        }));
    }
}
