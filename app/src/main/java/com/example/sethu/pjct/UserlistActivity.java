package com.example.sethu.pjct;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class UserlistActivity extends AppCompatActivity {
    TextView textView;
    String Name,un,email,phno,web,getstreet,getcity,getzipcode,getsuite,finaldata="";
    String url="http://jsonplaceholder.typicode.com/users";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlist);
        textView=(TextView)findViewById(R.id.tv);
        FetchData();
    }

    private void FetchData() {

        Toast.makeText(getApplicationContext(),"hello",Toast.LENGTH_LONG).show();
        Log.d("test","working");
        StringRequest string=new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
//                      Log.d("response",response);
                        try {
                            JSONArray json=new JSONArray(response);
                            for (int i=0;i<json.length();i++)
                            {
                                JSONObject jsonobject=json.getJSONObject(i);
                                Name=jsonobject.getString("name");
                                Log.d("Names",Name);
                                un=jsonobject.getString("username");
                                Log.d("username",un);
                                email=jsonobject.getString("email");

                                phno=jsonobject.getString("phone");
                                web=jsonobject.getString("website");




                                JSONObject ob1=new JSONObject(jsonobject.getString("address"));
                                getstreet=ob1.getString("street");
                                Log.d ("Address",getstreet);
                                getcity=ob1.getString("city");
                                getzipcode=ob1.getString("zipcode");
                                getsuite=ob1.getString("suite");




                                finaldata +="Name:" +Name+"\n\n";
                                finaldata +="email id:" +email+"\n\n";
                                finaldata +="username:" +un+"\n\n";




                            }
                            textView.setText(finaldata);

                        }
                        catch (JSONException ob){
                            Log.d("exe",ob.toString());

                        }


                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }

        );
        RequestQueue requestqueue= Volley.newRequestQueue(getApplicationContext());
        requestqueue.add(string);

    }
}
