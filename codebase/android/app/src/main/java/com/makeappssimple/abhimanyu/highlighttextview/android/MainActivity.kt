package com.makeappssimple.abhimanyu.highlighttextview.android

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.text.style.StrikethroughSpan
import android.text.style.StyleSpan
import android.text.style.UnderlineSpan
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textview)
        val spannableString = SpannableString(textView.text)
        val redColor = ForegroundColorSpan(Color.rgb(192, 0, 0))
        val blueColor = ForegroundColorSpan(Color.rgb(0, 0, 200))
        val boldSpan = StyleSpan(Typeface.BOLD)
        val italicSpan = StyleSpan(Typeface.ITALIC)
        val underlineSpan = UnderlineSpan()
        val strikethroughSpan = StrikethroughSpan()
        spannableString.setSpan(redColor, 31, 34, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableString.setSpan(blueColor, 39, 43, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableString.setSpan(boldSpan, 76, 80, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableString.setSpan(italicSpan, 82, 88, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableString.setSpan(underlineSpan, 90, 100, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableString.setSpan(strikethroughSpan, 102, 116, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        textView.text = spannableString
    }
}
