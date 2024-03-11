package com.example.exam

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val submit = findViewById<Button>(R.id.submit)
        submit.setOnClickListener {
            Toast.makeText(this,"Your paper has been submitted",Toast.LENGTH_SHORT).show()
        }
        val leave = findViewById<Button>(R.id.back)
        leave.setOnClickListener {
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Are you sure?")
            builder1.setMessage("Do you want to end the exam?")
            builder1.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder1.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder1.show()
        }
        val qs1 = findViewById<TextView>(R.id.q1)
        qs1.setOnClickListener {
            val opt = arrayOf("By operating system","By compiler","By interpreter","By application software")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("BIOS is used?")
            builder2.setMultiChoiceItems(opt,null,DialogInterface.OnMultiChoiceClickListener { dialogInterface, i, b ->
            })
            builder2.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this,"Submitted",Toast.LENGTH_SHORT).show()
            })
            builder2.show()
        }
        val qs2 = findViewById<TextView>(R.id.q2)
        qs2.setOnClickListener {
            val opt = arrayOf("To prevent deadlock","To deadlock recovery","To solve the deadlock","None of these")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Banker's algorithm is used?")
            builder2.setMultiChoiceItems(opt,null,DialogInterface.OnMultiChoiceClickListener { dialogInterface, i, b ->
            })
            builder2.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this,"Submitted",Toast.LENGTH_SHORT).show()
            })
            builder2.show()
        }
        val qs3 = findViewById<TextView>(R.id.q3)
        qs3.setOnClickListener {
            val opt = arrayOf("Linear data scheduling","Non-linear data scheduling","Preemptive scheduling","Non-preemptive scheduling")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("What type of scheduling is round-robin scheduling?")
            builder2.setMultiChoiceItems(opt,null,DialogInterface.OnMultiChoiceClickListener { dialogInterface, i, b ->
            })
            builder2.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this,"Submitted",Toast.LENGTH_SHORT).show()
            })
            builder2.show()
        }
        val qs4 = findViewById<TextView>(R.id.q4)
        qs4.setOnClickListener {
            val opt = arrayOf("Bounded Waiting","Progress","Mutual Exclusion","All of these.")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Which conditions must be satisfied to solve a critical section problem?")
            builder2.setMultiChoiceItems(opt,null,DialogInterface.OnMultiChoiceClickListener { dialogInterface, i, b ->
            })
            builder2.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this,"Submitted",Toast.LENGTH_SHORT).show()
            })
            builder2.show()
        }
        val qs5 = findViewById<TextView>(R.id.q5)
        qs5.setOnClickListener {
            val opt = arrayOf("FCFS Scheduling","SJF Scheduling","Network Scheduling","SRTF Scheduling")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Which of the following scheduling algorithms is preemptive scheduling?")
            builder2.setMultiChoiceItems(opt,null,DialogInterface.OnMultiChoiceClickListener { dialogInterface, i, b ->
            })
            builder2.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this,"Submitted",Toast.LENGTH_SHORT).show()
            })
            builder2.show()
        }
    }
}