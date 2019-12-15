package br.com.introandroid.currculoinvisvel

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_perfil.*

class PerfilActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        //Abrindo o Shared Preference
        val minhaPreferencia = getSharedPreferences("Minha-preferencia", Context.MODE_PRIVATE)
        val minhaPreferencia1 = getSharedPreferences("Minha-preferencia1", Context.MODE_PRIVATE)
        val minhaPreferencia2 = getSharedPreferences("Minha-preferencia2", Context.MODE_PRIVATE)

        //Resgatando as informações do Shared Preference
        val nome= minhaPreferencia.getString("name", "Não localizado")
        val email = minhaPreferencia.getString("email", "Não localizado")
        val cpf = minhaPreferencia.getString("cpf", "Não localizado")
        val senha_cadastro = minhaPreferencia.getString("senha_cadastro", "Não localizado")
        val resp_formulario1 = minhaPreferencia1.getString("resp_formulario1","Não localizado")
        val resp_formulario2 = minhaPreferencia2.getString("resp_formulario2","Não localizado")

        txtPerfilNome.text = nome
        txtPerfilCpf.text = cpf
        txtPerfilEmail.text = email
        txtPerfilresp_formulario1.text = resp_formulario1
        txtPerfilresp_formulario2.text = resp_formulario2

    }
}
