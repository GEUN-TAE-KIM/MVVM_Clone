package jp.co.archive_asia.mvvm_udemy_clone.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import jp.co.archive_asia.mvvm_udemy_clone.common.Constants.Companion.RECIPES_TABLE
import jp.co.archive_asia.mvvm_udemy_clone.models.FoodRecipe

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}