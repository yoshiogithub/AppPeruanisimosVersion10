package com.isil.appperuanisimosversion10.ACTIVIDAD;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.isil.appperuanisimosversion10.ENTIDAD.Historial;
import com.isil.appperuanisimosversion10.ENTIDAD.Producto;
import com.isil.appperuanisimosversion10.R;

public class MainActivity_PantallaPrincipal_Admin extends AppCompatActivity {
    EditText nombre;
    EditText descripcion;
    EditText precio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__pantalla_principal__admin);

        nombre=findViewById(R.id.newNombre);
        descripcion=findViewById(R.id.txtDescripcion);
        precio=findViewById(R.id.txtPrecio);
    }
    public void btnBuscar(View view){IrBuscar();}
    public void btnHistorial(View view){IrHistorial();}
    public void btnPerfil(View view){IrPerfil();}
    public void btnSalir(View view){SalirLugar();}

    public void btnAgregarProducto(View view){AgregarNuevoProducto();}

    private void IrBuscar() {
        Intent btnBuscar=new Intent(this,com.isil.appperuanisimosversion10.ACTIVIDAD.MainActivity_Buscador.class);
        startActivity(btnBuscar);
    }

    private void IrHistorial() {
        Intent btnHistorial=new Intent(this,com.isil.appperuanisimosversion10.ACTIVIDAD.MainActivity_Historial.class);
        startActivity(btnHistorial);
    }

    private void IrPerfil() {
        Intent btnPerfil=new Intent(this,com.isil.appperuanisimosversion10.ACTIVIDAD.MainActivity_Perfil.class);
        startActivity(btnPerfil);
    }

    private void SalirLugar() {
        Intent btnSalir=new Intent(this,com.isil.appperuanisimosversion10.ACTIVIDAD.MainActivity.class);
        startActivity(btnSalir);
    }



    private void AgregarNuevoProducto() {
        String nedan=precio.getText().toString();
        Producto newplato=new Producto(nombre.getText().toString(),descripcion.getText().toString(),nedan);

        DatabaseReference database= FirebaseDatabase.getInstance().getReference();
        database.child("PLATOS").push().setValue(newplato);
        limpiar();
        Toast.makeText(this, "SU REGISTRO SE A REALIZADO SATISFACTORIAMENTE", Toast.LENGTH_SHORT).show();
    }

    void limpiar(){
        nombre.setText("");
        descripcion.setText("");
        precio.setText("");
    }
}
