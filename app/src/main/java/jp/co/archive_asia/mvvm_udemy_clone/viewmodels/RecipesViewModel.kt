package jp.co.archive_asia.mvvm_udemy_clone.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import jp.co.archive_asia.mvvm_udemy_clone.common.Constants
import jp.co.archive_asia.mvvm_udemy_clone.common.Constants.Companion.API_KEY
import jp.co.archive_asia.mvvm_udemy_clone.common.Constants.Companion.QUERY_ADD_RECIPE_INFORMATION
import jp.co.archive_asia.mvvm_udemy_clone.common.Constants.Companion.QUERY_API_KEY
import jp.co.archive_asia.mvvm_udemy_clone.common.Constants.Companion.QUERY_DIET
import jp.co.archive_asia.mvvm_udemy_clone.common.Constants.Companion.QUERY_FILL_INGREDIENTS
import jp.co.archive_asia.mvvm_udemy_clone.common.Constants.Companion.QUERY_NUMBER
import jp.co.archive_asia.mvvm_udemy_clone.common.Constants.Companion.QUERY_TYPE

class RecipesViewModel(application: Application) : AndroidViewModel(application) {

    fun applyQueries(): HashMap<String, String> {
        val queries: HashMap<String, String> = HashMap()

        queries[QUERY_NUMBER] = "50"
        queries[QUERY_API_KEY] = API_KEY
        queries[QUERY_TYPE] = "snack"
        queries[QUERY_DIET] = "vegan"
        queries[QUERY_ADD_RECIPE_INFORMATION] = "true"
        queries[QUERY_FILL_INGREDIENTS] = "true"

        return queries
    }
}