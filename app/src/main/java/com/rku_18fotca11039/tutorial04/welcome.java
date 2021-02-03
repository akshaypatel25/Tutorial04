package com.rku_18fotca11039.tutorial04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class welcome extends AppCompatActivity {
    TextView txtwelcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Bundle bundle = getIntent().getExtras();

        txtwelcome = findViewById(R.id.txtwelcome);

        String  etxtemail  =bundle.getString("Welcome,");
        txtwelcome.setText("Welcome "+etxtemail);

    txtwelcome = findViewById(R.id.txtwelcome);
//    txtwelcome.setText(etxtemail);



    }
}