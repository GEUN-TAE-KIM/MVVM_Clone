package jp.co.archive_asia.mvvm_udemy_clone.data.database.entites

import androidx.room.Entity
import androidx.room.PrimaryKey
import jp.co.archive_asia.mvvm_udemy_clone.models.Result
import jp.co.archive_asia.mvvm_udemy_clone.common.Constants.Companion.FAVORITE_RECIPES_TABLE

@Entity(tableName = FAVORITE_RECIPES_TABLE)
class FavoritesEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var result: Result
)