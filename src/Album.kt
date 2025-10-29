class Album(val songs: List<Song>) {

    fun filterSongsByArtist(artist: String): List<Song> {
        return songs.filter { it.artist == artist }
    }
}