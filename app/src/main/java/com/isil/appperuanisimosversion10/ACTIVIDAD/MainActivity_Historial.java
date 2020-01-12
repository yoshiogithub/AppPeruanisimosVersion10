package com.isil.appperuanisimosversion10.ACTIVIDAD;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.isil.appperuanisimosversion10.R;

public class MainActivity_Historial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__historial);
    }
    public void btnMenu(View view){IrMenu();}
    public void btnSalir(View view){SalirLugar();}
    public void btnBuscador(View view){IrBuscador();}
    public void btnPerfil(View view){IrPerfil();}

    private void IrMenu() {
        Intent btnMenu=new Intent(this,com.isil.appperuanisimosversion10.ACTIVIDAD.MainActivity_PantallaPrincipal.class);
        startActivity(btnMenu);
    }
    private void IrBuscador() {
        Intent btnHistorial=new Intent(this,com.isil.appperuanisimosversion10.ACTIVIDAD.MainActivity_Buscador.class);
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
}
