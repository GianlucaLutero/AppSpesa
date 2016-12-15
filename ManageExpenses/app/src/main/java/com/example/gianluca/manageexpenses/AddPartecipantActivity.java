package com.example.gianluca.manageexpenses;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AddPartecipantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addpartecipant);

        final EditText editName = (EditText) findViewById(R.id.editName);
        final EditText editSurname = (EditText) findViewById(R.id.editSurname);
        final Button process = (Button) findViewById(R.id.buttonProcess);
        //Log.w("myApp", "no network");
        final Toast toast = Toast.makeText(getApplicationContext(), "You must insert any values.",
                Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);



            process.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                ExpenseOperations.aggiungiPartecipante(editName.getText().toString(),editSurname.getText().toString());


                }
            });






    }
}
