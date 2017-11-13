package com.example.vinicius.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText caixa = null;
    TextView mostraCaixa = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixa = findViewById(R.id.caixa);
        mostraCaixa = findViewById(R.id.exibeCaixa);
    }

    public void mostrar(View v){
        mostraCaixa.setText(caixa.getText().toString());
    }
}
