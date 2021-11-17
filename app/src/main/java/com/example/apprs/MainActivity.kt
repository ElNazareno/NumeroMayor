package com.example.apprs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {

    private var button: Button? = null

    var res: Double = 0.0;
    var a1: Double = 0.0;
    var a2: Double = 0.0;
    var a3: Double = 0.0;
    var a4: Double = 0.0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt1 = findViewById<EditText>(R.id.textViewAlumno01);
        val txt2 = findViewById<EditText>(R.id.textViewAlumno02);
        val txt3 = findViewById<EditText>(R.id.textViewAlumno03);
        val txt4 = findViewById<EditText>(R.id.textViewAlumno04);
        val re1 = findViewById<TextView>(R.id.textView1);
        val re2 = findViewById<TextView>(R.id.textView2);

    }

    fun Calcular(view: View) {
        val txt1 = findViewById<EditText>(R.id.textViewAlumno01);
        val txt2 = findViewById<EditText>(R.id.textViewAlumno02);
        val txt3 = findViewById<EditText>(R.id.textViewAlumno03);
        val txt4 = findViewById<EditText>(R.id.textViewAlumno04);

        a1 = txt1.text.toString().toDouble();
        a2 = txt2.text.toString().toDouble();
        a3 = txt3.text.toString().toDouble();
        a4 = txt4.text.toString().toDouble();

        res = (a1+a2+a3+a4) / 4;
        val re1 = findViewById<TextView>(R.id.textView1);
        re1.text = "Promedio: " + res.toString();
        val re2 = findViewById<TextView>(R.id.textView2);
        if(a1 > a2 && a1 > a3 && a1 > a4)
        {
            re2.text = "Ganador: " + a1.toString();
        }
        else if(a2 > a1 && a2 > a3 && a2 > a4)
        {
            re2.text = "Ganador: " + a2.toString();
        }
        else if(a3 > a2 && a3 > a4 && a3 > a1)
        {
            re2.text = "Ganador: " + a3.toString();
        }
        else
        {
            re2.text = "Ganador: " + a4.toString();
        }

    }
    fun Resetear(view: View) {

        val txt1 = findViewById<EditText>(R.id.textViewAlumno01);
        val txt2 = findViewById<EditText>(R.id.textViewAlumno02);
        val txt3 = findViewById<EditText>(R.id.textViewAlumno03);
        val txt4 = findViewById<EditText>(R.id.textViewAlumno04);
        val re1 = findViewById<TextView>(R.id.textView1);
        val re2 = findViewById<TextView>(R.id.textView2);

        txt1.setText("0");
        txt2.setText("0");
        txt3.setText("0");
        txt4.setText("0");
        re1.text = "";
        re2.text = "";
    }

}