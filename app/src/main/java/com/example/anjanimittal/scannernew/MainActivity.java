package com.example.anjanimittal.scannernew;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{

   Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1 = (Button)findViewById(R.id.button2);
        b2 = (Button)findViewById(R.id.button3);
        b2.setOnClickListener(this);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button2)
        {
            Intent intent1 = new Intent();
            intent1.setClass(MainActivity.this,QRCode.class);
            startActivity(intent1);
        }
        else if(v.getId()==R.id.button3)
        {
            Intent intent1 = new Intent();
            intent1.setClass(MainActivity.this,textRecognization.class);
            startActivity(intent1);
        }
    }
}
