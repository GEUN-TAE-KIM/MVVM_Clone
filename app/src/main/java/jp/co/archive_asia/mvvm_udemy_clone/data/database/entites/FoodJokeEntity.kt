package jp.co.archive_asia.mvvm_udemy_clone.data.database.entites

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import jp.co.archive_asia.mvvm_udemy_clone.common.Constants.Companion.FOOD_JOKE_TABLE
import jp.co.archive_asia.mvvm_udemy_clone.models.FoodJoke

@Entity(tableName = FOOD_JOKE_TABLE)
class FoodJokeEntity(
    @Embedded
    var foodJoke: FoodJoke
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}