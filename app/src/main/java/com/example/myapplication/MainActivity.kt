package com.example.myapplication

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.time.Year
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val c: Calendar = Calendar.getInstance();
        val mYear = c.get(Calendar.YEAR)
        val mMonth = c.get(Calendar.MONTH)
        val mDay = c.get(Calendar.DAY_OF_MONTH)
        var age = 0

        txtDOB.setOnClickListener() {
            val dpd = DatePickerDialog(this,
                DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                    //Display Selected Date in textview
                    age = mYear - year
                    txtDOB.setText("%d-%d-%d".format(dayOfMonth, monthOfYear, year))
                    txtAge.text = (age.toString())
                    if(age>=16 && age<=20){
                        txtSaving.setText(5000.toString())
                        txtInvestment.setText((5000*0.3).toString())
                    }else if(age>=21 && age<=25){
                        txtSaving.setText(14000.toString())
                        txtInvestment.setText((14000*0.3).toString())
                    }else if(age>=26 && age<=30){
                        txtSaving.setText(29000.toString())
                        txtInvestment.setText((29000*0.3).toString())
                    }else if(age>=31 && age<=35){
                        txtSaving.setText(50000.toString())
                        txtInvestment.setText((50000*0.3).toString())
                    }else if(age>=36 && age<=40){
                        txtSaving.setText(78000.toString())
                        txtInvestment.setText((78000*0.3).toString())
                    }else if(age>=41 && age<=45){
                        txtSaving.setText(116000.toString())
                        txtInvestment.setText((116000*0.3).toString())
                    }else if(age>=46 && age<=50){
                        txtSaving.setText(165000.toString())
                        txtInvestment.setText((165000*0.3).toString())
                    }else if(age>=51 && age<=55){
                        txtSaving.setText(228000.toString())
                        txtInvestment.setText((228000*0.3).toString())
                    }
                }, mYear, mMonth, mDay
            )
            dpd.show()





        }
        btnReset.setOnClickListener(){
            txtDOB.setText("")
            txtAge.setText("")
            txtSaving.setText("")
            txtInvestment.setText("")
        }


    }


}
