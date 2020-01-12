package com.isil.appperuanisimosversion10.ACTIVIDAD;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.isil.appperuanisimosversion10.ENTIDAD.Administrador;
import com.isil.appperuanisimosversion10.R;
public class MainActivity extends AppCompatActivity {
    EditText usuario, clave;
    CheckBox check;
    String client="juan";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = findViewById(R.id.txtusuario);
        clave = findViewById(R.id.txtclave);
        check=findViewById(R.id.cbUsuario);
    }


    public void btnBienvenido(View view) {
        Administrador admin = new Administrador(usuario.getText().toString(), clave.getText().toString());

        if (check.isChecked()) {
            Intent btnIngresoDatos = new Intent(this, com.isil.appperuanisimosversion10.ACTIVIDAD.MainActivity_IngresoDatos.class);
            startActivity(btnIngresoDatos);
        } else if (usuario.getText().toString().isEmpty() || clave.getText().toString().isEmpty())
            Toast.makeText(this, "COMPLETE LOS ESPACIOS", Toast.LENGTH_SHORT).show();
        else if (!usuario.getText().toString().equals(admin.NOMBRE()))
            Toast.makeText(this, "NOMBRE DE USUARIO NO EXISTE", Toast.LENGTH_SHORT).show();
        else if (!clave.getText().toString().equals(admin.PASS()))
            Toast.makeText(this, "CLAVE INCORRECTA", Toast.LENGTH_SHORT).show();
        else if (usuario.getText().toString().equals(admin.NOMBRE()) && clave.getText().toString().equals(admin.PASS())) {
            btnBienvenida();
        }


    }


        private void btnBienvenida(){
                Intent siguiente = new Intent(this, com.isil.appperuanisimosversion10.ACTIVIDAD.MainActivity_Bienvenida.class);
                startActivity(siguiente);
            }
        }







