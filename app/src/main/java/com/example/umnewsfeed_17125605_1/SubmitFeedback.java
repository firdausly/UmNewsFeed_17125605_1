//17125605/1 Muhammad Firdaus Bin Rosly
package com.example.umnewsfeed_17125605_1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class SubmitFeedback extends Activity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_feedback);

        Spinner goodspinner = (Spinner) findViewById(R.id.goodspinner);
        Spinner badspinner = (Spinner) findViewById(R.id.badspinner);

        goodspinner.setOnItemSelectedListener(this);
        badspinner.setOnItemSelectedListener(this);

        List<String> categories = new ArrayList<String>();
        categories.add("UI Interface");
        categories.add("Navigation");
        categories.add("Language");
        categories.add("Others");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        goodspinner.setAdapter(dataAdapter);
        badspinner.setAdapter(dataAdapter);

        String selectedgood=goodspinner.getSelectedItem().toString();
        String selectedbad=badspinner.getSelectedItem().toString();

        RatingBar rating=(RatingBar) findViewById(R.id.ratingBar);

        int ratinginput=rating.getNumStars();

        Button submitfeedback=(Button) findViewById(R.id.submitfeedback);

        Intent verifyfeedback=new Intent(getApplicationContext(),VerifiyFeedback.class);

        submitfeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verifyfeedback.putExtra("selectedgood",selectedgood);
                verifyfeedback.putExtra("selectedbad",selectedbad);
                verifyfeedback.putExtra("rating",ratinginput);

                startActivity(verifyfeedback);
            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String item = parent.getItemAtPosition(position).toString();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}