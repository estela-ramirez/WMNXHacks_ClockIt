// package com.example.sample.ui.tasks

// import android.os.Bundle
// import android.view.LayoutInflater
// import android.view.View
// import android.view.ViewGroup
// import android.widget.TextView
// import androidx.fragment.app.Fragment
// import androidx.lifecycle.Observer
// import androidx.lifecycle.ViewModelProviders
// import com.example.sample.R

// class TasksFragment : Fragment() {

//     private lateinit var tasksViewModel: TasksViewModel

//     override fun onCreateView(
//         inflater: LayoutInflater,
//         container: ViewGroup?,
//         savedInstanceState: Bundle?
//     ): View? {
//         tasksViewModel =
//             ViewModelProviders.of(this).get(TasksViewModel::class.java)
//         val root = inflater.inflate(R.layout.fragment_tasks, container, false)
//         val textView: TextView = root.findViewById(R.id.text_tasks)
//         tasksViewModel.text.observe(this, Observer {
//             textView.text = it
//         })
//         return root
//     }
// }

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="fill_parent"
    android:layout_height="fill_parent"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:orientation="vertical">


    <androidx.appcompat.widget.Toolbar
        android:id="@+id/toolbar"
        android:text="Tasks"
        android:layout_width="match_parent"
        android:layout_height="?attr/actionBarSize"
        android:background="?attr/colorPrimary"
        app:popupTheme="@style/AppTheme.PopupOverlay" />



    <CheckBox
        android:id="@+id/Task1"
        android:layout_width="390dp"
        android:layout_height="45dp"
        android:text="Do the Dishes" />

    <CheckBox
        android:id="@+id/Task2"
        app:layout_anchor="@+id/Task2"
        app:layout_anchorGravity="bottom|center"
        android:layout_width="390dp"
        android:layout_height="45dp"
        android:text="Medicare For All" />

    <CheckBox
        android:id="@+id/Task3"
        app:layout_anchor="@+id/Task2"
        app:layout_anchorGravity="bottom|center"
        android:layout_width="390dp"
        android:layout_height="45dp"
        android:text="Make Recycling Presentation" />

    <Button
        android:id="@+id/Button"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="BEGIN" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text=""
        android:id="@+id/BeginButton" />


</LinearLayout>
