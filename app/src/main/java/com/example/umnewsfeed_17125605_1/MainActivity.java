//17125605/1 Muhammad Firdaus Bin Rosly
package com.example.umnewsfeed_17125605_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //direct to login page
        setContentView(R.layout.activity_login);

        Button loginbutton=(Button) findViewById(R.id.loginbutton);

        //get main page intent
        Intent mainpage=new Intent(getApplicationContext(),Login.class);

        //get input
        EditText username=(EditText) findViewById(R.id.username);
        EditText password=(EditText) findViewById(R.id.password);

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernameinput=username.getText().toString();
                String passwordinput=password.getText().toString();
                if(usernameinput.equals("17125605") &&passwordinput.equals("ot2020")){
                    startActivity(mainpage);

                } else {
                    String message="Invalid password";
                    Toast toast=Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        });
    }
}