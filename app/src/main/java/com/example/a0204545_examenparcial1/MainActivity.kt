package com.example.a0204545_examenparcial1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {

    private var display: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Input1: EditText = findViewById<EditText>(R.id.Input01)
        Input1.setOnClickListener(object: View.OnClickListener {
            override fun onClick(p0: View?) {
                if(getString(R.string.Value1) == Input1.text.toString()){
                    Input1.setText("")
                }
            }
        })
        val Input2: EditText = findViewById<EditText>(R.id.Input02)
        Input2.setOnClickListener(object: View.OnClickListener {
            override fun onClick(p0: View?) {
                if(getString(R.string.Value2) == Input2.text.toString()){
                    Input2.setText("")
                }
            }
        })
        val Input3: EditText = findViewById<EditText>(R.id.Input03)
        Input3.setOnClickListener(object: View.OnClickListener {
            override fun onClick(p0: View?) {
                if(getString(R.string.Value3) == Input3.text.toString()){
                    Input3.setText("")
                }
            }
        })

        display = findViewById<TextView>(R.id.Result)

        val ClearBTN: Button = findViewById<Button>(R.id.BTNLimpiar)
        val AddBTN: Button = findViewById<Button>(R.id.BTNAgregar)
        var firstAdd = false

        ClearBTN.setOnClickListener(object: View.OnClickListener {
            override fun onClick(p0: View?) {
                Input1.setText("")
                Input2.setText("")
                Input3.setText("")
                display?.text = ""
            }
        })

        AddBTN.setOnClickListener(object: View.OnClickListener {
            override fun onClick(p0: View?) {

                if(!firstAdd) {
                    firstAdd = true
                    display?.text = ""
                }
                if(Input1.text.toString() != "" && Input2.text.toString() != "" && Input3.text.toString() != ""){
                    display?.append(Input1.text.toString() + " + " + Input2.text + " = " + Input3.text)
                    display?.append("\n")
                    Input1.setText("")
                    Input2.setText("")
                    Input3.setText("")
                }


            }
        })


    }
}