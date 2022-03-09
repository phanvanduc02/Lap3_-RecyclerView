package rango1.vku.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import rango1.vku.affirmations.adapter.ItemAdapter
import rango1.vku.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val textView: TextView = findViewById(R.id.textView)
//        textView.text = Datasource().loadAffirmations().size.toString()
        val myDataset = Datasource().loadAffirmations()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this,myDataset)

        recyclerView.setHasFixedSize(true)
    }
}