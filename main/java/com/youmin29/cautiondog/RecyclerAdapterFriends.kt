package com.youmin29.cautiondog

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_item.view.*

class RecyclerAdapterFriends(private val items: ArrayList<DataFriends>):

    RecyclerView.Adapter<RecyclerAdapterFriends.ViewHolder>(){

        override fun getItemCount(): Int = items.size

        override fun onBindViewHolder(holder: RecyclerAdapterFriends.ViewHolder, position: Int) {
            val item = items[position]
            val listener = View.OnClickListener { it ->

                //Toast.makeText(it.context, "Clicked: " + item.strName, Toast.LENGTH_SHORT).show()
                //Toast.makeText(it.context, "", Toast.LENGTH_SHORT).show()
                when(item.strName){
                    //음식(ㄱㄴㄷ순서, 목록 상관X)
                    "감" -> Toast.makeText(it.context, "감은 급여 가능하지만, 잘 익은 감만 주세요! \n꼭지와 껍질, 씨, 감 중심은 빼고 주세요!", Toast.LENGTH_SHORT).show()
                    "감자" -> Toast.makeText(it.context, "감자는 급여 가능하지만, \n껍질은 모두 제거하고 삶아서 작게 자르거나 으깨서 줘야해요.", Toast.LENGTH_SHORT).show()
                    "계란" -> Toast.makeText(it.context, "계란은 급여 가능하지만, 후라이 보다 삶은 계란을 주는 게 좋아요.", Toast.LENGTH_SHORT).show()
                    "고구마" -> Toast.makeText(it.context, "고구마는 급여 가능하지만, \n껍질은 모두 제거하고 말리거나 익혀서 줘야해요.", Toast.LENGTH_SHORT).show()
                    "귤" -> Toast.makeText(it.context, "신장이 좋지 않은 강아지에게는 위험해요! \n건강한 아이라면 껍질은 모두 제거하고 작게 잘라서 조금만 줘요.", Toast.LENGTH_SHORT).show()
                    "딸기" -> Toast.makeText(it.context, "딸기는 급여 가능하지만, \n깨끗하게 씻고 꼭지를 따서 줘야해요.", Toast.LENGTH_SHORT).show()
                    "말린 과일" -> Toast.makeText(it.context, "말린 과일은 절대 주지 마세요! 설사의 원인이 될 수 있어요.", Toast.LENGTH_SHORT).show()
                    "망고" -> Toast.makeText(it.context, "망고는 급여 가능하지만, 속살만 잘게 잘라서 주세요.", Toast.LENGTH_SHORT).show()
                    "멜론" -> Toast.makeText(it.context, "멜론은 급여 가능하지만, 속살만 잘게 잘라서 주세요.", Toast.LENGTH_SHORT).show()
                    "무화과" -> Toast.makeText(it.context, "무화과는 절대 주지 마세요! 구토 등이 유발될 수 있어요.", Toast.LENGTH_SHORT).show()
                    "바나나" -> Toast.makeText(it.context, "바나나는 급여 가능하지만, 껍질은 빼고 주세요.", Toast.LENGTH_SHORT).show()
                    "밤" -> Toast.makeText(it.context, "밤은 급여 가능하지만, 익히고 속껍질 제거 후 주세요.", Toast.LENGTH_SHORT).show()
                    "배" ->  Toast.makeText(it.context, "배는 급여 가능하지만, 씨는 꼭 빼고 주세요.", Toast.LENGTH_SHORT).show()
                    "블루베리" -> Toast.makeText(it.context, "블루베리는 급여 가능지만, 잼이나 가공품은 말고 소량만 주세요!", Toast.LENGTH_SHORT).show()
                    "사과" -> Toast.makeText(it.context, "사과는 급여 가능하지만, \n사과씨는 먹으면 안되니 무조건 빼주세요.", Toast.LENGTH_SHORT).show()
                    "샤인머스캣" -> Toast.makeText(it.context, "샤인머스캣은 급여하면 안 돼요!\n포도류는 모두 급성 신부전을 일으킬 수 있어요!", Toast.LENGTH_SHORT).show()
                    "수박" -> Toast.makeText(it.context, "수박은 급여 가능하지만, \n씨는 제거해서 주세요.", Toast.LENGTH_SHORT).show()
                    "자두" -> Toast.makeText(it.context, "자두는 급여 불가능해요! 호흡 곤란과 쇼크 등이 발생할 수 있어요.", Toast.LENGTH_SHORT).show()
                    "참외" -> Toast.makeText(it.context, "참외는 급여 가능하지만, \n작게 잘라서 주고 씨는 소화불량을 일으킬 수 있으니 제거해주세요.", Toast.LENGTH_SHORT).show()
                    "청포도" -> Toast.makeText(it.context, "청포도는 급여하면 안 돼요! \n급성 신부전으로 이어질 수 있어 씨, 껍질, 알맹이 모두 절대 금지!", Toast.LENGTH_SHORT).show()
                    "체리" -> Toast.makeText(it.context, "체리는 급여 가능하지만, 꼭 씨앗과 줄기, 씨는 빼고 주세요.", Toast.LENGTH_SHORT).show()
                    "초콜릿" -> Toast.makeText(it.context, "초콜릿은 절대 급여하면 안 돼요!", Toast.LENGTH_SHORT).show()
                    "키위" -> Toast.makeText(it.context, "키위는 급여 가능하지만, 껍질과 씨는 빼고 조금만 주세요.", Toast.LENGTH_SHORT).show()
                    "파인애플" -> Toast.makeText(it.context, "파인애플은 급여 가능하지만, 설탕이 포함된 경우는 주면 안 돼요.", Toast.LENGTH_SHORT).show()
                    "포도" -> Toast.makeText(it.context, "포도는 급여하면 안 돼요! \n급성 신부전으로 이어질 수 있어 씨, 껍질, 알맹이 모두 절대 금지!", Toast.LENGTH_SHORT).show()
                    "홍시" -> Toast.makeText(it.context, "홍시는 급여 가능하지만, 속살만 주세요!", Toast.LENGTH_SHORT).show()

                    //행동(list 표시 순)
                    "고개를 갸웃거릴 때" -> Toast.makeText(it.context, "보호자에게 집중한다는 뜻 :)", Toast.LENGTH_SHORT).show()
                    "꼬리를 흔들 때" -> Toast.makeText(it.context, "긴장이 풀려 마음이 편하고 기분이 좋다는 뜻 :)", Toast.LENGTH_SHORT).show()
                    "꼬리를 다리 사이에 넣고 눈치를 볼 때" -> Toast.makeText(it.context, "두렵고 공포를 느낀다는 뜻 :(", Toast.LENGTH_SHORT).show()
                    "잦은 빈도로 눈을 깜빡일 때" -> Toast.makeText(it.context, "기분이 좋을 때 하는 행동 :)", Toast.LENGTH_SHORT).show()
                    "눈을 마주칠 때" -> Toast.makeText(it.context, "친한 사람에게는 호감의 표시지만, \n낯선 사람에게는 경계의 뜻", Toast.LENGTH_SHORT).show()
                    "몸을 발로 긁을 때" -> Toast.makeText(it.context, "피부질환이 없는 강아지가 긁을 때는 \n불안하다는 뜻 :(", Toast.LENGTH_SHORT).show()
                    "문을 발로 긁을 때" -> Toast.makeText(it.context, "보호자와 떨어져 불안하다는 뜻 :(", Toast.LENGTH_SHORT).show()
                    "땅을 발로 팔 때" -> Toast.makeText(it.context, "지루하고 심심하다는 뜻!", Toast.LENGTH_SHORT).show()
                    "배를 뒤집을 때" -> Toast.makeText(it.context, "기분이 좋다는 뜻 :)", Toast.LENGTH_SHORT).show()
                    "낑낑거릴 때" -> Toast.makeText(it.context, "고통스럽고 스트레스를 받는다는 뜻 :(", Toast.LENGTH_SHORT).show()
                    "보호자가 나간 후 짖을 때" -> Toast.makeText(it.context, "혼자 있기 무섭다는 뜻 :(", Toast.LENGTH_SHORT).show()
                    "하품할 때" -> Toast.makeText(it.context, "긴장하거나 스트레스를 받았다는 뜻 또는 \n상대에게 진정하라는 뜻!", Toast.LENGTH_SHORT).show()
                    "보호자의 얼굴을 핥을 때" -> Toast.makeText(it.context, "페로몬으로 정보를 수집하거나 그리움, 복종의 뜻!", Toast.LENGTH_SHORT).show()
                    "떨면서 침을 흘릴 때" -> Toast.makeText(it.context, "겁나거나 긴장된다는 뜻 :(", Toast.LENGTH_SHORT).show()
                    "물건을 가져다 줄 때" -> Toast.makeText(it.context, "보호자에게 사랑을 표시하는 뜻 :)", Toast.LENGTH_SHORT).show()
                    "등을 돌리고 있을 때" -> Toast.makeText(it.context, "보호자에게 안심하고 있다는 뜻 :)", Toast.LENGTH_SHORT).show()

                }
            }

            holder.apply{
                bind(listener, item)
                itemView.tag = item
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup,viewType: Int): RecyclerAdapterFriends.ViewHolder {
            val inflatedView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
            return RecyclerAdapterFriends.ViewHolder(inflatedView)
        }

        class ViewHolder(v: View) : RecyclerView.ViewHolder(v){
            private var view: View = v
            fun bind(listener: View.OnClickListener, item: DataFriends){
                view.xml_1stfrd_img_profile.setImageDrawable(item.imgProfile)
                view.xml_1stfrd_txt_name.text = item.strName
                view.xml_1stfrd_txt_phoneno.text = item.strMemo
                view.setOnClickListener(listener)
            }
        }

    }