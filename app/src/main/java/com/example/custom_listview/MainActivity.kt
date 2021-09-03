package com.example.custom_listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lv1 = findViewById<ListView>(R.id.lv1)
        // val names = arrayOf("James", "philip", "Joe", "Eddie", "Alex", "Jeff")
        val list = ArrayList<Model>()

        list.add(Model("James", "Programmer for Facebook!", R.drawable.facebook_logo))
        list.add(Model("Philip", "Programmer for amazon!", R.drawable.amazon_logo))
        list.add(Model("Eddie", "Programmer for Netflix!", R.drawable.netflix_logo))
        list.add(Model("Alex", "Programmer for google!", R.drawable.google_logo))

//        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(
 //           this, android.R.layout.simple_list_item_1, names
//        )

        lv1.adapter = MyCustomAdapter(this, R.layout.custom_item_layout, list)

        lv1.setOnItemClickListener{
                _, _, i, _ -> Toast.makeText(this, "You selected "+ list[i].name, Toast.LENGTH_LONG).show()
        }
    }
}