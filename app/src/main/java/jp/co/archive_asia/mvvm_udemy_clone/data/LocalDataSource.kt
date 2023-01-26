package jp.co.archive_asia.mvvm_udemy_clone.data

import jp.co.archive_asia.mvvm_udemy_clone.data.database.RecipesDao
import jp.co.archive_asia.mvvm_udemy_clone.data.database.RecipesEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LocalDataSource @Inject constructor(
    private val recipesDao: RecipesDao
) {

    fun readDatabase(): Flow<List<RecipesEntity>> {
        return recipesDao.readRecipes()
    }

    suspend fun insertRecipes(recipesEntity: RecipesEntity) {
        recipesDao.insetRecipes(recipesEntity)
    }
}