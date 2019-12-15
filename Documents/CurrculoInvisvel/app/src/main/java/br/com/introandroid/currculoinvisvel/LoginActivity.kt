package br.com.introandroid.currculoinvisvel

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //Obtendo informação do EditText
        btnEntrar.setOnClickListener {//Inicio do click do botão
            //Abrindo o Shared Preference
            val minhaPreferencia = getSharedPreferences("Minha-preferencia", Context.MODE_PRIVATE)

            //Resgatando as informações do Shared Preference
            val email = minhaPreferencia.getString("email", "lucas.tnv27@gmail.com")
            val senha_cadastro  = minhaPreferencia.getString("senha_cadastro", "123")

            val userDefine = email
            val passwordDefine = senha_cadastro

            val user = edtUsuario.text.toString().trim() //Pegando o valor do edit text | o .trim elimna os espaços
            val password = edtSenha.text.toString().trim() //Pegando o valor do edit text | o .trim elimna os espaços

            if (user.isNotEmpty() && password.isNotEmpty()) {//Testando se as variáveis estão vazias
                if (userDefine == user && passwordDefine == password) { //Condição para acesso permitido
                    //Alertando que o cadastro foi efetuado
                    AlertDialog.Builder(this@LoginActivity)
                        .setTitle("Sucesso") //Titulo
                        .setMessage("Login efetuado com sucesso")
                        .setPositiveButton("OK"){_,_ ->
                            //Indo para a próxima tela
                            startActivity(Intent(this@LoginActivity, PrincipalActivity::class.java))
                        }
                        .setCancelable(false)//Ele bloqueia que o usuario feche o alerta clicando fora do alerta
                        .create()
                        .show()
                }else{//Condição para acesso negado
                    Toast.makeText(this@LoginActivity, "Acesso Negado", 3000).show()
                }
            }else {//Condição para verificar acesso
                Toast.makeText(this@LoginActivity, "VERIFICAR O PREENCHEMENTO", 3000).show()
            }
        }//Fim do click do botão

        btnCadastro.setOnClickListener {
            //Crianco uma intent explicita
            val intentLogin = Intent(
                this@LoginActivity,
                CadastroActivity::class.java
            )//Dentro desse parametro, você tem que colocar de onde você está, para onde você precisa ir
            //Executando a intent
            startActivity(intentLogin) //Dentro do parametro deve-se colocar a intent que quer executar
        }
    }
}