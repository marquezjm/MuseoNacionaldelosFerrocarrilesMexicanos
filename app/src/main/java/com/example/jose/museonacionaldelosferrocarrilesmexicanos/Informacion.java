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

        // Adding child data
        List<String> top250 = new ArrayList<String>();
        top250.add("Direccion\n******\n\nTelefono\n*******\n\nPagina Web\nmuseoferrocarrilesmexicanos.gob.mx\n");


        List<String> nowShowing = new ArrayList<String>();
        nowShowing.add("Informacion de Horarios\nDias y Horas de apertura y cierre del museo\n");


        List<String> comingSoon = new ArrayList<String>();
        comingSoon.add(" ");

        List<String> Servicios = new ArrayList<String>();
        comingSoon.add(" ");

        List<String> llegar = new ArrayList<String>();
        comingSoon.add(" ");

        List<String> creditos = new ArrayList<String>();
        comingSoon.add(" ");

        listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
        listDataChild.put(listDataHeader.get(1), nowShowing);
        listDataChild.put(listDataHeader.get(2), comingSoon);
        listDataChild.put(listDataHeader.get(3), Servicios);
        listDataChild.put(listDataHeader.get(4), llegar);
        listDataChild.put(listDataHeader.get(5), creditos);
    }


    public void regresar(View v){
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
        finish();
    }
}