package com.example.ban.payforless;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void random (View view){
        Intent randomIntent = new Intent(MainActivity.this, Random.class);
        startActivity(randomIntent);
    }
    public void foods (View view){
        Intent foodsIntent = new Intent(MainActivity.this, Foods.class);
        startActivity(foodsIntent);
    }
    public void fitness (View view){
        Intent fitnessIntent = new Intent(MainActivity.this, Fitness.class);
        startActivity(fitnessIntent);
    }

}
