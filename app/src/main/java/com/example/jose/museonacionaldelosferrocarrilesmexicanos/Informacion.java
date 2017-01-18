package com.example.jose.museonacionaldelosferrocarrilesmexicanos;

import android.app.ExpandableListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Informacion extends AppCompatActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.ELV);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Ubicacion y Contacto");
        listDataHeader.add("Horarios");
        listDataHeader.add("Tarifas");
        listDataHeader.add("Servicios");
        listDataHeader.add("Como llegar");
        listDataHeader.add("Creditos");
        listDataHeader.add("Comentarios y Sugerencias");

        // Adding child data
        List<String> direccion = new ArrayList<String>();
        direccion.add("Direccion\n******\n\nTelefono\n*******\n\nPagina Web\nmuseoferrocarrilesmexicanos.gob.mx\n");


        List<String> horarios = new ArrayList<String>();
        horarios.add("Informacion de Horarios\nDias y Horas de apertura y cierre del museo\n");


        List<String> tarifa = new ArrayList<String>();
        tarifa.add("Costos de entrada general e informacion de descuentos ");

        List<String> Servicios = new ArrayList<String>();
        Servicios.add("Informacion de diferentes servicios que ofrece el museo\n" +
                "como silla de ruedas, libreria, biblioteca, bebeteca, etc.");

        List<String> llegar = new ArrayList<String>();
        llegar.add("Boton de mostrar ruta con gps y transporte publico ");

        List<String> creditos = new ArrayList<String>();
        creditos.add(" Informacion del desarrollador\n" +
                "Institucion\n" +
                "Personas que colaboraron");
        List<String> comentarios = new ArrayList<String>();
        comentarios.add("Area de texto para que el usuario mande un comentario o sugerencia al museo");

        listDataChild.put(listDataHeader.get(0), direccion); // Header, Child data
        listDataChild.put(listDataHeader.get(1), horarios);
        listDataChild.put(listDataHeader.get(2), tarifa);
        listDataChild.put(listDataHeader.get(3), Servicios);
        listDataChild.put(listDataHeader.get(4), llegar);
        listDataChild.put(listDataHeader.get(5), creditos);
        listDataChild.put(listDataHeader.get(6), comentarios);
    }


    public void regresar(View v){
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
        finish();
    }
}