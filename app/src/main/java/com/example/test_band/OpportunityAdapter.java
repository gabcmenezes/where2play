package com.example.test_band;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.test_band.R;

import java.util.ArrayList;

public class OpportunityAdapter extends ArrayAdapter<Opportunity> {

    private Context context;
    private ArrayList<Opportunity> opportunitys;

    public OpportunityAdapter(Context context, ArrayList<Opportunity> opportunitys) {
        super(context, 0, opportunitys);
        this.context = context;
        this.opportunitys = opportunitys;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(context).inflate(R.layout.activity_item_opportunity, parent, false);
        }

        Opportunity opportunity = opportunitys.get(position);

        TextView nomeEventoTextView = listItemView.findViewById(R.id.nomeEventoTextView);
        TextView cidadeTextView = listItemView.findViewById(R.id.cidadeTextView);
        TextView estiloMusicalTextView = listItemView.findViewById(R.id.estiloMusicalTextView);
        TextView dataTextView = listItemView.findViewById(R.id.dataTextView);
        TextView horaTextView = listItemView.findViewById(R.id.horaTextView);
        TextView bandasCandidatasTextView = listItemView.findViewById(R.id.bandasCandidatasTextView);

        nomeEventoTextView.setText(opportunity.getNomeEvento());
        cidadeTextView.setText("Cidade: " + opportunity.getCidade());
        estiloMusicalTextView.setText("Estilo Musical: " + opportunity.getEstiloMusical());
        dataTextView.setText("Data: " + opportunity.getData());
        horaTextView.setText("Hora: " + opportunity.getHora());
        bandasCandidatasTextView.setText("Bandas Candidatas: " + opportunity.getBandasCandidatas());

        return listItemView;
    }
}
