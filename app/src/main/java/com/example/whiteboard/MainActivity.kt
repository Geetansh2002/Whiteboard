package com.example.whiteboard

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.whiteboard.paintview.Companion.colorList
import com.example.whiteboard.paintview.Companion.currentBrush
import com.example.whiteboard.paintview.Companion.pathList

class MainActivity : AppCompatActivity() {

    companion object {
        var path = Path()
        val paintbrush = Paint()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val redb=findViewById<ImageButton>(R.id.red)
        val blueb=findViewById<ImageButton>(R.id.blue)
        val blackb=findViewById<ImageButton>(R.id.black)
        val whiteb=findViewById<ImageButton>(R.id.white)

        redb.setOnClickListener{
            paintbrush.setColor(Color.RED)
            currentcolor(paintbrush.color)

        }
        blueb.setOnClickListener{
            paintbrush.setColor(Color.BLUE)
            currentcolor(paintbrush.color)
        }
        blackb.setOnClickListener{
            paintbrush.setColor(Color.BLACK)
            currentcolor(paintbrush.color)
        }
        whiteb.setOnClickListener{
        pathList.clear()
            colorList.clear()
            path.reset()
        }

    }
    private fun currentcolor(color: Int){
        currentBrush=color
        path=Path()
    }
}