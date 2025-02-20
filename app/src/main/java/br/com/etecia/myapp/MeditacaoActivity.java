package br.com.etecia.myapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MeditacaoActivity extends AppCompatActivity {

    private List<Meditacao> lstMeditacao;
    RecyclerView recMeditacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_meditacao_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        lstMeditacao = new ArrayList<>();

        lstMeditacao.add(
                new Meditacao("Para repousar",
                        "Meditação - 10 minutos", "string/meditar_texto",
                        R.drawable.zen
                )

        );
        lstMeditacao.add(
                new Meditacao("Para repousar",
                        "Meditação - 10 minutos", "string/meditar_texto",
                        R.drawable.zen
                )

        );
        lstMeditacao.add(
                new Meditacao("Para repousar",
                        "Meditação - 10 minutos", "string/meditar_texto",
                        R.drawable.zen
                )

        );
        lstMeditacao.add(
                new Meditacao("Para repousar",
                        "Meditação - 10 minutos", "string/meditar_texto",
                        R.drawable.zen
                )

        );
        lstMeditacao.add(
                new Meditacao("Para repousar",
                        "Meditação - 10 minutos", "string/meditar_texto",
                        R.drawable.zen
                )

        );


        recMeditacao = findViewById(R.id.recMeditacao);

        AdapterMeditacao adapterMeditacao = new AdapterMeditacao(getApplicationContext(), lstMeditacao);

        //Carregando o adaptador a lista

        recMeditacao.setLayoutManager(
                new LinearLayoutManager(getApplicationContext(),
                        LinearLayoutManager.HORIZONTAL,true));

        recMeditacao.setHasFixedSize(true);

        recMeditacao.setAdapter(adapterMeditacao);


    }
}