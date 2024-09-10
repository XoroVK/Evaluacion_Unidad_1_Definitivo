package com.example.evaluacionunidad1;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class Actividades extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ActivityAdapter adapter;
    private List<ActivityItem> activityList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividades);


        Spinner spinnerFilter = findViewById(R.id.spinner_filter);
        ArrayAdapter<CharSequence> adapterSpinner = ArrayAdapter.createFromResource(this,
                R.array.spinner_options, android.R.layout.simple_spinner_item);
        adapterSpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFilter.setAdapter(adapterSpinner);


        recyclerView = findViewById(R.id.recycler_view_activities);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        activityList = new ArrayList<>();


        activityList.add(new ActivityItem("Hacer la cama", "Realizar el correcto aseo de tu cama", R.drawable.ic_activity_icon, 1, false, 4.5f));
        activityList.add(new ActivityItem("Ducharte", "Realizar tu aseo personal", R.drawable.ic_activity_icon3, 10, true, 5f));
        activityList.add(new ActivityItem("Tomar Desayno", "Preparar y comer tu desayuno", R.drawable.ic_activity_icon2, 87, false, 3f));


        adapter = new ActivityAdapter(activityList);
        recyclerView.setAdapter(adapter);
    }
}