package com.example.android.mathquize;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //score
    int score = 0;

    @Override
    //oncreate
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void CheckBox(View view) {

        boolean checked = ((CheckBox) view).isChecked();


        switch (view.getId()) {
            case R.id.checkboxQuestion3_1:
                if (checked) {
                    Toast.makeText(this, "Correct!! Good jop", Toast.LENGTH_SHORT).show();
                    score = score + 1;
                    break;
                }
            case R.id.checkboxQuestion3_2:
                if (checked) {
                    Toast.makeText(this, "Correct!! Good jop", Toast.LENGTH_SHORT).show();
                    score = score + 1;
                    break;
                }
            case R.id.checkboxQuestion4_1:
                if (checked) {
                    Toast.makeText(this, "Correct!! Good jop", Toast.LENGTH_SHORT).show();
                    score = score + 1;
                    break;
                }
            case R.id.checkboxQuestion4_2:
                if (checked) {
                    Toast.makeText(this, "Correct!! Good jop", Toast.LENGTH_SHORT).show();
                    score = score + 1;
                    break;
                }
            default:
                Toast.makeText(this, "the answer is false.. try again please", Toast.LENGTH_SHORT).show();


        }

    }

    public void RadioButton(View view) {
        boolean check = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radioQuestion1:
                if (check) {
                    Toast.makeText(this, "Correct!! Good jop", Toast.LENGTH_SHORT).show();
                    score = score + 1;
                    break;
                }
            case R.id.radioQuestion2:
                if (check) {
                    Toast.makeText(this, "Correct!! Good jop", Toast.LENGTH_SHORT).show();
                    score = score + 1;
                    break;
                }
            default:
                Toast.makeText(this, "the answer is false.. try again please", Toast.LENGTH_SHORT).show();

        }


    }

    public void EditText(View view) {

        EditText editText =  findViewById(R.id.editTextQuestion5);
        String answer = editText.getText().toString();
        String trueanswer = "6000";

        if (answer.contentEquals(trueanswer)) {
            Toast.makeText(this, "Correct!! Good jop", Toast.LENGTH_SHORT).show();
            score = score + 1;

        } else {
            Toast.makeText(this, "the answer is false.. try again please", Toast.LENGTH_SHORT).show();

        }
    }

    public void Score(View view) {
        EditText(view);
        TextView txt = findViewById(R.id.txtresult);
        String result="The result :  " + String.valueOf(score) + " ";
        txt.setText(result);

    }
}
