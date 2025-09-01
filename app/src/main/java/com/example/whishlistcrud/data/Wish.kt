package com.example.whishlistcrud.data

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
