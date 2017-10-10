package com.crypticducs000webhost.datagovhack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        Button btn = (Button)findViewById(R.id.payotp);
        final EditText otp11 = (EditText)findViewById(R.id.otp1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!otp11.getText().toString().isEmpty()){
                    Toast a1 = Toast.makeText(Main8Activity.this,"Payment Successfull. Printing Ticket.",Toast.LENGTH_SHORT);
                    a1.show();
                    Intent a = new Intent(Main8Activity.this,Main9Activity.class);
                    startActivity(a);
                }else{
                    Toast a1 = Toast.makeText(Main8Activity.this,"Please Enter OTP ",Toast.LENGTH_SHORT);
                    a1.show();
                }


            }
        });
    }
}
