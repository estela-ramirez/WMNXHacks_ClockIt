// package com.example.sample.ui.history

// import android.os.Bundle
// import android.view.LayoutInflater
// import android.view.View
// import android.view.ViewGroup
// import android.widget.TextView
// import androidx.fragment.app.Fragment
// import androidx.lifecycle.Observer
// import androidx.lifecycle.ViewModelProviders
// import com.example.sample.R

// class HistoryFragment : Fragment() {

//     private lateinit var historyViewModel: HistoryViewModel

//     override fun onCreateView(
//         inflater: LayoutInflater,
//         container: ViewGroup?,
//         savedInstanceState: Bundle?
//     ): View? {
//         historyViewModel =
//             ViewModelProviders.of(this).get(HistoryViewModel::class.java)
//         val root = inflater.inflate(R.layout.fragment_history, container, false)
//         val textView: TextView = root.findViewById(R.id.text_slideshow)
//         historyViewModel.text.observe(this, Observer {
//             textView.text = it
//         })
//         return root
//     }
// }

package com.example.tasks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.ActionBar
//import androidx.test.espresso.matcher.ViewMatchers.isChecked
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        Task1.isChecked = true
        Task2.isChecked = true
        Task3.isChecked = true

        val CompletedTask = findViewById<TextView>(R.id.BeginButton)

        Button.setOnClickListener {
            //onButtonDeleteHistory(checkBox1)
            Log.d("DEBUG", "I was clicked")
            if (Task1.isChecked()) Task1.setChecked(false)
            if (Task2.isChecked()) Task2.setChecked(false)
            if (Task3.isChecked()) Task3.setChecked(false)
            Task1.setVisibility(View.GONE)
            Task2.setVisibility(View.GONE)
            Task3.setVisibility(View.GONE)

        }

    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
