package com.example.maket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LogIn extends AppCompatActivity {
    ImageView image, imageCheked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

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

    public void Next(View v)
    {
        startActivity(new Intent(this, Register.class));
    }
}