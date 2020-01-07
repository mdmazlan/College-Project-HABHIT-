package com.www.habhit.edu.bd;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class TechnologySomuhActivity extends AppCompatActivity
{
    Button btnCivilTechnology;
    Button btnElectricalTechonlogy;
    Button btnElectrinicsTechnology;
    Button BtnCmtTechnology;
    Button Btntelicom;
    Button btnTextileTechonlogy;
    Button btngerments;
    Button btnPathlogy;
    Button btndental;
    Button bm;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technology_somuh);

        btnCivilTechnology= (Button) findViewById(R.id.btn_civil);
        btnElectricalTechonlogy= (Button) findViewById(R.id.btn_electrical_technology);
        btnElectrinicsTechnology= (Button) findViewById(R.id.btn_electronics_technology);
        BtnCmtTechnology= (Button) findViewById(R.id.btn_cmt);
        Btntelicom= (Button) findViewById(R.id.btn_telecommunication_technology);
        btnTextileTechonlogy= (Button) findViewById(R.id.btn_textile);
        btngerments= (Button) findViewById(R.id.btn_germents);
        btnPathlogy= (Button) findViewById(R.id.btn_Pathlogy);
        btndental= (Button) findViewById(R.id.btn_dental);
        bm= (Button) findViewById(R.id.btn_bmcourse);

        btnCivilTechnology.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //btnTest.setText("CmtTecActivity");
                    Intent startactivity = new Intent(getApplicationContext(), CivilTecActivity.class);
                    startActivity(startactivity);
            }
        });

        btnElectricalTechonlogy.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //btnTest.setText("CmtTecActivity");Chenge Activity Like : Computer Technology
                Intent startactivity = new Intent(getApplicationContext(), ElectricalTecActivity.class);
                startActivity(startactivity);
            }
        });


        btnElectrinicsTechnology.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //btnTest.setText("CmtTecActivity");Chenge Activity Like : Computer Technology
                Intent TelicomTecActivity = new Intent(getApplicationContext(), ElectrinicsTecActivity.class);
                startActivity(TelicomTecActivity);
            }
        });
        BtnCmtTechnology.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //btnTest.setText("CmtTecActivity");Chenge Activity Like : Computer Technology
                Intent TelicomTecActivity = new Intent(getApplicationContext(), CmtTecActivity.class);
                startActivity(TelicomTecActivity);
            }
        });
        Btntelicom.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //btnTest.setText("CmtTecActivity");Chenge Activity Like : Computer Technology
                Intent TelicomTecActivity = new Intent(getApplicationContext(), TelicomTecActivity.class);
                startActivity(TelicomTecActivity);
            }
        });
        btnTextileTechonlogy.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //btnTest.setText("CmtTecActivity");Chenge Activity Like : Computer Technology
                Intent TelicomTecActivity = new Intent(getApplicationContext(), TextileTecActivity.class);
                startActivity(TelicomTecActivity);
            }
        });
        btngerments.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //btnTest.setText("CmtTecActivity");Chenge Activity Like : Computer Technology
                Intent TelicomTecActivity = new Intent(getApplicationContext(), GermentsTecActivity.class);
                startActivity(TelicomTecActivity);
            }
        });
        btnPathlogy.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //btnTest.setText("CmtTecActivity");Chenge Activity Like : Computer Technology
                Intent TelicomTecActivity = new Intent(getApplicationContext(), PathlogyTecActivity.class);
                startActivity(TelicomTecActivity);
            }
        });

        btndental.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v)
        {
            //btnTest.setText("CmtTecActivity");Chenge Activity Like : Computer Technology
            Intent TelicomTecActivity = new Intent(getApplicationContext(), DentalTecActivity.class);
            startActivity(TelicomTecActivity);
        }
        });
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //btnTest.setText("CmtTecActivity");Chenge Activity Like : Computer Technology
                Intent TelicomTecActivity = new Intent(getApplicationContext(), BMCourseActivity.class);
                startActivity(TelicomTecActivity);
            }
        });


    }
}