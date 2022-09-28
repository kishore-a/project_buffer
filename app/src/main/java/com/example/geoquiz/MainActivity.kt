package com.example.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val truebutton= findViewById<Button>(R.id.true1)
        val falsebutton =findViewById<Button>(R.id.false1)
        val previousButton=findViewById<ImageButton>(R.id.imageButton1)
        val nextButton=findViewById<ImageButton>(R.id.imageButton2)
        var questionIndex= 0
        val textview=findViewById<TextView>(R.id.textView1)
        val questions= arrayOf<String>("The River Thames flows through Cambridge","The largest country in the world is Russia","The capital city of Australia is Canberra","Rivers hold 20% of the world’s water","The sides of the river are called the bed","Volcanoes are often found on tectonic plates",)
        val answers= arrayOf<String>("False","True","True","False","False","True")
        fun checkanswer(answer:String){
            if(answer==answers[questionIndex]){
                Toast.makeText(this,"Correct!",Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"Incorrect!",Toast.LENGTH_SHORT).show()
            }
        }
        textview.text=questions[questionIndex]

        truebutton.setOnClickListener(){
            checkanswer("True")
        }

        falsebutton.setOnClickListener(){
            checkanswer("False")
        }
        previousButton.setOnClickListener(){
            if(questionIndex>0) {
                questionIndex--
                textview.text = questions[questionIndex]
            }
//            else{
//                Toast.makeText(this,"Cant Go back",Toast.LENGTH_SHORT).show()
//            }
        }
        nextButton.setOnClickListener(){
            if(questionIndex<5) {
                questionIndex++
                textview.text = questions[questionIndex]
            }

            }





    }
}