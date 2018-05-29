package com.entorno.nextu.practicasdatosentreactycalculararea;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class botones_de_calculo extends AppCompatActivity {

    private TextView result_rect, result_tri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botones_de_calculo);

        result_rect = (TextView)findViewById(R.id.result_rect);
        result_tri = (TextView)findViewById(R.id.result_tri);

    }
    public void calcular (View view) {

        double ialtura = getIntent().getDoubleExtra("ialtura", 0);
        double ibase = getIntent().getDoubleExtra("ibase", 0);
        result_rect.setText("area=" + (ialtura * ibase));
    }

    public void calculat (View view) {

        double ialtura = getIntent().getDoubleExtra("ialtura", 0);
        double ibase = getIntent().getDoubleExtra("ibase", 0);
        result_rect.setText("area=" + (ialtura * ibase)/2);


    }
}
