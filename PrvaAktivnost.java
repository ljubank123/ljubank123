package com.example.vtsnis.datastorage_write__read_text_file_from_all_storage_options;

import static android.support.v4.content.ContextCompat.startActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;


public class PrvaAktivnost extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aktivnost_prva);
    }

  


    public void idinaprojekat (View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

}