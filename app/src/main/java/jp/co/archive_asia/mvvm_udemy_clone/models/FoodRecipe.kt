package jp.co.archive_asia.mvvm_udemy_clone.models

import com.google.gson.annotations.SerializedName

data class FoodRecipe(
    @SerializedName("results")
    val results: List<Result>
)