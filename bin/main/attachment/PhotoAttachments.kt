package attachment

class PhotoAttachments(val photo: Photo) : Attachment("Photo") {
    data class Photo(
        val id: Int,
        val albumId: Int,
        val ownerId: Int,
        val userId: Int,
        val text: String
    )
}