package com.example.whishlistcrud.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name="wish-title")
    val title: String="",
    @ColumnInfo(name="wish-desc")
    val description:String=""
)

object DummyWish{
    val wishList = listOf(
        Wish(title="Google Watch 2",
            description =  "An android Watch"),
        Wish(title = "Oculus Quest 2",
            description = "A VR headset for playing games"),
        Wish(title = "A Sci-fi, Book",
            description= "A science friction book from any best seller"),
        Wish(title = "Bean bag",
            description = "A comfy bean bag to substitute for a chair")
    )
}


/*
data class WishItem(
    val id: String = "",
    val title: String = "",
    val description: String = "",
    var checked: Boolean = false
)

object DummyWishItem {
    val wishList = listOf(
        WishItem(
            title = "Google Watch 2",
            description = "An android Watch"
        ),
        WishItem(
            title = "Oculus Quest 2",
            description = "A VR headset for playing games"
        ),
        WishItem(
            title = "A Sci-fi, Book",
            description = "A science friction book from any best seller"
        ),
        WishItem(
            title = "Bean bag",
            description = "A comfy bean bag to substitute for a chair"
        ),
        WishItem(
            title = "Bean bag",
            description = "A comfy bean bag to substitute for a chair"
        ),
        WishItem(
            title = "Bean bag",
            description = "A comfy bean bag to substitute for a chair"
        ),
        WishItem(
            title = "Bean bag",
            description = "A comfy bean bag to substitute for a chair"
        ),
        WishItem(
            title = "Bean bag",
            description = "A comfy bean bag to substitute for a chair"
        ), WishItem(
            title = "Bean bag",
            description = "A comfy bean bag to substitute for a chair"
        ), WishItem(
            title = "Bean bag",
            description = "A comfy bean bag to substitute for a chair"
        ), WishItem(
            title = "Bean bag",
            description = "A comfy bean bag to substitute for a chair"
        )
    )

}
*/