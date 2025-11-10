package JavaCoreFoundations.day5;

import java.util.HashSet;
import java.util.Set;

public class PlaylistDemo {
    public static void main(String[] args) {
        Set<Song> songs = new HashSet<>();

        PlaylistManager playlistManager = new PlaylistManager(songs);

        Song song1 = new Song(1L, "Hello", "Adele", "Pop", 210);
        Song song2 = new Song(2L, "Fix You", "Coldplay", "Rock", 260);
        Song song3 = new Song(3L, "Clarity", "Zedd", "EDM", 200);
        Song song4 = new Song(4L, "Hello", "Adele", "Pop", 210); // 👈 mismo título y artista que song1
        Song song5 = new Song(5L, "Adventure of a Lifetime", "Coldplay", "Rock", 250);

        playlistManager.addSong(song1);
        playlistManager.addSong(song2);
        playlistManager.addSong(song3);
        playlistManager.addSong(song4);
        playlistManager.addSong(song5);

        playlistManager.showAllSongs();
    }
}
