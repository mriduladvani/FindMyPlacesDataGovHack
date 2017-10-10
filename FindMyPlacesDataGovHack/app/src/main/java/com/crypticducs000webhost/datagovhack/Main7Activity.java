package com.crypticducs000webhost.datagovhack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main7Activity extends AppCompatActivity {

    String a3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        final EditText station1 = (EditText)findViewById(R.id.station);
        final EditText name1=(EditText)findViewById(R.id.name);
        final EditText contactnumber1 = (EditText)findViewById(R.id.contactnumber);
        //final String a3 = station1.getText().toString();
        Button btn = (Button)findViewById(R.id.otp);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  Toast a1 = Toast.makeText(Main7Activity.this,"OTP send",Toast.LENGTH_SHORT);
                //a1.show();
                if(!station1.getText().toString().isEmpty() && !name1.getText().toString().isEmpty() && !contactnumber1.getText().toString().isEmpty()) {
                    Toast a1 = Toast.makeText(Main7Activity.this,"OTP Send",Toast.LENGTH_SHORT);
                    a1.show();
                    Intent a2 = new Intent(Main7Activity.this, Main8Activity.class);
                    startActivity(a2);
                }else{
                    Toast a1 = Toast.makeText(Main7Activity.this,"No Entry Found...",Toast.LENGTH_SHORT);
                    a1.show();
                }

            }
        });

        Button btn1 = (Button)findViewById(R.id.home1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast a1 = Toast.makeText(Main7Activity.this,"Loading...",Toast.LENGTH_SHORT);
                a1.show();

                Intent a =new Intent(Main7Activity.this,MainActivity.class);
                startActivity(a);
            }
        });





    }
}
