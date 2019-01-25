package com.example.sethu.pjct;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class WelcomeActivity extends AppCompatActivity {
String us,ps,checkUser;
    String getus,getps;
    Button b, b1;
    ;
    ImageView v1,v2,v3,v4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        v1=(ImageView)findViewById(R.id.add);
        v2=(ImageView)findViewById(R.id.sub);
        v3=(ImageView)findViewById(R.id.mul);
        v4=(ImageView)findViewById(R.id.div);


        b=(Button)findViewById(R.id.logoutbtn) ;
       b.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               SharedPreferences.Editor edits=getSharedPreferences("login",MODE_PRIVATE).edit();
               edits.clear();
               edits.commit();
               Intent q=new Intent(getApplicationContext(),loginactivity.class);
               startActivity(q);


           }
       });
        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Add.class);
                startActivity(i);

            }


        });
        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Subactivity.class);
                startActivity(i);

            }

        });
        v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Multipleactivity.class);
                startActivity(i);
            }
        });
        v4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),RegActivity.class);
                startActivity(i);
            }
        });
        b1=(Button)findViewById(R.id.view);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),viewall.class);
                startActivity(i);
            }
        });
//        Intent q=getIntent();
//        us=q.getStringExtra("username");
//        ps=q.getStringExtra("password");


    }

    }

