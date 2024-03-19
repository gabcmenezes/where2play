package com.example.test_band;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.test_band.R;

public class RegisterBand extends AppCompatActivity {

    private EditText editTextNomeBanda;
    private EditText editTextEmailBanda;
    private EditText editTextSenhaBanda;
    private EditText editTextGeneroMusical;
    private Button buttonCadastrarBanda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_band);

        // Inicialização dos elementos de interface do usuário
        editTextNomeBanda = findViewById(R.id.editTextNomeBanda);
        editTextEmailBanda = findViewById(R.id.editTextEmailBanda);
        editTextSenhaBanda = findViewById(R.id.editTextSenhaBanda);
        editTextGeneroMusical = findViewById(R.id.editTextGeneroMusical);
        buttonCadastrarBanda = findViewById(R.id.buttonCadastrarBanda);

        // Configurar o listener do botão de cadastro
        buttonCadastrarBanda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cadastrarBanda();
            }
        });
    }

    private void cadastrarBanda() {
        // Obter os valores inseridos nos campos de texto
        String nomeBanda = editTextNomeBanda.getText().toString().trim();
        String emailBanda = editTextEmailBanda.getText().toString().trim();
        String senhaBanda = editTextSenhaBanda.getText().toString();
        String generoMusical = editTextGeneroMusical.getText().toString().trim();

        // Validar os campos (por exemplo, se estão vazios)
        if (nomeBanda.isEmpty() || emailBanda.isEmpty() || senhaBanda.isEmpty() || generoMusical.isEmpty()) {
            Toast.makeText(this, "Por favor, preencha todos os campos", Toast.LENGTH_SHORT).show();
            return;
        }

        // Aqui você pode adicionar a lógica para enviar os dados de cadastro para o backend
        // Por enquanto, apenas exibiremos uma mensagem de sucesso
        Toast.makeText(this, "Banda cadastrada com sucesso!", Toast.LENGTH_SHORT).show();

        // Você também pode adicionar lógica para navegar para outra atividade após o cadastro bem-sucedido
        // Por exemplo, abrir a tela principal do aplicativo
    }
}
