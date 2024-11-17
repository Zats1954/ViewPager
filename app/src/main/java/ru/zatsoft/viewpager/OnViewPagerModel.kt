package ru.zatsoft.viewpager

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class OnViewPagerModel(val name: String, val imageView: Int, val author: String, val check: Boolean): Parcelable {

    companion object{
    val viewPagerList = mutableListOf(
        OnViewPagerModel("КРЕДИТ НАЛИЧНЫМИ ОТ ВТБ", R.drawable.bank1, "Заморозили ставки по кредиту наличными", true),
        OnViewPagerModel("ДЕБЕТОВАЯ КАРТА ВТБ",R.drawable.bank2, "Бесплатная карта с кешбэком рублями до 25%", true),
        OnViewPagerModel("НЕ УПУСКАЙТЕ СВОЮ ВЫГОДУ",R.drawable.bank3, "Переход в ВТБ с выгодой для каждого клиента \"Открытия\"",false),
    )
}
}