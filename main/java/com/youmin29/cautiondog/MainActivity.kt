package com.youmin29.cautiondog

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.youmin29.cautiondog.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_act.*

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    val positiveButtonClick = { dialogInterface: DialogInterface, i: Int ->
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //처음에는 음식 화면으로 초기화
        setFragment(FragmentFood())
        dataFood()

        /*
        key="builder"인 전달받은 값이 있다면 아무것도 안 띄움
        else문에 있는 Dialog를 처음 어플 실행할 때만 띄우기 위함
        */
        if(intent.hasExtra("builder")){}
        else{
            //어플 실행 시 나타나는 주의사항 Dialog
            val builder = AlertDialog.Builder(this)
                .setTitle("음식을 줄 때 주의해주세요!")
                .setMessage(
                    "1. 어떤 음식이라도 작게 자르거나 으깨서 줘야해요. \n" +
                            "2. 처음에는 조금만 줘서 알러지가 있는지 알아봐야해요. \n" +
                            "*해당 글은 설명에 작성되어 있지 않더라도 무조건 지켜서 급여해주세요*"
                )
                .setPositiveButton("확인했습니다.", positiveButtonClick)
                .show()
        }


        //아래 버튼 눌렀을 경우 맞는 프래그먼트로 전환
        btnfood.setOnClickListener{
            setFragment(FragmentFood())
            dataFood()
        }
        btnact.setOnClickListener{
            setFragment(FragmentAct())
            dataAct()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_1, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle presses on the action bar items
        when(item.itemId){
            R.id.action_btn1 -> {
                finish()
                val intent2 = Intent(this, MenuActivity::class.java)
                startActivity(intent2)
                overridePendingTransition(R.anim.enter_right, R.anim.exit_right)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    //음식 화면 데이터
    fun dataFood(){

        val list = ArrayList<DataFriends>()
        val possible = getDrawable(R.drawable.ic_possible)!!
        val impossible = getDrawable(R.drawable.ic_impossible)!!
        //list 기본 형태 list.add(DataFriends(null, "", ""))

        list.add(DataFriends(possible, "감", "과일"))
        list.add(DataFriends(possible, "귤", "과일"))
        list.add(DataFriends(possible, "딸기", "과일"))
        list.add(DataFriends(impossible, "말린 과일", "과일"))
        list.add(DataFriends(possible, "망고", "과일"))
        list.add(DataFriends(possible, "멜론", "과일"))
        list.add(DataFriends(impossible, "무화과", "과일"))
        list.add(DataFriends(possible, "바나나", "과일"))
        list.add(DataFriends(possible, "밤", "과일"))
        list.add(DataFriends(possible, "배", "과일"))
        list.add(DataFriends(possible, "블루베리", "과일"))
        list.add(DataFriends(possible, "사과", "과일"))
        list.add(DataFriends(impossible, "샤인머스캣", "과일"))
        list.add(DataFriends(possible, "수박", "과일"))
        list.add(DataFriends(impossible, "자두", "과일"))
        list.add(DataFriends(possible, "참외", "과일"))
        list.add(DataFriends(impossible, "청포도", "과일"))
        list.add(DataFriends(possible, "체리", "과일"))
        list.add(DataFriends(possible, "키위", "과일"))
        list.add(DataFriends(possible, "파인애플", "과일"))
        list.add(DataFriends(impossible, "포도", "과일"))
        list.add(DataFriends(possible, "홍시", "과일"))
        list.add(DataFriends(possible, "계란", "식품"))
        list.add(DataFriends(impossible, "초콜릿", "식품"))
        list.add(DataFriends(possible, "감자", "채소"))
        list.add(DataFriends(possible, "고구마", "채소"))

        val adapter = RecyclerAdapterFriends(list)
        xml_main_rv_friends.adapter = adapter
    }

    //행동 화면 데이터
    fun dataAct(){
        val list = ArrayList<DataFriends>()
        val happy = getDrawable(R.drawable.ic_happy)!!
        val bad = getDrawable(R.drawable.ic_bad)!!
        val soso = getDrawable(R.drawable.ic_soso)!!
        val scared = getDrawable(R.drawable.ic_scared)!!
        //list 기본 형태 list.add(DataFriends(null, "", ""))

        list.add(DataFriends(happy, "고개를 갸웃거릴 때", "고개"))    //보호자에게 집중한다는 뜻
        list.add(DataFriends(happy, "꼬리를 흔들 때", "꼬리"))
        list.add(DataFriends(scared, "꼬리를 다리 사이에 넣고 눈치를 볼 때", "꼬리"))   //공포 두렵다
        list.add(DataFriends(happy, "잦은 빈도로 눈을 깜빡일 때", "눈"))
        list.add(DataFriends(soso, "눈을 마주칠 때", "눈")) //친한사람: 호감 표시, 낯선 사람: 경계
        list.add(DataFriends(scared, "몸을 발로 긁을 때", "발"))  //피부질환이 없다면 불안한 상태
        list.add(DataFriends(scared, "문을 발로 긁을 때", "발"))  //보호자와 떨어져있는 것에 대해 불안을 표현
        list.add(DataFriends(soso, "땅을 발로 팔 때", "발"))   //지루하고 심심하다는 뜻
        list.add(DataFriends(happy, "배를 뒤집을 때", "배"))
        list.add(DataFriends(bad, "낑낑거릴 때", "소리"))  //고통스럽다 스트레스 받는다
        list.add(DataFriends(scared, "보호자가 나간 후 짖을 때", "소리"))  //혼자 있기 무섭다는 뜻
        list.add(DataFriends(soso, "하품할 때", "입"))   //긴장, 스트레스, 진정하라는 의미
        list.add(DataFriends(happy, "보호자의 얼굴을 핥을 때", "입"))   //페로몬으로 정보 수집, 그리움과 복종
        list.add(DataFriends(scared, "떨면서 침을 흘릴 때", "입"))  //겁난다 긴장된다
        list.add(DataFriends(happy, "물건을 가져다 줄 때", "행동"))    //강아지가 보호자에게 사랑을 표시하는 방법
        list.add(DataFriends(happy, "등을 돌리고 있을 때", "행동"))   //보호자에게 안심하고 있다는 뜻

        val adapter = RecyclerAdapterFriends(list)
        xml_main_rv_friends.adapter = adapter
    }

    fun setFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frameLayout, fragment)
        transaction.commit()
    }

}