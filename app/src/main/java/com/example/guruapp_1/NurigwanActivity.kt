package com.example.guruapp_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_nurigwan.*

class NurigwanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nurigwan)
        registerForContextMenu(nuri_button1)
        registerForContextMenu(nuri_button2)
        registerForContextMenu(nuri_button3)
        registerForContextMenu(nuri_button4)
        registerForContextMenu(nuri_button5)
        registerForContextMenu(nuri_button6)
        registerForContextMenu(nuri_button7)
        registerForContextMenu(nuri_button8)
        registerForContextMenu(nuri_button9)
        registerForContextMenu(nuri_button12)
        registerForContextMenu(nuri_button13)
        registerForContextMenu(nuri_button14)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)

        when (v?.id) {
            R.id.nuri_button1 -> {
                menu?.setHeaderTitle("비틀쥬스 혼잡도")
                menuInflater.inflate(R.menu.popup_menu_beetlejuice, menu)
            }
            R.id.nuri_button2 -> {
                menu?.setHeaderTitle("퀴즈노스 혼잡도")
                menuInflater.inflate(R.menu.popup_menu_quiznos, menu)
            }
            R.id.nuri_button3 -> {
                menu?.setHeaderTitle("가은 혼잡도")
                menuInflater.inflate(R.menu.popup_menu_gaeun, menu)
            }
            R.id.nuri_button4 -> {
                menu?.setHeaderTitle("츄밥 혼잡도")
                menuInflater.inflate(R.menu.popup_menu_choobap, menu)
            }
            R.id.nuri_button5 -> {
                menu?.setHeaderTitle("우리은행 혼잡도")
                menuInflater.inflate(R.menu.popup_menu_wooribank, menu)
            }
            R.id.nuri_button6 -> {
                menu?.setHeaderTitle("누리스토어 혼잡도")
                menuInflater.inflate(R.menu.popup_menu_nuristore, menu)
            }
            R.id.nuri_button7 -> {
                menu?.setHeaderTitle("안경점 혼잡도")
                menuInflater.inflate(R.menu.popup_menu_optician, menu)
            }
            R.id.nuri_button8 -> {
                menu?.setHeaderTitle("Sweet U 혼잡도")
                menuInflater.inflate(R.menu.popup_menu_sweetu, menu)
            }
            R.id.nuri_button9 -> {
                menu?.setHeaderTitle("우체국 혼잡도")
                menuInflater.inflate(R.menu.popup_menu_postoffice, menu)
            }
            R.id.nuri_button12 -> {
                menu?.setHeaderTitle("만권화밥 혼잡도")
                menuInflater.inflate(R.menu.popup_menu_mangwon, menu)
            }
            R.id.nuri_button13 -> {
            menu?.setHeaderTitle("최고당돈가스 혼잡도")
            menuInflater.inflate(R.menu.popup_menu_choigodang, menu)
            }
            R.id.nuri_button14 -> {
            menu?.setHeaderTitle("에땅 혼잡도")
            menuInflater.inflate(R.menu.popup_menu_etang, menu)
            }
        }
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item?.itemId) {
            R.id.select1_beetlejuice -> nuri_button1.setBackgroundResource(R.drawable.button_background1)
            R.id.select2_beetlejuice -> nuri_button1.setBackgroundResource(R.drawable.button_background2)
            R.id.select3_beetlejuice -> nuri_button1.setBackgroundResource(R.drawable.button_background3)
            R.id.select1_quiznos -> nuri_button2.setBackgroundResource(R.drawable.button_background1)
            R.id.select2_quiznos -> nuri_button2.setBackgroundResource(R.drawable.button_background2)
            R.id.select3_quiznos -> nuri_button2.setBackgroundResource(R.drawable.button_background3)
            R.id.select1_gaeun -> nuri_button3.setBackgroundResource(R.drawable.button_background1)
            R.id.select2_gaeun -> nuri_button3.setBackgroundResource(R.drawable.button_background2)
            R.id.select3_gaeun -> nuri_button3.setBackgroundResource(R.drawable.button_background3)
            R.id.select1_choobap -> nuri_button4.setBackgroundResource(R.drawable.button_background1)
            R.id.select2_choobap-> nuri_button4.setBackgroundResource(R.drawable.button_background2)
            R.id.select3_choobap -> nuri_button4.setBackgroundResource(R.drawable.button_background3)
            R.id.select1_wooribank -> nuri_button5.setBackgroundResource(R.drawable.button_background1)
            R.id.select2_wooribank -> nuri_button5.setBackgroundResource(R.drawable.button_background2)
            R.id.select3_wooribank -> nuri_button5.setBackgroundResource(R.drawable.button_background3)
            R.id.select1_nuristore -> nuri_button6.setBackgroundResource(R.drawable.button_background1)
            R.id.select2_nuristore -> nuri_button6.setBackgroundResource(R.drawable.button_background2)
            R.id.select3_nuristore -> nuri_button6.setBackgroundResource(R.drawable.button_background3)
            R.id.select1_optician -> nuri_button7.setBackgroundResource(R.drawable.button_background1)
            R.id.select2_optician -> nuri_button7.setBackgroundResource(R.drawable.button_background2)
            R.id.select3_optician -> nuri_button7.setBackgroundResource(R.drawable.button_background3)
            R.id.select1_sweetu -> nuri_button8.setBackgroundResource(R.drawable.button_background1)
            R.id.select2_sweetu -> nuri_button8.setBackgroundResource(R.drawable.button_background2)
            R.id.select3_sweetu -> nuri_button8.setBackgroundResource(R.drawable.button_background3)
            R.id.select1_postoffice -> nuri_button9.setBackgroundResource(R.drawable.button_background1)
            R.id.select2_postoffice -> nuri_button9.setBackgroundResource(R.drawable.button_background2)
            R.id.select3_postoffice -> nuri_button9.setBackgroundResource(R.drawable.button_background3)
            R.id.select1_mangwon -> nuri_button12.setBackgroundResource(R.drawable.button_background1)
            R.id.select2_mangwon -> nuri_button12.setBackgroundResource(R.drawable.button_background2)
            R.id.select3_mangwon -> nuri_button12.setBackgroundResource(R.drawable.button_background3)
            R.id.select1_choigodang -> nuri_button13.setBackgroundResource(R.drawable.button_background1)
            R.id.select2_choigodang -> nuri_button13.setBackgroundResource(R.drawable.button_background2)
            R.id.select3_choigodang -> nuri_button13.setBackgroundResource(R.drawable.button_background3)
            R.id.select1_etang -> nuri_button14.setBackgroundResource(R.drawable.button_background1)
            R.id.select2_etang -> nuri_button14.setBackgroundResource(R.drawable.button_background2)
            R.id.select3_etang -> nuri_button14.setBackgroundResource(R.drawable.button_background3)
        }
        return super.onContextItemSelected(item)
    }
}


