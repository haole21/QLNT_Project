package nhom10.tdc.edu.myproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class admin_banner : AppCompatActivity() {
    private lateinit var ibtn_down : ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.frmlayoutbanner)
        setControl()
        setEvent()
    }
    private fun setControl()
    {
        ibtn_down= findViewById(R.id.ibtn_down)
    }
    private fun setEvent(){
        ibtn_down.setOnClickListener {
            val intentBanner = Intent (this , admin_listproducts::class.java)
            startActivity(intentBanner)
        }
    }
}