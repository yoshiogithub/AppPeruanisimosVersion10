package com.isil.appperuanisimosversion10.ACTIVIDAD;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.isil.appperuanisimosversion10.R;

public class MainActivity_Buscador extends AppCompatActivity {

    Spinner opciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__buscador);

        opciones=findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.opciones,android.R.layout.simple_spinner_item);
        opciones.setAdapter(adapter);
        opciones.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(parent.getContext(),
                        "Seleccionado :  "+parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void btnAgregar(View view) {AgregarItem();}
    public void btnMenu(View view){IrMenu();}
    public void btnHistorial(View view){IrHistorial();}
    public void btnPerfil(View view){IrPerfil();}
    public void btnSalir(View view){SalirDelLugar();}


    private void SalirDelLugar() {
        Intent btnSalir=new Intent(this,com.isil.appperuanisimosversion10.ACTIVIDAD.MainActivity.class);
        startActivity(btnSalir);
    }
    private void AgregarItem() {
        Intent btnAgregar = new Intent(this, com.isil.appperuanisimosversion10.ACTIVIDAD.MainActivity_Pedido.class);
        startActivity(btnAgregar);
    }
    private void IrMenu() {
        Intent btnMenu=new Intent(this,com.isil.appperuanisimosversion10.ACTIVIDAD.MainActivity_PantallaPrincipal.class);
        startActivity(btnMenu);
    }
    private void IrHistorial() {
        Intent btnHistorial=new Intent(this,com.isil.appperuanisimosversion10.ACTIVIDAD.MainActivity_Historial.class);
        startActivity(btnHistorial);
    }
    private void IrPerfil() {
        Intent btnPerfil=new Intent(this,com.isil.appperuanisimosversion10.ACTIVIDAD.MainActivity_Perfil.class);
        startActivity(btnPerfil);
    }

}
