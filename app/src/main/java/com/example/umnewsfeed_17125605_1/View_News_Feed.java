//17125605/1 Muhammad Firdaus Bin Rosly
package com.example.umnewsfeed_17125605_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Random;

public class View_News_Feed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view__news__feed);



        String[] StringArray=   {
                "UM Scientists Discover First Ancient Elephant Fossil In Malaysia",
                "UM Lauds Life On Venus Discovery, Leads Malaysia In Astronomy Through MoU With EAO",
                "UM And Yale University To Establish A Research & Training Centre On HIV Implementation Science",
                "UM Researchers Develop CoSMoS: Monitoring System For Hospital Covid19 Management",
                "UM Releases Joint Report With Clarivate To Evaluate Its Research And Innovation Footprint",
        };

        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.listview,StringArray);

        ListView listView = (ListView) findViewById(R.id.listviewnewsfeed);
        listView.setAdapter(adapter);

        Random random=new Random();
        int upperbound=StringArray.length;

        int random_number=random.nextInt(upperbound);


        TextView selectednews=(TextView) findViewById(R.id.selectednews);

        //view random array
        selectednews.setText(StringArray[random_number]);


        Intent main=new Intent(getApplicationContext(),Login.class);

        Button backtohome=(Button) findViewById(R.id.backtomenu);

        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(main);
            }
        });



    }
}