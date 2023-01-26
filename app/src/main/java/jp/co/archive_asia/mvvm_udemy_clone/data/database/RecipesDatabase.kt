package jp.co.archive_asia.mvvm_udemy_clone.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import jp.co.archive_asia.mvvm_udemy_clone.data.database.entites.FavoritesEntity
import jp.co.archive_asia.mvvm_udemy_clone.data.database.entites.FoodJokeEntity
import jp.co.archive_asia.mvvm_udemy_clone.data.database.entites.RecipesEntity

@Database(
    entities = [RecipesEntity::class, FavoritesEntity::class, FoodJokeEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(RecipesTypeConverter::class)
abstract class RecipesDatabase: RoomDatabase() {

    abstract fun recipesDao(): RecipesDao

}