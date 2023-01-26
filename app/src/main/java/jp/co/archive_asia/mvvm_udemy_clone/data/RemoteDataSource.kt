package jp.co.archive_asia.mvvm_udemy_clone.data

import jp.co.archive_asia.mvvm_udemy_clone.data.network.FoodRecipesApi
import jp.co.archive_asia.mvvm_udemy_clone.models.FoodJoke
import jp.co.archive_asia.mvvm_udemy_clone.models.FoodRecipe
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val foodRecipesApi: FoodRecipesApi
) {

    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipe> {
        return foodRecipesApi.getRecipes(queries)
    }

    suspend fun searchRecipes(searchQuery: Map<String, String>): Response<FoodRecipe> {
        return foodRecipesApi.searchRecipes(searchQuery)
    }

    suspend fun getFoodJoke(apiKey: String): Response<FoodJoke> {
        return foodRecipesApi.getFoodJoke(apiKey)
    }

}