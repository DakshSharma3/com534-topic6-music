class RecordPlayer() {
    fun play(music: Music){
        val output: (Music) -> Unit = { it ->
            println(it.getPlayingTime())
            it.getAllSongs().forEach{ println(it) }
        }
        output(music)
    }
}
