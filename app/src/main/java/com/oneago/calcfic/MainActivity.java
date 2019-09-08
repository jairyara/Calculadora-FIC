package com.oneago.calcfic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button open, open2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Var_onCreate", Toast.LENGTH_SHORT);
        open = findViewById(R.id.button1);
        open.setOnClickListener(this);
        open2 = findViewById(R.id.button2);
        open2.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Var_onStart", Toast.LENGTH_SHORT);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.button1:
                Toast.makeText(this, "Pasa a FIC MENSUAL", Toast.LENGTH_SHORT);
                Intent FICmonth = new Intent(this, fic_monthly.class);
                startActivity(FICmonth);
                break;

            case R.id.button2:
                Toast.makeText(this, "Pasa a FIC presuntivo", Toast.LENGTH_SHORT);
                Intent FICpresuntivo = new Intent(this, MainContractActivity.class);
                startActivity(FICpresuntivo);
                break;
        }
    }
}






