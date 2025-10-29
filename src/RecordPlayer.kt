class RecordPlayer() {
    fun play(music: Music){
        val output: (Music) -> Unit = { it ->
            println(it.getPlayingTime())
            println(it.getAllSongs().forEach{ println(it.toString()) })
        }
        output(music)
    }
}
