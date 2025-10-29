class Album(val songs: List<Song>): Music {

    fun filterSongsByArtist(artist: String): List<Song> {
        return songs.filter { it.artist == artist }
    }

    override fun getAllSongs(): List<Song> {
        return songs
    }

    override fun getPlayingTime(): Double {
        var totalTime = 0.0
        songs.forEach{totalTime += it.playingTime}
        return totalTime
    }
}