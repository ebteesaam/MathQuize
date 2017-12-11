package com.example.android.mathquize;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void CheckBox(View view){

        boolean checked = ((CheckBox) view).isChecked();


        if(view.getId()==R.id.redio2 ) {
            Toast.makeText(this, "Correct!! Good jop", Toast.LENGTH_SHORT).show();
            score=score+ 1;
        } else if(view.getId()==R.id.radio3){
            Toast.makeText(this, "Correct!! Good jop", Toast.LENGTH_SHORT).show();
            score = score + 1;

        }else if(view.getId()==R.id.radio4) {
            Toast.makeText(this, "Correct!! Good jop", Toast.LENGTH_SHORT).show();
            score = score + 1;
        }else if(view.getId()==R.id.radio5){
            Toast.makeText(this, "Correct!! Good jop", Toast.LENGTH_SHORT).show();
            score = score + 1;
        }else if(view.getId()==R.id.radio6){
            Toast.makeText(this, "Correct!! Good jop", Toast.LENGTH_SHORT).show();
            score=score+ 1;

        } else if(view.getId()==R.id.radio7) {
            Toast.makeText(this, "Correct!! Good jop", Toast.LENGTH_SHORT).show();
            score = score + 1;
        }else if(view.getId()==R.id.radio8) {
            Toast.makeText(this, "Correct!! Good jop", Toast.LENGTH_SHORT).show();
            score = score + 1;
        }
        if(view.getId()==R.id.radio9) {
            Toast.makeText(this, "Correct!! Good jop", Toast.LENGTH_SHORT).show();
            score = score + 1;
        }else {
            Toast.makeText(this, "the answer is false.. try again please", Toast.LENGTH_SHORT).show();



        }
    }

    public void RadioButton(View view){
        boolean check = ((RadioButton) view).isChecked();

        if(view.getId()==R.id.radio1){
            Toast.makeText(this, "Correct!! Good jop", Toast.LENGTH_SHORT).show();
            score=score+ 1;

        }else{
            Toast.makeText(this, "the answer is false.. try again please", Toast.LENGTH_SHORT).show();

        }

    }

    public void EditText(View view){

        EditText editText = (EditText)findViewById(R.id.editText);

        if(editText.getText().equals(6000)==false){
            Toast.makeText(this, "Correct!! Good jop", Toast.LENGTH_SHORT).show();
            score=score+ 1;

        }else {
            Toast.makeText(this, "the answer is false.. try again please", Toast.LENGTH_SHORT).show();

        }
    }

    public void Score(View view){
        TextView txt=findViewById(R.id.txt);
        txt.setText("The result :"+String.valueOf(score) + " ");

    }
}
