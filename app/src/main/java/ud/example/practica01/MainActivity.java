package ud.example.practica01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button MiBoton;
    private EditText MiEntrada;
    private TextView MiSalida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MiEntrada = (EditText) findViewById(R.id.EditText);
        MiEntrada = findViewById(R.id.EditText);
        MiSalida = findViewById(R.id.textView);
        MiBoton = findViewById(R.id.Button);
        MiBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Nombre = MiEntrada.getText().toString();
                MiSalida.setText("Bienvenido " + Nombre);
            }
        });
      }
}