package com.example.tarealabo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.tarealabo3.utils.AppConstant;

public class MainActivity extends AppCompatActivity {

    EditText mNombre;
    EditText mApellido;
    EditText mEdad;
    EditText mSexo;
    Button mEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNombre= findViewById(R.id.nombre);
        mApellido = findViewById(R.id.apellido);
        mEdad = findViewById(R.id.edad);
        mSexo = findViewById(R.id.sexo);

        mEnviar = findViewById(R.id.enviar);

        mEnviar.setOnClickListener(v -> {
            String nombre = mNombre.getText().toString();
            String apellido = mApellido.getText().toString();
            String edad = mEdad.getText().toString();
            String sexo = mSexo.getText().toString();

            Intent mIntent = new Intent(MainActivity.this,SegundaActividad.class);
            mIntent.putExtra(AppConstant.nameKey,nombre);
            mIntent.putExtra(AppConstant.lastnameKey,apellido);
            mIntent.putExtra(AppConstant.ageKey,edad);
            mIntent.putExtra(AppConstant.sexKey,sexo);

            startActivity(mIntent);
        });
    }
}
