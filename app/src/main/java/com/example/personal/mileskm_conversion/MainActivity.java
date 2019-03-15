package com.example.personal.mileskm_conversion;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

import static com.example.personal.mileskm_conversion.R.id.editTextKm;
import static java.text.DecimalFormat.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonConvMilesToKm=(Button) findViewById(R.id.buttonConvMilesToKm);
        buttonConvMilesToKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText TextBoxMiles = (EditText) findViewById(R.id.editTextMiles);
                EditText TextBoxKm = (EditText) findViewById(editTextKm);
                Double vMiles = Double.valueOf(TextBoxMiles.getText().toString());
                Double vKm = vMiles / 0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                TextBoxKm.setText(formatVal.format(vKm));
            }


        });
        Button buttonConvKmToMiles=(Button) findViewById(R.id.buttonConvKmToMiles);
        buttonConvKmToMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText TextBoxMiles=(EditText)findViewById(R.id.editTextMiles);
                EditText TextBoxKm=(EditText)findViewById(editTextKm);
                Double vKm=Double.valueOf(TextBoxKm.getText().toString());
                Double vMiles=vKm*0.62137;
                DecimalFormat formatVal=new DecimalFormat("##.##");
                TextBoxMiles.setText(formatVal.format(vMiles));
            }




        });
    }
}