//17125605/1 Muhammad Firdaus Bin Rosly
package com.example.umnewsfeed_17125605_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //direct to main page
        setContentView(R.layout.activity_main);


        Intent newsfeed=new Intent(getApplicationContext(),View_News_Feed.class);
        Intent feedback=new Intent(getApplicationContext(),SubmitFeedback.class);

        Button newsfeedbutton=(Button) findViewById(R.id.newsfeedbutton);
        Button feedbackbutton=(Button) findViewById(R.id.submitfeedbackbutton);

        newsfeedbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(newsfeed);
            }
        });

        feedbackbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(feedback);

            }
        });




    }
}