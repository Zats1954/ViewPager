package ru.zatsoft.viewpager

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class OnViewPagerModel(val name: String, val imageView: Int, val author: String): Parcelable {

    companion object{
    val viewPagerList = mutableListOf(
        OnViewPagerModel("Март", R.drawable.mart, "Левитан"),
        OnViewPagerModel("Весна. Большая вода",R.drawable.spring_flood, "Левитан"),
        OnViewPagerModel("Цветущие яблони",R.drawable.blum_apple_tree, "Левитан"),
        OnViewPagerModel("Сумерки. Стога",R.drawable.haystack, "Левитан"),
        OnViewPagerModel("У омута",R.drawable.uomuta, "Левитан"),
        OnViewPagerModel("Плес",R.drawable.ples, "Левитан"),
        OnViewPagerModel("Вечерний звон",R.drawable.evening_bell, "Левитан"),
        OnViewPagerModel("Над вечным покоем",R.drawable.temporary_still, "Левитан"),
        OnViewPagerModel("Владимирка",R.drawable.vladimirka, "Левитан"),
        OnViewPagerModel("Золотая осень",R.drawable.gold_fall, "Левитан"),
    )
}
}