package attachment

data class AudioAttachments(val audio: Audio) : Attachment("audio") {
    data class Audio(
        val id: Int,
        val ownerId: Int,
        val artist: String,
        val title: String,
        val duration: Int
    )
}