package facci.SaraTS.practica;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button buttonSend;
    private EditText editTextDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setViwes();
    }

    private void setViwes(){
        buttonSend = findViewById(R.id.main_btn_check);
        buttonSend.setOnClickListener(this);
        editTextDate = findViewById(R.id.main_ed_week_number);
    }

    @Override
    public void onClick(View view) {
    }

    private EditText Nombre, Apellido, Telefono;



}