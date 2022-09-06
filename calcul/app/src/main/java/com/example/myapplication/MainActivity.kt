package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var btn : Button
    private lateinit var itog : TextView
    private lateinit var FirstNumber : EditText
    private lateinit var SecondNumber : EditText
    private lateinit var Sign : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.CalcButton)
        FirstNumber = findViewById(R.id.NumText)
        Sign = findViewById(R.id.numText)
        SecondNumber = findViewById(R.id.numText2)
        itog = findViewById(R.id.itog)
        btn.setOnClickListener{
            var First : String = FirstNumber.text.toString()
            var Second : String = SecondNumber.text.toString()
            var Sign : String = Sign.text.toString()
            var Summ : Int
            if (First.toInt() != 0 && Sign != "" && Second.toInt() != 0 )
            {
                if (Sign == "+")
                {
                    Summ = First.toInt() + Second.toInt()
                    itog.text = Summ.toString()
                }
                else if (Sign == "-")
                {
                    Summ = First.toInt() - Second.toInt()
                    itog.text = Summ.toString()
                }
                else if (Sign == "*")
                {
                    Summ = First.toInt() * Second.toInt()
                    itog.text = Summ.toString()
                }
                else if (Sign == "/")
                {
                    Summ = First.toInt() / Second.toInt()
                    itog.text = Summ.toString()
                }
                val intent = Intent(this, FinalActivity::class.java)
                intent.putExtra("data", itog.text.toString())
                startActivity((intent))
            }

        }




    }

}