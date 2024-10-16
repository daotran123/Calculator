package com.example.calculator_final

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var textReuslt: TextView

    private var result: Int = 0
    var state: Int = 1
    var op1: Int = 0
    var op2: Int = 0
    var operator: Int = 0
    var check_preEq: Int = 0 //0 la dang o state = 1, 1 la dang state = 2, 2 la dang trinh bay result

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textReuslt = findViewById(R.id.text_result)

        findViewById<Button>(R.id.btn0).setOnClickListener(this)
        findViewById<Button>(R.id.btn1).setOnClickListener(this)
        findViewById<Button>(R.id.btn2).setOnClickListener(this)
        findViewById<Button>(R.id.btn3).setOnClickListener(this)
        findViewById<Button>(R.id.btn4).setOnClickListener(this)
        findViewById<Button>(R.id.btn5).setOnClickListener(this)
        findViewById<Button>(R.id.btn6).setOnClickListener(this)
        findViewById<Button>(R.id.btn7).setOnClickListener(this)
        findViewById<Button>(R.id.btn8).setOnClickListener(this)
        findViewById<Button>(R.id.btn9).setOnClickListener(this)
        findViewById<Button>(R.id.btnAdd).setOnClickListener(this)
        findViewById<Button>(R.id.btnSub).setOnClickListener(this)
        findViewById<Button>(R.id.btnMul).setOnClickListener(this)
        findViewById<Button>(R.id.btnDiv).setOnClickListener(this)
        findViewById<Button>(R.id.btnEqual).setOnClickListener(this)
        findViewById<Button>(R.id.btnCE).setOnClickListener(this)
        findViewById<Button>(R.id.btnC).setOnClickListener(this)
        findViewById<Button>(R.id.btnBS).setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val id = p0?.id
        if (id == R.id.btn0) {
            if (check_preEq == 2){
                state = 1
                op1 = 0
                op2 = 0
                operator = 0
                check_preEq = 0
            }
            addDigit(0)
        } else if (id == R.id.btn1) {
            if (check_preEq == 2){
                state = 1
                op1 = 0
                op2 = 0
                operator = 0
                check_preEq = 0
            }
            addDigit(1)
        } else if (id == R.id.btn2) {
            if (check_preEq == 2){
                state = 1
                op1 = 0
                op2 = 0
                operator = 0
                check_preEq = 0
            }
            addDigit(2)
        } else if (id == R.id.btn3) {
            if (check_preEq == 2){
                state = 1
                op1 = 0
                op2 = 0
                operator = 0
                check_preEq = 0
            }
            addDigit(3)
        } else if (id == R.id.btn4) {
            if (check_preEq == 2){
                state = 1
                op1 = 0
                op2 = 0
                operator = 0
                check_preEq = 0
            }
            addDigit(4)
        } else if (id == R.id.btn5) {
            if (check_preEq == 2){
                state = 1
                op1 = 0
                op2 = 0
                operator = 0
                check_preEq = 0
            }
            addDigit(5)
        } else if (id == R.id.btn6) {
            if (check_preEq == 2){
                state = 1
                op1 = 0
                op2 = 0
                operator = 0
                check_preEq = 0
            }
            addDigit(6)
        } else if (id == R.id.btn7) {
            if (check_preEq == 2){
                state = 1
                op1 = 0
                op2 = 0
                operator = 0
                check_preEq = 0
            }
            addDigit(7)
        } else if (id == R.id.btn8) {
            if (check_preEq == 2){
                state = 1
                op1 = 0
                op2 = 0
                operator = 0
                check_preEq = 0
            }
            addDigit(8)
        } else if (id == R.id.btn9) {
            if (check_preEq == 2){
                state = 1
                op1 = 0
                op2 = 0
                operator = 0
                check_preEq = 0
            }
            addDigit(9)
        }else if (id == R.id.btnAdd) {
            if (check_preEq > 0){
                op1 = result
                op2 = 0
                check_preEq = 1
            }
            state = 2
            operator = 1
        }else if (id == R.id.btnSub) {
            if (check_preEq > 0){
                op1 = result
                op2 = 0
                check_preEq = 1
            }
            state = 2
            operator = 2
        }else if (id == R.id.btnMul) {
            if (check_preEq > 0){
                op1 = result
                op2 = 0
                check_preEq = 1
            }
            state = 2
            operator = 3
        }else if (id == R.id.btnDiv) {
            if (check_preEq > 0){
                op1 = result
                op2 = 0
                check_preEq = 1
            }
            state = 2
            operator = 4
        } else if (id == R.id.btnC){
            state = 1
            op1 = 0
            op2 = 0
            operator = 0
            textReuslt.text = "0"
            check_preEq = 0
            result = 0
        } else if (id == R.id.btnCE){
            if (check_preEq == 2){
                state = 1
                op1 = 0
                op2 = 0
                operator = 0
                check_preEq = 0
            }
            else if (state == 1){
                op1 = 0
                textReuslt.text= "0"
            }else{
                op2 = 0
                textReuslt.text= "0"
            }
        }else if (id == R.id.btnBS){
            subDigit()
        }else if (id == R.id.btnEqual) {
            if (operator == 1){
                result = op1 + op2
            }else if (operator == 2){
                result = op1 - op2
            }else if (operator == 3){
                result = op1 * op2
            }else if (operator == 4){
                result = op1 / op2
            }
            textReuslt.text = "$result"
            check_preEq = 2

        }


        Log.i("State:", "$state")
        Log.i("Op1:", "$op1")
        Log.i("Op2", "$op2")
        Log.i("Operator:", "$operator")
        Log.i("Result:", "$result")
        Log.i("Check_preEq:", "$check_preEq")
    }

    fun addDigit(c: Int) {
        if (state == 1) {
            op1 = op1 * 10 + c
            textReuslt.text = "$op1"
        } else {
            op2 = op2 * 10 + c
            textReuslt.text = "$op2"
        }
    }

    fun subDigit() {
        if (state == 1) {
            op1 = op1 / 10
            textReuslt.text = "$op1"
        } else {
            op2 = op2 /10
            textReuslt.text = "$op2"
        }
    }
}