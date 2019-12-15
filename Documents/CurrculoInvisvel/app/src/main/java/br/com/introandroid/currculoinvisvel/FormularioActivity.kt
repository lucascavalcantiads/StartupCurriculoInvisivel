package br.com.introandroid.currculoinvisvel

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_formulario.*

class FormularioActivity : AppCompatActivity() {

    lateinit var botao: Button
    lateinit var grupo: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)

        botao = findViewById(R.id.btnFormularioProximo1)
        grupo = findViewById(R.id.radioGroup1)

        //Configurando o Shared Preferences
        val minhaPrefenrecia1 = getSharedPreferences("Minha-preferencia1", Context.MODE_PRIVATE) //1°Nome do arquivo que vai criar, 2°Modo de como você acessa esse arquivo, no caso o privite só essa variavel acessa o arquivo, 3°
        val meuEditor1 = minhaPrefenrecia1.edit() //Variavel que vai ser utilizada para incluir coisas no Shared Preference

        //Variáveis utilizadas
        var radioSelecionado: RadioButton
        radioSelecionado = findViewById(grupo.checkedRadioButtonId)
        var resp_formulario1 = radioSelecionado.text.toString().trim()

        var radioSelecionado1: RadioButton
        radioSelecionado1 = findViewById(grupo.checkedRadioButtonId)
        var resp_formulario2 = radioSelecionado.text.toString().trim()

        btnFormularioProximo1.setOnClickListener{
            meuEditor1.putString("resp_formulario1",resp_formulario1).apply()

        }

        btnFormularioVoltar1.setOnClickListener{
            //Indo para a próxima tela
            val intentCadastro2 = Intent(this@FormularioActivity, Formulario2Activity::class.java)
            startActivity(intentCadastro2)
        }
    }
}
