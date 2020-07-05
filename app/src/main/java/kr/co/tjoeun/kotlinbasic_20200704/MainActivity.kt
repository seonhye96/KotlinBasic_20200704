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

//        적용하기 버튼 눌린 경우
        applyBtn.setOnClickListener {
//            inputEdt에 입력된 내용(text 속성의 값)을 받아와서(get) 변수로 저장
            val inputContent = inputEdt.text.toString()  // String으로 저장하는 것이 좋음
            
            
//            resultTxt의 내용(text 속성의 값)으로 반영(set)
            resultTxt.text = inputContent   // 결과는 inputContent로 넣어라

        }

        touchBtn.setOnClickListener {
//            터치 버튼이 눌리면 실행될 코드를 적는 공간
            Toast.makeText(this, "버튼 눌림", Toast.LENGTH_SHORT).show()

            Log.d("메인화면", "버튼이 눌림")

            Log.e("메인화면", "에러시 로그 찍을때 사용")

        }


    }
}