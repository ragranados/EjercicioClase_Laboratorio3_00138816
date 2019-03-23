package com.example.tarealabo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.tarealabo3.utils.AppConstant;

public class SegundaActividad extends AppCompatActivity {

    TextView mNombre;
    TextView mApellido;
    TextView mSexo;
    TextView mEdad;

    Button mCompartir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);

        mNombre = findViewById(R.id.nombre2);
        mApellido = findViewById(R.id.apellido2);
        mSexo = findViewById(R.id.sexo2);
        mEdad = findViewById(R.id.edad2);

        mCompartir = findViewById(R.id.boton_compartir);

        Intent mIntent = this.getIntent();

        if(mIntent != null){
            mNombre.setText(mIntent.getStringExtra(AppConstant.nameKey));
            mApellido.setText(mIntent.getStringExtra(AppConstant.lastnameKey));
            mSexo.setText(mIntent.getStringExtra(AppConstant.sexKey));
            mEdad.setText(mIntent.getStringExtra(AppConstant.ageKey));
        }

        mCompartir.setOnClickListener(v -> {

            String nombre = mNombre.getText().toString();
            String apellido = mApellido.getText().toString();
            String edad = mEdad.getText().toString();
            String sexo = mSexo.getText().toString();

            Intent mIntentShare = new Intent();
            mIntentShare.setType("text/plain");
            mIntentShare.setAction(Intent.ACTION_SEND);

            mIntentShare.putExtra(AppConstant.nameKey,nombre);
            mIntentShare.putExtra(AppConstant.lastnameKey,apellido);
            mIntentShare.putExtra(AppConstant.ageKey,edad);
            mIntentShare.putExtra(AppConstant.sexKey,sexo);
            startActivity(mIntentShare);
        });
    }
}
