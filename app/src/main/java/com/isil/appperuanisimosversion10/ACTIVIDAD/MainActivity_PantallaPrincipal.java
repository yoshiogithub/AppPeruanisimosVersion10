package com.isil.appperuanisimosversion10.ACTIVIDAD;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.isil.appperuanisimosversion10.R;

public class MainActivity_PantallaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__pantalla_principal);

    }
    public void btnBuscar(View view){IrBuscar();}
    public void btnHistorial(View view){IrHistorial();}
    public void btnPerfil(View view){IrPerfil();}
    public void btnSalir(View view){SalirLugar();}
    public void btnCebiche(View view){IrCebiche();}

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

    private void IrCebiche() {
        Intent btnPlato1=new Intent(this,com.isil.appperuanisimosversion10.ACTIVIDAD.MainActivity_Plato_Cebiche.class);
        startActivity(btnPlato1);
    }


}
