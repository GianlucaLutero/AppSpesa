package com.example.gianluca.manageexpenses;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.gianluca.manageexpenses.R.id.buttonProcess;

public class AddExpenseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addexpense);

        final EditText total = (EditText) findViewById(R.id.total);
        final EditText numberParticipants = (EditText) findViewById(R.id.numberParticipants);
        final Button process = (Button) findViewById(R.id.buttonProcess);
        final TextView result = (TextView) findViewById(R.id.result);
        Log.w("myApp", "no network");

        final Toast toast = Toast.makeText(getApplicationContext(), "You must insert any values.",
                Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);


            process.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (total.getText().toString().length() == 0 || numberParticipants.getText().toString().length() == 0) {

                        toast.show();


                    }
                    else
                    {
                        Expense expense = new Expense(Double.parseDouble(total.getText().toString()), Integer.parseInt(numberParticipants.getText().toString()));




                        double r=ExpenseOperations.divide(Integer.parseInt(total.getText().toString()),Integer.parseInt(numberParticipants.getText().toString()));
                        String rs= String.valueOf(r);
                        result.setText(rs);
                    }



                }
            });






    }
}
