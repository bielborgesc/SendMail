package br.edu.ifsp.scl.ads.pdm.sendmail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.edu.ifsp.scl.ads.pdm.sendmail.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val amb: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(amb.root)

        amb.cleanBt.setOnClickListener {
            with (amb){
                toEt.setText("")
                ccEt.setText("")
                bccEt.setText("")
                subjectEt.setText("")
                messageEt.setText("")
            }
        }

        

    }
}