package nhom10.tdc.edu.myproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class admin_itemDetails : AppCompatActivity() {
    private lateinit var  btn_cancel : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.frmlayoutdetailitem)
        setControl()
        setEvent()
    }
    private fun setControl(){
        btn_cancel=findViewById(R.id.btn_cancel)
    }
    private fun setEvent (){
        btn_cancel.setOnClickListener {
            val intentCancel = Intent(this, admin_listproducts::class.java)
            startActivity(intentCancel)
        }
    }
}