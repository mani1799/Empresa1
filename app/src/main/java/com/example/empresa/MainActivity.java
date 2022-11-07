package com.example.empresa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ocultar la barra de menu por defecto
        getSupportActionBar().hide();
        //libreria para el manjeo de vistas (fragment)
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().replace(R.id.Escenario,new SesionFragment()).commit();
    }
}