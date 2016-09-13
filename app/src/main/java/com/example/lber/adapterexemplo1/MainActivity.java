package com.example.lber.adapterexemplo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    private static final String[] FRUTAS = new String[]{"Banana", "Maça",
            "Pera", "Abacaxi", "Tomate", "Uva", "Melão", "Goiaba", "Caja", "Caju",
            "Manga"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Associa o objeto frutas ao elemento do textview autocompleteTextView
        AutoCompleteTextView frutas = (AutoCompleteTextView) findViewById(R.id.completeFrutas);
        //cria um adaptor passando o contexto, um layout de lista simples e o array com os elementos que irão aparecer nessa lista
        ArrayAdapter<String> adaptor = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, FRUTAS);
        //seta o adaptor contendo a lista e seus elementos ao autocompletetextview
        frutas.setAdapter(adaptor);
    }
}
