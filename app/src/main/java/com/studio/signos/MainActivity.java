package com.studio.signos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();
    private String [] signos = {
            "Áries", "Touro", "Gemeos", "Cancer", "Leão", "Virgem", "Libra",
            "Escorpião", "Sagitário", "Capricórnio", "Aquário", "Peixes"
    };

    private String [] perfis = {
            "Áries", "Touro", "Gemeos", "Cancer", "Leão", "Virgem", "Libra",
            "Escorpião", "Sagitário", "Capricórnio", "Aquário", "Peixes"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.listViewSignos = findViewById(R.id.listViewId);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signos
        );

        this.mViewHolder.listViewSignos.setAdapter(adaptador);

        this.mViewHolder.listViewSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int codigoPosicao = position;
                Toast.makeText(getApplicationContext(),perfis[codigoPosicao], Toast.LENGTH_LONG).show();
            }
        });

    }
    private class ViewHolder {
        ListView listViewSignos;
    }
}
