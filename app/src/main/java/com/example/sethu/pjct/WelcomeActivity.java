package com.example.sethu.pjct;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class WelcomeActivity extends AppCompatActivity {
String us,ps,checkUser;
    String getus,getps;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
      SharedPreferences pref=getSharedPreferences("login",MODE_PRIVATE);






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
//        Intent q=getIntent();
//        us=q.getStringExtra("username");
//        ps=q.getStringExtra("password");


    }

    }

