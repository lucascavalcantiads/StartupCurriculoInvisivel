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

import kotlinx.android.synthetic.main.activity_formulario2.*

class Formulario2Activity : AppCompatActivity() {

    lateinit var botao: Button
    lateinit var grupo: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario2)

        botao = findViewById(R.id.btnFormularioProximo1)
        grupo = findViewById(R.id.radioGroup1)

        //Configurando o Shared Preferences
        val minhaPrefenrecia2 = getSharedPreferences("Minha-preferencia2", Context.MODE_PRIVATE) //1°Nome do arquivo que vai criar, 2°Modo de como você acessa esse arquivo, no caso o privite só essa variavel acessa o arquivo, 3°
        val meuEditor2 = minhaPrefenrecia2.edit() //Variavel que vai ser utilizada para incluir coisas no Shared Preference

        //Variáveis utilizadas
        var radioSelecionado1: RadioButton
        radioSelecionado1 = findViewById(grupo.checkedRadioButtonId)
        var resp_formulario2 = radioSelecionado1.text.toString().trim()

        var radioSelecionado2: RadioButton
        radioSelecionado2 = findViewById(grupo.checkedRadioButtonId)
        var resp_formulario3 = radioSelecionado1.text.toString().trim()

        btnFormulario2Proximo.setOnClickListener{
            meuEditor2.putString("resp_formulario1",resp_formulario2).apply()

        }

        btnFormulario2Voltar.setOnClickListener{
            //Indo para a próxima tela
            val intentCadastro230 = Intent(this@Formulario2Activity, PrincipalActivity::class.java)
            startActivity(intentCadastro230)
        }
    }
}
