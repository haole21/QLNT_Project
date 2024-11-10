package nhom10.tdc.edu.myproject

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class admin_listproducts : AppCompatActivity() {
    private lateinit var  ibtn_update :ImageButton
    private lateinit var  ibtn_insert : ImageButton
    private lateinit var  ibtn_arrowUp : ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.frmlayoutproducts)
        setControl()
        setEvent()
    }
    private fun setControl(){
        ibtn_update = findViewById(R.id.ibtn_update)
        ibtn_insert = findViewById(R.id.ibtn_insert)
        ibtn_arrowUp = findViewById(R.id.ibtn_arrowUp)
    }
    private fun setEvent(){
        ibtn_update.setOnClickListener {
            val intentUpdate = Intent(this , admin_updateitem::class.java)
            startActivity(intentUpdate)
        }
        ibtn_insert.setOnClickListener {
            val intentInsert = Intent(this , admin_itemDetails::class.java)
            startActivity(intentInsert)
        }
        ibtn_arrowUp.setOnClickListener {
            val intentArrowUp = Intent (this,admin_banner::class.java)
            startActivity(intentArrowUp)
        }
    }
}