package com.example.miwoklearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView e1 = (TextView) findViewById(R.id.colorsEditText);
        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorsActivity(e1);
                Toast.makeText(getApplicationContext(), R.string.Colors, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void numbersActivity(View view){
        Intent i1 = new Intent(this, numbersActivity.class);
        startActivity(i1);
    }

    public void colorsActivity(View view){
        Intent i1 = new Intent(this, colorsActivity.class);
        startActivity(i1);
    }

    public void phrasesActivity(View view){
        Intent i1 = new Intent(this, phrasesActivity.class);
        startActivity(i1);
    }

    public void familyMembersActivity(View view){
        Intent i1 = new Intent(this, familyMembersActivity.class);
        startActivity(i1);
    }
}
