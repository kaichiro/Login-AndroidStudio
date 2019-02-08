package com.example.kaichiro.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class actLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_login);
    }

    public void toLogin(View vw) {
        Usuario usuario = new Usuario("admin", "123");

        EditText etUser = (EditText) findViewById(R.id.edUser);
        EditText etPass = (EditText) findViewById(R.id.edPassword);

        if (usuario.getLogin().equals(etUser.getText().toString()) && usuario.getSenha().equals(etPass.getText().toString())) {
            Intent intent = new Intent(this, actWelcome.class);
            intent.putExtra("vUser", usuario);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Credenciais incorretas", Toast.LENGTH_LONG).show();
        }
    }
}
