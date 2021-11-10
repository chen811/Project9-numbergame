package com.example.project_numbergame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    int randomB;
    int f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView message = (TextView)findViewById(R.id.textView2);
        Intent intent = this.getIntent();
        int number = intent.getIntExtra("number", 0);
        int random = intent.getIntExtra("random", 0);
        f = intent.getIntExtra("f", 0) + 1;

        //String ans = intent.getStringExtra("ans");
        if (number > random){
            message.setText("太大");
        }
        else {
            if (number < random){
                message.setText("太小");
            }
            else {
                f--;
                message.setText("恭喜答對"+ "    " +"答錯次數"+ f);
                random = 0;
                f = 0;
            }
        }

        randomB = random;
    }

    public void runLoginre(View view) {
        Intent intent1 = new Intent(this, MainActivity.class);
        intent1.putExtra("random2", randomB);
        intent1.putExtra("f", f);
        startActivity(intent1);

    }
}