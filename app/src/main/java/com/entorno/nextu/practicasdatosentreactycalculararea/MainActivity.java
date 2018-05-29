package com.entorno.nextu.practicasdatosentreactycalculararea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText ialtura, ibase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ialtura = (EditText) findViewById(R.id.ialtura);
        ibase = (EditText) findViewById(R.id.ibase);

    }
    public void siguiente (View view){
        Intent intent = new Intent(this, botones_de_calculo.class);
        if (ialtura.getText().toString().equals("")||ibase.getText().toString().equals("")){
        intent.putExtra("ialtura", 0);
            intent.putExtra("ibase",0 );

        }else{
            intent.putExtra("ialtura", Double.parseDouble(ialtura.getText().toString()));
            intent.putExtra("ibase", Double.parseDouble(ibase.getText().toString()));


        }

        startActivity(intent);

    }

}
