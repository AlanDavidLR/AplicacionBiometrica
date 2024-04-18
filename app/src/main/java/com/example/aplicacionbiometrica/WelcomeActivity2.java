package com.example.aplicacionbiometrica;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import android.content.DialogInterface;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import java.util.ArrayList;


public class WelcomeActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome2);

        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);

        DialogInterface.OnClickListener aceptarClickListener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(WelcomeActivity2.this, "Bienvenido.", Toast.LENGTH_SHORT).show();
            }
        };

        DialogInterface.OnClickListener cancelarClickListener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        };

        dialogBuilder.setTitle("Ingresó");
        dialogBuilder.setMessage("¡Bienvenido!");
        dialogBuilder.setCancelable(false);
        dialogBuilder.setPositiveButton("Aceptar", aceptarClickListener);
        dialogBuilder.setNegativeButton("Cancelar", cancelarClickListener);

        AlertDialog dialogo1 = dialogBuilder.create();
        dialogo1.show();


        RecyclerView recyclerView = findViewById(R.id.newsRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Simulación de noticias (debes obtener datos reales de una fuente)
        List<String> noticias = new ArrayList<>();
        noticias.add("Noticia 1");
        noticias.add("Noticia 2");
        noticias.add("Noticia 3");

        // Crea un adaptador para el RecyclerView y asigna las noticias
        NewsAdapter adapter = new NewsAdapter(noticias);
        recyclerView.setAdapter(adapter);


    }

}
