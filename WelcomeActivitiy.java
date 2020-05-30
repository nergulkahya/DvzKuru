package com.nergulkahya.dvizkuru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeActivitiy extends AppCompatActivity {
    public static Button KurHesapla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_activitiy);
        KurHesapla=(Button)findViewById(R.id.button);
        KurHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kurHesapla=new Intent(WelcomeActivitiy.this,MainActivity.class);
                WelcomeActivitiy.this.startActivity(kurHesapla);
            }
        });

    }
}
