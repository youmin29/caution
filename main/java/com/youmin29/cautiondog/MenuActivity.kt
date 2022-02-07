package com.youmin29.cautiondog

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, MenuActivity::class.java)
        }
    }

    val positiveButtonClick = { dialogInterface: DialogInterface, i: Int ->
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        /*
        ato.setOnClickListener{
            val builder_ato = AlertDialog.Builder(this)
                .setTitle("아토 크게 보기")
                .setView(R.drawable.ato)
                .setPositiveButton("확인했습니다.", positiveButtonClick)
                .show()
        }
        */

    }

    override fun onBackPressed() {
        var intent_builder = 0
        finish()
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("builder", intent_builder)
        startActivity(intent)
        overridePendingTransition(R.anim.enter_left, R.anim.exit_left)
    }
}