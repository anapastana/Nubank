package com.example.send

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.TextView

class MainActivityy : AppCompatActivity() {
    val COD_TELA = 2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activityy)
    }

    fun btnPix_click(view: View) {
        val txtSaldo = findViewById<TextView>(R.id.txtSaldo)
        val saldo = txtSaldo.text.toString()
        val intent = Intent(this, PixActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, saldo)
        }
        startActivityForResult(intent, COD_TELA)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == COD_TELA && resultCode == Activity.RESULT_OK) {
            val txtSaldo = findViewById<TextView>(R.id.txtSaldo)
            val sSaldo = data!!.getStringExtra("sSaldo")
            txtSaldo.setText(sSaldo)
        }
    }

    fun btnPagar_click(view: View) {
        val txtSaldo = findViewById<TextView>(R.id.txtSaldo)
        val saldo = txtSaldo.text.toString()
        val intent = Intent(this, Pagar::class.java).apply {
            putExtra(EXTRA_MESSAGE, saldo)
        }
        startActivityForResult(intent, COD_TELA)
    }

    fun btnTransferir_click(view: View) {
        val txtSaldo = findViewById<TextView>(R.id.txtSaldo)
        val saldo = txtSaldo.text.toString()
        val intent = Intent(this, TransferirActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, saldo)
        }
        startActivityForResult(intent, COD_TELA)
    }
    fun btnDepositar_click(view: View) {
        val txtSaldo = findViewById<TextView>(R.id.txtSaldo)
        val saldo = txtSaldo.text.toString()
        val intent = Intent(this, Depositar::class.java).apply {
            putExtra(EXTRA_MESSAGE, saldo)
        }
        startActivityForResult(intent, COD_TELA)
    }
}