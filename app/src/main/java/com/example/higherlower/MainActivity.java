package com.example.higherlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int n;
    int max=40;
    int min=20;

    public void game (View view)
    {


        EditText value1=(EditText) findViewById(R.id.editTextTextPersonName);
        int value=Integer.parseInt(value1.getText().toString());
        if(n>value)
        {
            Toast.makeText(this,"Go for a higher value 😋",Toast.LENGTH_LONG).show();
        }
        else if(n<value)
        {
            Toast.makeText(this,"Go for a lower value 😋",Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this,"Amazing, Lets Play Again 😉",Toast.LENGTH_LONG).show();
            Random rand=new Random();
            n= rand.nextInt((max-min)+1)+min;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand=new Random();
        n= rand.nextInt((max-min)+1)+min;

    }
}