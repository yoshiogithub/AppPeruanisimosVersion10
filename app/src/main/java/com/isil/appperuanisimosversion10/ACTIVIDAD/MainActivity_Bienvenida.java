package com.isil.appperuanisimosversion10.ACTIVIDAD;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.isil.appperuanisimosversion10.R;

public class MainActivity_Bienvenida extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__bienvenida);
    }
    public void btnPaginaPrincipal(View view){
       btnPaginaPrincipal();
    }


    private void btnPaginaPrincipal(){
        Intent siguiente=new Intent(this,com.isil.appperuanisimosversion10.ACTIVIDAD.MainActivity_PantallaPrincipal.class);
        startActivity(siguiente);
    }


}
