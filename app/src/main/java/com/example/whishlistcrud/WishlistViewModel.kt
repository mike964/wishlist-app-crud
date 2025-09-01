package com.example.whishlistcrud

import android.util.Log
import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.whishlistcrud.data.WishItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch


//data class WishItem(val id: Int, val title: String, val description: String,  var checked: Boolean = false)


class WishlistViewModel: ViewModel() {
    // This private mutable list will hold the actual data
//    private var _wishlist = getWishlistItems().toMutableStateList()

    private val _wishlist = MutableStateFlow<List<WishItem>>(emptyList())
    val wishlist: StateFlow<List<WishItem>> = _wishlist


    init {
        // Simulate loading data
        viewModelScope.launch {
            // In a real app, this would fetch data from a repository or API
//            val fetchedUsers = getWishlistItems().toMutableStateList()
//            _wishlist.value = fetchedUsers
        }
    }

    // Function to remove an item from the list
    fun remove(item: WishItem) {
//        _wishlist.remove(item)
        viewModelScope.launch {
            _wishlist.value = _wishlist.value.filter { it.id != item.id }
        }
    }
    fun addWish(title:String , description:String ) {
        viewModelScope.launch {
        val newWish = WishItem(System.currentTimeMillis().toString(), title, description)
//        _wishlist =  _wishlist.add(newWish)
            _wishlist.value = _wishlist.value + newWish
        Log.d("xxc", _wishlist.toString())
        }
    }

    // Function to change the checked state of a task
//    fun changeTaskChecked(item: WishItem, checked: Boolean) {
//        wishlist.find { it.id == item.id }?.let { task ->
//            task.checked = checked
//        }
//    }

    // Dummy data source
//    private fun getWishlistItems() = List(20) { i -> WishItem(i.toString(),     "Wish $i" , "Wish $i description..") }
}