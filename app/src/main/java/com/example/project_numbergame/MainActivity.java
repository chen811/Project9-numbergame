package com.example.project_numbergame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int num;
    int random;
    int dog;
    int f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        random = (int)(Math.random()*9)+1;
        Intent intent1 = this.getIntent();
        dog = intent1.getIntExtra("random2", 0);
        f = intent1.getIntExtra("f", 0);
        if (dog != 0){
            //f = 0;
            random = dog;
        }
        TextView message1 = (TextView)findViewById(R.id.textView);
        message1.setText("遊戲開始");
    }

    public void runLogin(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        //intent.putExtra("number",1);
        num = 1;
        intent.putExtra("number", num);
        intent.putExtra("random", random);
        intent.putExtra("f", f);
        startActivity(intent);
    }

    public void runLogin2(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        //intent.putExtra("number",1);
        num = 2;
        intent.putExtra("number", num);
        intent.putExtra("random", random);
        intent.putExtra("f", f);
        startActivity(intent);
    }

    public void runLogin3(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        //intent.putExtra("number",1);
        num = 3;
        intent.putExtra("number", num);
        intent.putExtra("random", random);
        intent.putExtra("f", f);
        startActivity(intent);
    }

    public void runLogin4(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        //intent.putExtra("number",1);
        num = 4;
        intent.putExtra("number", num);
        intent.putExtra("random", random);
        intent.putExtra("f", f);
        startActivity(intent);
    }

    public void runLogin5(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        //intent.putExtra("number",1);
        num = 5;
        intent.putExtra("number", num);
        intent.putExtra("random", random);
        intent.putExtra("f", f);
        startActivity(intent);
    }

    public void runLogin6(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        //intent.putExtra("number",1);
        num = 6;
        intent.putExtra("number", num);
        intent.putExtra("random", random);
        intent.putExtra("f", f);
        startActivity(intent);
    }

    public void runLogin7(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        //intent.putExtra("number",1);
        num = 7;
        intent.putExtra("number", num);
        intent.putExtra("random", random);
        intent.putExtra("f", f);
        startActivity(intent);
    }

    public void runLogin8(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        //intent.putExtra("number",1);
        num = 8;
        intent.putExtra("number", num);
        intent.putExtra("random", random);
        intent.putExtra("f", f);
        startActivity(intent);
    }

    public void runLogin9(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        //intent.putExtra("number",1);
        num = 9;
        intent.putExtra("number", num);
        intent.putExtra("random", random);
        intent.putExtra("f", f);
        startActivity(intent);
    }

    public void runLoginre(View view) {
        TextView message1 = (TextView)findViewById(R.id.textView);
        message1.setText("重新開始");
        random = (int)(Math.random()*9)+1;
        f = 0;
    }
}