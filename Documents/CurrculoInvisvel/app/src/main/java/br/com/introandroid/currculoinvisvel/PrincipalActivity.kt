package br.com.introandroid.currculoinvisvel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_formulario2.*
import kotlinx.android.synthetic.main.activity_principal.*

class PrincipalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        btnPrincipalSaiba1.setOnClickListener {
            val intentFormulario8 = Intent(this@PrincipalActivity, WebActivity::class.java)
            startActivity(intentFormulario8)
        }
        btnPrincipalSaiba2.setOnClickListener {
            val intentFormulario9 = Intent(this@PrincipalActivity, WebActivity::class.java)
            startActivity(intentFormulario9)
        }

        btnPrincipalSair.setOnClickListener {
            val intentFormulario11 = Intent(this@PrincipalActivity, LoginActivity::class.java)
            startActivity(intentFormulario11)
            finishAffinity()
        }

        btnPrincipalPerfil.setOnClickListener {
            val intentFormulario24 = Intent(this@PrincipalActivity, PerfilActivity::class.java)
            startActivity(intentFormulario24)
            finishAffinity()
        }
    }
}