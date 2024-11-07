package com.example.rejestracja;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText email;
    private EditText haslo;
    private EditText powtorzHaslo;
    private Button zatwierdz;
    private TextView komunikat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email);
        haslo = findViewById(R.id.haslo);
        powtorzHaslo = findViewById(R.id.powtorzHaslo);
        zatwierdz = findViewById(R.id.zatwierdz);
        komunikat = findViewById(R.id.komunikat);

        zatwierdz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailS = email.getText().toString().trim();
                String hasloS = haslo.getText().toString().trim();
                String powtorzHasloS = powtorzHaslo.getText().toString().trim();

                if (!emailS.contains("@")) {komunikat.setText("Nieprawidłowy adres e-mail");}
                else if (!hasloS.equals(powtorzHasloS)) {komunikat.setText("Hasła sie rożnia");}
                else {komunikat.setText("Witaj " + emailS);}
            }
        });
    }
}