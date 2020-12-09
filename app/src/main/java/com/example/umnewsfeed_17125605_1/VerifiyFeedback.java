//17125605/1 Muhammad Firdaus Bin Rosly
package com.example.umnewsfeed_17125605_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class VerifiyFeedback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verifiy_feedback);

        Intent intent = getIntent();
        String good = intent.getStringExtra("selectedgood");
        String bad = intent.getStringExtra("selectedbad");
        String rating=intent.getStringExtra("rating");

        TextView goodtextview=(TextView) findViewById(R.id.likeour);
        TextView badtextview=(TextView) findViewById(R.id.badour);
        TextView ratingview=(TextView) findViewById(R.id.ratingoutput);

        goodtextview.setText("You like our "+good);
        badtextview.setText("There is still improvement for our  "+bad);
        ratingview.setText("Overall performance rate: "+rating+" points");


        Button correct=(Button) findViewById(R.id.correctbutton);
        Button secondthought=(Button) findViewById(R.id.secondthought);


        correct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message="Thank you for your feedback and support";
                Toast toast=Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        secondthought.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent feedback=new Intent(getApplicationContext(),SubmitFeedback.class);
                startActivity(feedback);
            }
        });


    }
}