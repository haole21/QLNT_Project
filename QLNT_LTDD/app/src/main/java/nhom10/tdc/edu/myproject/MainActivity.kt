package nhom10.tdc.edu.myproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var btn_list : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.frmlayoutadmin)
         setControl()
        setEvent()
    }
    private fun setControl(){
        btn_list = findViewById(R.id.btn_crud)
    }
    private fun setEvent(){
        btn_list.setOnClickListener{
            val intent = Intent(this , admin_banner::class.java)
            startActivity(intent)
        }
    }
}