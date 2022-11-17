package com.example.maket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Register extends AppCompatActivity {
    ImageView imageCheked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        imageCheked = findViewById(R.id.cbRememberPassword);
    }

    public void Checked(View v)
    {
        if(imageCheked.getDrawable().getConstantState() == getResources().getDrawable( R.drawable.check_box_not_active).getConstantState())
        {
            imageCheked.setImageResource(R.drawable.check_box_active);
        }
        else
        {
            imageCheked.setImageResource(R.drawable.check_box_not_active);
        }

    }

    public void nextRegistrarion(View v)
    {
        startActivity(new Intent(this, Congrats.class));
    }

    public void nextAuthorization(View v)
    {
        startActivity(new Intent(this, LogIn.class));
    }
}