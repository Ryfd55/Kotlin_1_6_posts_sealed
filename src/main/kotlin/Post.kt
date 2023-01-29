import attachment.Attachment

data class Post(
    val id: Int = 0,
    val ownerId: Int = 0,
    val fromId: Int = 0,
    val createdBy: Int = 0,
    val date: Int = 654,
    val text: String = "data class post",
    val replyOwnerId: Int = 0,
    val replyPostId: Int = 0,
    val friendsOnly: Boolean = false,
    val comments: Comments,
    val postType: String = "postType data class post",
    val likes: Likes,
    val reposts: Reposts,
    val postSource: PostSource,
    val geo: Geo?,
    val singerId: Int,
    val copyHistory: Array<String>? = null,
    val canPin: Boolean = false,
    val canDelete: Boolean = false,
    val canEdit: Boolean = false,
    val isPinned: Boolean = false,
    val markedAsAds: Boolean = false,
    val isFavourite: Boolean = false,
    val attachments: Array<Attachment>? = emptyArray()
)