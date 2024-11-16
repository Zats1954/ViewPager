package ru.zatsoft.viewpager

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Picture(val name: String, val image:String, val author: String): Parcelable
