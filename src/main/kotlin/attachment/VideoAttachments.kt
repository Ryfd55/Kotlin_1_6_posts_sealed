package attachment

class VideoAttachments(val video: Video) : Attachment("Video") {
    data class Video(
        val id: Int,
        val ownerId: Int,
        val title: String,
        val description: String,
        val duration: Int
    )
}
