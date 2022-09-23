package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    Button pluszGomb;
    Button minuszGomb;
    TextView output;
    RelativeLayout layout;
    int szamlalo;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        pluszGomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szamlalo++;
                output.setText(String.valueOf(szamlalo));
            }
        });

        minuszGomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szamlalo--;
                output.setText(String.valueOf(szamlalo));
            }
        });

        if (szamlalo == 0)
        {
            output.setTextColor(Color.rgb(0, 0, 255));
        }
        else if (szamlalo > 0)
        {
            output.setTextColor(Color.rgb(255, 0, 0));
        }
        else
        {
            output.setTextColor(Color.rgb(0, 255, 0));
        }

    }

    private void init()
    {
        szamlalo = 0;
        layout = findViewById(R.id.layout);
        pluszGomb = findViewById(R.id.pluszGomb);
        minuszGomb = findViewById(R.id.minuszGomb);
        output = findViewById(R.id.szamolo);
    }

}

