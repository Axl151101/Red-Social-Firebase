package com.example.redsocialfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Perfil extends AppCompatActivity {

    private ArrayList<Personas> listapersonas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listapersonas=new ArrayList<Personas>();
        listapersonas.add(new Personas("Juan", 'm'));
        listapersonas.add(new Personas("pedro",'m'));
        listapersonas.add(new Personas("luis",'m'));
        listapersonas.add(new Personas("ana",'f'));
        listapersonas.add(new Personas("carla",'f'));
        listapersonas.add(new Personas("maria",'f'));
        listapersonas.add(new Personas("gustavo",'m'));
        listapersonas.add(new Personas("carlos",'m'));
        listapersonas.add(new Personas("marta",'f'));
        listapersonas.add(new Personas("luisa",'f'));
        listapersonas.add(new Personas("fernanda",'f'));
        listapersonas.add(new Personas("jose",'m'));
        listapersonas.add(new Personas("paola",'f'));
        listapersonas.add(new Personas("lucrecia",'f'));
        listapersonas.add(new Personas("oscar",'m'));

        AdaptadorPersonas adaptador = new AdaptadorPersonas(this);
        ListView lv1 = findViewById(R.id.list1);
        lv1.setAdapter(adaptador);


    }

    class AdaptadorPersonas extends ArrayAdapter<Personas> {

        AppCompatActivity appCompatActivity;

        AdaptadorPersonas(AppCompatActivity context) {
            super(context, R.layout.activity_personas, listapersonas);
            appCompatActivity = context;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = appCompatActivity.getLayoutInflater();
            View item = inflater.inflate(R.layout.activity_personas,null);

            TextView textView1 = item.findViewById(R.id.textView);
            textView1.setText(listapersonas.get(position).getNombre());

            ImageView imageView1 = item.findViewById(R.id.imageView);
            if (listapersonas.get(position).getGenero()=='m')
                imageView1.setImageResource(R.drawable.hombre);
            else
                imageView1.setImageResource(R.drawable.mujer);
            return(item);
        }
    }
}