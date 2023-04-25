package com.example.teamup

import android.app.Activity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.DecelerateInterpolator
import android.view.animation.TranslateAnimation
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import org.w3c.dom.Text

class CreateTeamActivity : AppCompatActivity() {

    private lateinit var mCardView: CardView
    private lateinit var mTextView: TextView
    private var HasCreated: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_team)
        supportActionBar?.hide() // 隐藏顶部栏

        mCardView = findViewById(R.id.card_view)
        mTextView = findViewById(R.id.create_a_team)
        overridePendingTransition(0,0)// 取消系统动画

        val displayMetrics = resources.displayMetrics

        // 计算 CardView 应该移动的距离
        val translationY = 4000

        // 创建平移动画并设置监听器
        val anim = TranslateAnimation(0f, 0f, translationY.toFloat(), 0f)
        anim.duration = 1000
        anim.interpolator = DecelerateInterpolator()
        anim.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {}
            override fun onAnimationEnd(animation: Animation?) {}
            override fun onAnimationRepeat(animation: Animation?) {}
        })

        // 创建平移动画并设置监听器
        val anim1 = TranslateAnimation(0f, 0f, translationY.toFloat(), 0f)
        anim1.duration = 1000
        anim1.startOffset=300
        anim1.interpolator = DecelerateInterpolator()
        anim1.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {}
            override fun onAnimationEnd(animation: Animation?) {}
            override fun onAnimationRepeat(animation: Animation?) {}
        })

        // 开始动画
        mTextView.startAnimation(anim)
        mCardView.startAnimation(anim1)


    }

    override fun onBackPressed() {
        if(HasCreated)
            setResult(Activity.RESULT_OK)
        else
            setResult(Activity.RESULT_CANCELED)
        finish()
    }
}