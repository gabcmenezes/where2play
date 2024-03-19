package com.example.test_band;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.test_band.R;

import java.util.ArrayList;

public class Opportunities extends AppCompatActivity {

    private ListView listViewOpportunitys;
    private ArrayList<Opportunity> opportunities;
    private OpportunityAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opportunities);

        // Inicialização da lista de opportunities
        opportunities = new ArrayList<>();
        opportunities.add(new Opportunity("Evento 1", "São Paulo", "Rock", "01/01/2024", "18:00", 2));
        opportunities.add(new Opportunity("Evento 2", "São Paulo", "Jazz", "02/01/2024", "19:00", 1));
        opportunities.add(new Opportunity("Evento 3", "São Paulo", "Blues", "02/01/2024", "19:00", 1));
        opportunities.add(new Opportunity("Evento 4", "São Paulo", "Metal", "02/01/2024", "19:00", 1));
        opportunities.add(new Opportunity("Evento 5", "São Paulo", "Hard Rock", "02/01/2024", "19:00", 1));
        opportunities.add(new Opportunity("Evento 6", "São Paulo", "80s", "02/01/2024", "19:00", 1));
        opportunities.add(new Opportunity("Evento 7", "São Paulo", "Punk", "02/01/2024", "19:00", 1));
        // Adicione mais eventos conforme necessário

        // Inicialização do ListView e do adaptador
        listViewOpportunitys = findViewById(R.id.listViewOportunidades);
        adapter = new OpportunityAdapter(this, opportunities);
        listViewOpportunitys.setAdapter(adapter);

        // Configuração do listener de clique nos itens da lista
        listViewOpportunitys.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Aqui você pode adicionar a lógica para lidar com a seleção de uma opportunity
                Opportunity opportunitySelecionada = opportunities.get(position);
                Toast.makeText(Opportunities.this, "Você selecionou: " + opportunitySelecionada.getNomeEvento(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
