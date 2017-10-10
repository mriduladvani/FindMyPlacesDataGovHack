package com.crypticducs000webhost.datagovhack;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button btn = (Button)findViewById(R.id.button6);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast a1 = Toast.makeText(Main4Activity.this,"Loading...",Toast.LENGTH_SHORT);
                a1.show();
                Intent a = new Intent(Main4Activity.this,Main2Activity.class);
                startActivity(a);
            }
        });

        Button btn1 = (Button)findViewById(R.id.button4);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast a1 = Toast.makeText(Main4Activity.this,"Loading...",Toast.LENGTH_SHORT);
                a1.show();
                Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("https://data.gov.in"));
                startActivity(a);
            }
        });
        Button btn2 = (Button)findViewById(R.id.button5);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast a1 = Toast.makeText(Main4Activity.this,"Loading...",Toast.LENGTH_SHORT);
                a1.show();
                Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("http://crypticducs.000webhostapp.com"));
                startActivity(a);
            }
        });



    }

}
