package com.mbairo.hospitalpequenoprincipe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Home extends AppCompatActivity {
    private CardView card_pos_consulta;
    private Button btn_perfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();
        InicializarElementos();

        card_pos_consulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //// TODO: mudar para o PosConsulta
                Intent intent = new Intent(Home.this, PosConsulta.class);
                startActivity(intent);
            }
        });

        btn_perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, PerfilUsuario.class);
                startActivity(intent);
            }
        });
    }
    private void InicializarElementos () {
        card_pos_consulta = findViewById(R.id.card_pos_consulta);
        btn_perfil = findViewById(R.id.btn_perfil);
    }
}