package com.crypticducs000webhost.datagovhack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.Toast;

public class Main9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        Button btn = (Button)findViewById(R.id.printticket);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast a1 = Toast.makeText(Main9Activity.this,"Downloading...",Toast.LENGTH_SHORT);
                a1.show();
            }
        });

        Button btn1 = (Button)findViewById(R.id.hometicket);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast a2 = Toast.makeText(Main9Activity.this,"Loading...",Toast.LENGTH_SHORT);
                a2.show();
                Intent a = new Intent(Main9Activity.this,MainActivity.class);
                startActivity(a);
            }
        });
    }
}
