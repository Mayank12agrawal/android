package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.fees.R;


public class MainActivity extends AppCompatActivity {
    private ImageView butt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butt= (ImageView) findViewById(R.id.butt);

        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity();
            }
        });
    }
   public void activity(){

       Intent intent=new Intent(this,fees.class);
       startActivity(intent);
   }

}

