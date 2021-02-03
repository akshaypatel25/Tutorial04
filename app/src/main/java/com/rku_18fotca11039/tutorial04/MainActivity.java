package com.rku_18fotca11039.tutorial04;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText etxtemail;
    EditText etxtpassword;
    Button btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etxtemail = findViewById(R.id.etxtemail);
        etxtpassword = findViewById(R.id.etxtpassword);
        btnlogin = findViewById(R.id.btnlogin);

    }
    public void btnloginClick(View view) {
        String valusername = etxtemail.getText().toString();
        String valpassword = etxtpassword.getText().toString();

            if(valusername.equals("")){
                Toast.makeText(this, "Username can not be empty.", Toast.LENGTH_SHORT).show();
                return ;
            }
            if(valpassword.equals("")){
                Toast.makeText(this, "Password can not be empty.", Toast.LENGTH_SHORT).show();
                return ;
            }
            if (valpassword.length()<6){
                Toast.makeText(this, "Password must be of minimum 6 character.", Toast.LENGTH_SHORT).show();
            }
            if (!Patterns.EMAIL_ADDRESS.matcher(valusername).matches()){
                Toast.makeText(this, "Username must be proper email address.", Toast.LENGTH_SHORT).show();
            }


        if(valusername.equals("admin@gmail.com") && valpassword.equals("123456")){
            Intent intent = new Intent(MainActivity.this,welcome.class);
            intent.putExtra("Welcome,",etxtemail.getText().toString());
            startActivity(intent);
            finish();
            Toast.makeText(this, "Loggin Successful", Toast.LENGTH_SHORT).show();

        }else{
            Toast.makeText(this, "Loggin failed", Toast.LENGTH_SHORT).show();
        }
    }
}