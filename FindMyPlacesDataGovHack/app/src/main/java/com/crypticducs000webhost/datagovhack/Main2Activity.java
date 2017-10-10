package com.crypticducs000webhost.datagovhack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btn = (Button)findViewById(R.id.button3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast a1 = Toast.makeText(Main2Activity.this,"Loading...",Toast.LENGTH_SHORT);
                a1.show();
                Intent toy = new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(toy);
            }
        });


        Button btn1 = (Button)findViewById(R.id.button2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast a1 = Toast.makeText(Main2Activity.this,"Loading...",Toast.LENGTH_SHORT);
                a1.show();
                Intent toy1 = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(toy1);
            }
        });


    }
}
