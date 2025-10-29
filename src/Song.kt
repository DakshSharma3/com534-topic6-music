class Song(val title: String, val artist: String, val playingTime: Double){
    override fun toString(): String {
        return "Title: $title, Artist: $artist, Playing Time: $playingTime"
    }
}