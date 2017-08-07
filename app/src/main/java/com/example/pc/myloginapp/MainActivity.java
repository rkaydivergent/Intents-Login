package com.example.pc.myloginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void loginMethod(View view){
        final TextView emailtext = (TextView) findViewById(R.id.email_input);
       // final TextView passtext = (TextView) findViewById(R.id.email_input);
        Intent myintent = new Intent(this, HomeScreen.class);

        String userInput = emailtext.getText().toString();
        myintent.putExtra("inputMessage",userInput);
        startActivity(myintent);

    }
}
