package com.betulnecanli.mealreceipt.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MealsModel(var mealTitle: String, var mealDesc: String) : Parcelable