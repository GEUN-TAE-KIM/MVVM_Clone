package jp.co.archive_asia.mvvm_udemy_clone.util

import androidx.recyclerview.widget.DiffUtil
import jp.co.archive_asia.mvvm_udemy_clone.models.Result

class RecipesDiffUtil(
    private val oldList: List<Result>,
    private val newList: List<Result>
): DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] == newList[newItemPosition]
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList == newList
    }
}