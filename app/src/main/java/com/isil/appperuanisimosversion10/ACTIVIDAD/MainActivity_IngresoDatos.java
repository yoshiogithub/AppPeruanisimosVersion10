package com.isil.appperuanisimosversion10.ACTIVIDAD;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.isil.appperuanisimosversion10.ENTIDAD.Usuario;
import com.isil.appperuanisimosversion10.R;

import java.util.HashMap;


public class MainActivity_IngresoDatos extends AppCompatActivity {
    EditText nombre,apellido,edad,usuario,clave,confirmacion;
    RadioGroup sexo;
    RadioButton hombre,mujer;
    CheckBox check;
    String sex="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__ingreso_datos);
        nombre=findViewById(R.id.txtnombre);
        apellido=findViewById(R.id.txtApellido);
        edad=findViewById(R.id.txtEdad);
        sexo=findViewById(R.id.rgSexo);
        hombre=findViewById(R.id.rbHombre);
        mujer=findViewById(R.id.rbMujer);
        usuario=findViewById(R.id.txtUsuario);
        clave=findViewById(R.id.txtClave);
        confirmacion=findViewById(R.id.txtConfir);
        check=findViewById(R.id.cbCondicion);
    }

    public void aceptar(View view){IngresoDatosUsuario();}
    public void btnSalir(View view){IrSalir();}
    private void IrSalir() {
        Intent btnSalir=new Intent(this,com.isil.appperuanisimosversion10.ACTIVIDAD.MainActivity.class);
        startActivity(btnSalir);
    }

    private void IngresoDatosUsuario(){
        DatabaseReference database= FirebaseDatabase.getInstance().getReference();
        if(nombre.getText().toString().isEmpty() || apellido.getText().toString().isEmpty() || edad.getText().toString().isEmpty() ||
                hombre.getText().toString().isEmpty() ||mujer.getText().toString().isEmpty() ||usuario.getText().toString().isEmpty() ||
                clave.getText().toString().isEmpty()||confirmacion.getText().toString().isEmpty()) {
            String msg="COMPLETE LOS CAMPOS";
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        }else if(!check.isChecked()){
            String msg="NO A ACEPTADO LOS TERMINOS";
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        }else{
            int age=Integer.parseInt(edad.getText().toString());

            switch (sexo.getCheckedRadioButtonId()){
                case R.id.rbHombre:
                    sex="Hombre";
                    break;
                case R.id.rbMujer:
                    sex="Mujer";
                    break;
            }

            Usuario persona=new Usuario(apellido.getText().toString(),sex,usuario.getText().toString(),clave.getText().toString(),confirmacion.getText().toString(),age);
            Intent siguiente = new Intent(this, com.isil.appperuanisimosversion10.ACTIVIDAD.MainActivity_Bienvenida.class);
            startActivity(siguiente);

            Toast.makeText(this, "DATOS INGRESADOS CORRECTAMENTE", Toast.LENGTH_SHORT).show();

            database.child(References.persona_references).child(nombre.getText().toString()).push().setValue(persona);


        }
    }
}
