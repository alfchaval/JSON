package com.example.usuario.json.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.usuario.json.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1, btn2, btn3, btn4, btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn2 = (Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        btn3 = (Button)findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        btn4 = (Button)findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
        btn5 = (Button)findViewById(R.id.btn5);
        btn5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.btn1:
                intent = new Intent(this, Primitiva.class);
                break;
            case R.id.btn2:
                intent = new Intent(this, ListaContactos.class);
                break;
            case R.id.btn3:
                intent = new Intent(this, ListaContactosJSON.class);
                break;
            case R.id.btn4:
                intent = new Intent(this, CreacionJSON.class);
                break;
            case R.id.btn5:
                intent = new Intent(this, Repositorios.class);
                break;
            default:
                break;
        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}