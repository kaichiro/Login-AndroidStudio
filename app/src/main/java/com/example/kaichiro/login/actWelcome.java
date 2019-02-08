package com.example.kaichiro.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class actWelcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_welcome);

        Usuario usuario = (Usuario) getIntent().getSerializableExtra("vUser");

        Toast.makeText(this, "Bem vindo " + usuario.getLogin(), Toast.LENGTH_LONG).show();
        Toast.makeText(this, "Bem vindo " + "", Toast.LENGTH_LONG).show();
    }
}
