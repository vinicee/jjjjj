package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private  TextView textCount;
    private Button button;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textCount = findViewById(R.id.textCount);
        button = findViewById(R.id.button);


        button.setOnApplyWindowInsetsListener(new Viem.OnClickListener() {
            @Override
            public void onClick(Viem viem) {
                count++;
                textCount.setText(Integer.toString(count));

            }

        });

        Toast.makeText(this, "Активность создана", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStart(){
        super.onStart();

        Toast toast = Toast.makeText(getApplicationContext(), "Старт активности", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.RIGHT, 0, 0);
        toast.show();
    }


    @Override
    protected void onResume() {
        super.onResume();
    }


    @Override
    protected void onPause() {
        super.onPause();

        Toast toast = Toast.makeText(getApplicationContext(), "Пауза активности", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.LEFT, 0, 0);
        toast.show();
    }


    @Override
    protected void onStop() {
        super.onStop();

        Toast toast = Toast.makeText(getApplicationContext(), "Активность скрыта", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP, 0, 0);
        toast.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast toast = Toast.makeText(getApplicationContext(), "Активность уничтожена", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM, 0, 0);
        toast.show();
    }



}