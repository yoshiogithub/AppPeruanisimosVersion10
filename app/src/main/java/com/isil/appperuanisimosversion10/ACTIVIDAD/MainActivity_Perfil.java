package com.isil.appperuanisimosversion10.ACTIVIDAD;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.isil.appperuanisimosversion10.R;

public class MainActivity_Perfil extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__perfil);
    }
    public void btnMenu(View view){
        Intent btnMenu=new Intent(this,com.isil.appperuanisimosversion10.ACTIVIDAD.MainActivity_PantallaPrincipal.class);
        startActivity(btnMenu);
    }
    public void btnHistorial(View view){
        Intent btnHistorial=new Intent(this,com.isil.appperuanisimosversion10.ACTIVIDAD.MainActivity_Historial.class);
        startActivity(btnHistorial);
    }
    public void btnBuscador(View view){
        Intent btnPerfil=new Intent(this,com.isil.appperuanisimosversion10.ACTIVIDAD.MainActivity_Buscador.class);
        startActivity(btnPerfil);
    }
    public void btnSalir(View view){
        Intent btnSalir=new Intent(this,com.isil.appperuanisimosversion10.ACTIVIDAD.MainActivity.class);
        startActivity(btnSalir);
    }
}
