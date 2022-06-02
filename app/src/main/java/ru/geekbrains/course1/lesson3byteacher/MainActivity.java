package ru.geekbrains.course1.lesson3byteacher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String instanceState;
        if (savedInstanceState == null){
            instanceState = "Первый запуск";
        }
        else {
            instanceState = "Повторный запуск";
        }
        Toast.makeText(getApplicationContext(), instanceState + " - on Create", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStart(){
        super.onStart();
    }
}