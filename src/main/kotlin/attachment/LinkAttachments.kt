package attachment

class LinkAttachments(val link: Link) : Attachment("Link") {
    data class Link(
        val url: String,
        val title: String,
        val caption: String,
        val description: String,
        val photo: PhotoAttachments.Photo
    )
}
