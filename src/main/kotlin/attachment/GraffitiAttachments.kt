package attachment

class GraffitiAttachments(val graffiti: Graffiti) : Attachment("Graffiti") {
    data class Graffiti(
        val id: Int,
        val ownerId: Int,
        val photo130: String,
        val photo604: String
    )
}