package com.example.Clase;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    TextView nombre;
    ListView Usuarios;
    ArrayList<String> Nombres;
    Button Profesor, Estudiante, Empleado;
    String Tipo = null;
    String MsjToast = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = (TextView) findViewById(R.id.Nombre);
        Usuarios = (ListView) findViewById(R.id.Usuarios);
        Nombres = new ArrayList<String>();
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Nombres);
        Usuarios.setAdapter(Adapter);
        Profesor = (Button) findViewById(R.id.Profesor);
        Profesor.setOnClickListener(this);
        Estudiante = (Button) findViewById(R.id.Estudiante);
        Estudiante.setOnClickListener(this);
        Empleado = (Button) findViewById(R.id.Administrativo);
        Empleado.setOnClickListener(this);
    }

    public void onClick(View v) {
        CharSequence text = null;
        final int duration = 1000;
        final Context context = getApplicationContext();

        if (v.getId() == R.id.Estudiante) {
            Tipo = "student";
        }
        if (v.getId() == R.id.Administrativo) {
            Tipo = "manager";
        }
        if (v.getId() == R.id.Profesor) {
            Tipo = "teacher";
        }
    }
}