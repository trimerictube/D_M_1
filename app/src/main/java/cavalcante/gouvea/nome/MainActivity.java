package cavalcante.gouvea.nome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //constroi a interface grafica do arquivo

        Button btnEnviar = findViewById(R.id.btn_enviar); // obtem dados do botao enviar
        btnEnviar.setOnClickListener(new View.OnClickListener() { //configura botao, define o que aconteceu ao clicar
            @Override
            public void onClick(View v) { //quando houver clique, é executado; v = botao
                EditText etDigiteAqui = findViewById(R.id.et_digite_aqui); //obtem dados da caixa de textoe guarda na variavel
                String textoDigitado = etDigiteAqui.getText().toString(); //seleciona tipo string para uma nova variavel nos dados da caixa de texto

                Intent i = new Intent(MainActivity.this, Next_activity.class); //comeca a carregar a proxima pagina
                startActivity(i); //carreaga proxima pagina
            }
        });
    }
}

// lixo, pinto, lixo