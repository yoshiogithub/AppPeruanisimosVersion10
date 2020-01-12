package com.isil.appperuanisimosversion10.ACTIVIDAD;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.isil.appperuanisimosversion10.ENTIDAD.Historial;
import com.isil.appperuanisimosversion10.ENTIDAD.Usuario;
import com.isil.appperuanisimosversion10.R;

import java.lang.ref.Reference;

import static com.isil.appperuanisimosversion10.ACTIVIDAD.References.historial_references;
import static com.isil.appperuanisimosversion10.ACTIVIDAD.References.persona_references;

public class Main2Activity_Prueba extends AppCompatActivity {
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2__prueba);
        txt=findViewById(R.id.txtP);



    }
    public void ingresar(View view){
        DatabaseReference database= FirebaseDatabase.getInstance().getReference();
        database.child("CLIENTES").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()){
                    String cliente=dataSnapshot.child("yoshio").getValue().toString();
                    txt.setText(cliente);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
