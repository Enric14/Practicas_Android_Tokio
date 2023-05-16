package es.travelworld.traveling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private EditText editTextHistoria;
    private Button buttonEnviar;
    private TextView textViewHistoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextHistoria = (EditText) findViewById(R.id.edittext_historia);
        buttonEnviar = (Button) findViewById(R.id.button_enviar);
        textViewHistoria = (TextView) findViewById(R.id.textview_historia);

        buttonEnviar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view==buttonEnviar) {
            String historiaRecibida = editTextHistoria.getText().toString();
            textViewHistoria.setText(historiaRecibida);
            editTextHistoria.setText("");
        }

    }
}