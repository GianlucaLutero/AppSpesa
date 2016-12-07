package com.example.gianluca.manageexpenses;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddExpenseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addexpense);

        final EditText total = (EditText) findViewById(R.id.total);
        final EditText numberParticipants = (EditText) findViewById(R.id.numberParticipants);
        Button process = (Button) findViewById(R.id.buttonProcess);
        final TextView result = (TextView) findViewById(R.id.result);


   process.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               double r= ExpenseOperations.divide(Integer.parseInt(total.getText().toString()),Integer.parseInt(numberParticipants.getText().toString()));
                String stringdouble= Double.toString(r);
                result.setText(stringdouble);
                   }
         });


    }
}
