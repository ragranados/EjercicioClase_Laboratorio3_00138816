package com.example.tarealabo3;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.tarealabo3.utils.AppConstant;

public class ActividadCompartir extends AppCompatActivity {

    TextView mNombre;
    TextView mApellido;
    TextView mSexo;
    TextView mEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_compartir);

        mNombre = findViewById(R.id.nombre3);
        mApellido = findViewById(R.id.apellido3);
        mSexo = findViewById(R.id.sexo3);
        mEdad = findViewById(R.id.edad3);

        Intent mIntent = this.getIntent();

        if(mIntent != null){
            mNombre.setText(mIntent.getStringExtra(AppConstant.nameKey));
            mApellido.setText(mIntent.getStringExtra(AppConstant.lastnameKey));
            mSexo.setText(mIntent.getStringExtra(AppConstant.sexKey));
            mEdad.setText(mIntent.getStringExtra(AppConstant.ageKey));
        }
    }
}
