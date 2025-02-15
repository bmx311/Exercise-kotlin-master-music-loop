package MusicMaster

fun main(){
    val songs:MutableList<String> = mutableListOf()
    songs.addAll(listOf("Haru", "Be a flower", "Renai Circulation",
        "Overdose", "KAMAKURA STYLE","Otonoke" ) )
//    songs.add("Haru by: Yorushika")
//    songs.add("Be a flower Ryokuoushoku Shakai")
//    songs.add("Renai Circulation by: Kana Hanazawa")
//    songs.add("Overdose by: natori)
//    songs.add("KAMAKURA STYLE by: BotchiBoromaru")
//    songs.add("Otonoke by: Creepy Nuts")

    addSong("Dramaturgy",songs)
    removeSong("Overdose",songs)
    shuffleSongs(songs)

}
//Step 3
fun playAll(playlist:List<String>) {
    for (song in playlist) {
        println("Now playing: $song")
    }
}

//Step 4
fun addSong(songTitle:String, playlist: MutableList<String>){
    playlist.add(songTitle)
}

//Step 5
fun shuffleSongs(playlist: MutableList<String>): List<String> {
    playAll(playlist.shuffled())
    return playlist.shuffled()
}

//Step 6
fun removeSong(songTitle:String,playlist: MutableList<String>){
    playlist.remove(songTitle)
}


