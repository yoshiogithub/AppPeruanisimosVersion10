package com.isil.appperuanisimosversion10.ACTIVIDAD;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.isil.appperuanisimosversion10.ENTIDAD.Producto;
import com.isil.appperuanisimosversion10.R;

import java.text.DecimalFormat;

public class MainActivity_Plato_Cebiche extends AppCompatActivity {
    TextView descripcion,total;
    DecimalFormat df=new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__plato__cebiche);

        descripcion=findViewById(R.id.txtDescripcion);
        total=findViewById(R.id.txtTotal);

        Producto plato=new Producto("cebiche","mariscos, pescados y otras especies","20");
        Producto plato1=new Producto("2","20");
        descripcion.setText(plato.MostrarInfo());
        total.setText(df.format(plato1.MostrarTotal()));
    }

    public void btnSalir(View view){IrSalir();}
    public void btnMenu(View view){IrMenu();}
    public void btnAgregar(View view){

        AgregarNuevoPedido();}

    private void IrSalir() {
        Intent btnSalir=new Intent(this,com.isil.appperuanisimosversion10.ACTIVIDAD.MainActivity.class);
        startActivity(btnSalir);
    }
    private void IrMenu() {
        Intent btnMenu=new Intent(this,com.isil.appperuanisimosversion10.ACTIVIDAD.MainActivity_PantallaPrincipal.class);
        startActivity(btnMenu);
    }
    private void AgregarNuevoPedido() {

        Intent btnAgregar=new Intent(this,com.isil.appperuanisimosversion10.ACTIVIDAD.MainActivity_Pedido.class);
        startActivity(btnAgregar);
    }
}
