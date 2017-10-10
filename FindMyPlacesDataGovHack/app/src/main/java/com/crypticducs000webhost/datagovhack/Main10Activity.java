package com.crypticducs000webhost.datagovhack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        Button btn1 = (Button)findViewById(R.id.button9);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast a1 = Toast.makeText(Main10Activity.this,"Loading...",Toast.LENGTH_SHORT);
                a1.show();
                Intent a = new Intent(Main10Activity.this,MainActivity.class);
                startActivity(a);
            }
        });
    }

}
