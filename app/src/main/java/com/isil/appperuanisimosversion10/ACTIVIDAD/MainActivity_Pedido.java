package com.isil.appperuanisimosversion10.ACTIVIDAD;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.isil.appperuanisimosversion10.ENTIDAD.Historial;
import com.isil.appperuanisimosversion10.ENTIDAD.Usuario;
import com.isil.appperuanisimosversion10.R;

public class MainActivity_Pedido extends AppCompatActivity {
    TextView Total,Lista;
    String resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__pedido);

        Total=findViewById(R.id.txtTotal);
        Lista=findViewById(R.id.txtLista);
//        Bundle bundle=this.getIntent().getExtras();
//        resultado= String.valueOf(bundle.get("informacion"));

        Lista.setText(resultado);

    }

    public void btnMenu(View view){IrMenu();}
    public void btnSaldarCuenta(View view){SaldarCuenta();}

    private void IrMenu() {
        Intent btnAgregar=new Intent(this,com.isil.appperuanisimosversion10.ACTIVIDAD.MainActivity_PantallaPrincipal.class);
        startActivity(btnAgregar);
    }

    private void SaldarCuenta() {
        DatabaseReference database= FirebaseDatabase.getInstance().getReference();
        Historial plato=new Historial("maria","papa a la huancaina");
        database.child("HISTORIAL").push().setValue(plato);
        Toast.makeText(this, "SU REGISTRO SE A REALIZADO SATISFACTORIAMENTE", Toast.LENGTH_SHORT).show();
    }
}
