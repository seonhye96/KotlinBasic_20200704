package kr.co.tjoeun.kotlinbasic_20200704

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        touchBtn.setOnClickListener {
//            터치 버튼이 눌리면 실행될 코드를 적는 공간
            Toast.makeText(this, "버튼 눌림", Toast.LENGTH_SHORT).show()

            Log.d("메인화면", "버튼이 눌림")

            Log.e("메인화면", "에러시 로그 찍을때 사용")

        }


    }
}