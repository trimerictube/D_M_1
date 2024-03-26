package cavalcante.gouvea.nome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Next_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Intent i = getIntent(); //obtem intent que criou segunda tela


        String textoDigitado= i.getStringExtra("texto"); //obtem texto da primeira tela

        TextView tvTexto = findViewById(R.id.tv_texto);
        tvTexto.setText(textoDigitado); //aaprece o texto no tv_texto
    }
}