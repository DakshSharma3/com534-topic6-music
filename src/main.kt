fun main() {
    val songs = listOf<Song>(
        Song("Teddy Picker", "Arctic Monkeys", 2.15),
        Song("Call it fate, call it karma", "The Strokes", 3.50),
        Song("The winner takes it all", "ABBA", 4.00)
    )
    val titles = listOf<Music>(Album(songs), Single(songs[0], songs[1]))

    titles.forEach { it ->
        println(it.getPlayingTime())
        println(it.getAllSongs().forEach{ println(it.toString()) })}

    val recordPlayer = RecordPlayer()
    recordPlayer.play(titles[0])
    }

