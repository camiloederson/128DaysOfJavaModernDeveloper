package JavaCoreFoundations.day5;

import java.util.Set;

public class PlaylistManager {

    private Set<Song> songs;

    public PlaylistManager(Set<Song> songs){
        this.songs = songs;
    }

    public boolean addSong(Song song){
        return songs.add(song);
    }

    public boolean removeSong(Song song){
        return songs.remove(song);
    }

    public void showAllSongs(){
        for (Song song : songs){
            System.out.println(song.toString());
        }
    }
}
