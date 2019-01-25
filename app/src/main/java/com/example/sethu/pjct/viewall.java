package com.example.sethu.pjct;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class viewall extends AppCompatActivity {
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewall);
        lv=(ListView)findViewById(R.id.mylistview);
        String[] Students={"amal","anjali","yamuna","arya"};
        ArrayAdapter adapter=new ArrayAdapter(getApplicationContext(),R.layout.list_view_activity,Students);
        lv.setAdapter(adapter);
    }
}
