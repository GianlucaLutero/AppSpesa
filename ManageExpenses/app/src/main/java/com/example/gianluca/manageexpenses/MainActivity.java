package com.example.gianluca.manageexpenses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editName = (EditText) findViewById(R.id.editName);
        EditText editSum = (EditText) findViewById(R.id.editSum);

        Button addExpense = (Button) findViewById(R.id.addExpense);


    }
}
