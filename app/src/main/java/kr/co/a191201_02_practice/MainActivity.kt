package kr.co.a191201_02_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        loginBtn.setOnClickListener {
            var inputId = idEdt.text.toString()
            var inputPw = passEdt.text.toString()

            if (inputId == "admin"){

                if (inputPw == "qw123") {
                    Toast.makeText(this, "관리자입니다.", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this , "비밀번호가 틀렸습니다." , Toast.LENGTH_SHORT).show()
                }
            }
            else{
                Toast.makeText(this , "일반사용자입니다." , Toast.LENGTH_SHORT).show()
            }
        }




    }
}
