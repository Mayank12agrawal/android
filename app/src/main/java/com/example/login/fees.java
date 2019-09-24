package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fees.R;

public class fees extends AppCompatActivity {

    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fees);
        button2= (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity();
            }
        });
    }
    public void activity(){

        Intent intent=new Intent(this,Fees1.class);
        startActivity(intent);
    }
}
