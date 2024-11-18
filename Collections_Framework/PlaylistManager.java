package Collections_Framework;

import java.util.LinkedList;

public class PlaylistManager {

	public static void main(String[] args) {
		LinkedList<String> playlist = new LinkedList<>();
		
		playlist.add("Song 1");
		playlist.add("Song 2");
		playlist.add("Song 3");
		
		System.out.println("Initial Playlist: " + playlist);
		
		playlist.addFirst("Intro Song");
		System.out.println("After song at the beginning : " + playlist);
		
		playlist.addLast("Outro Song");
		System.out.println("After song at the last : " + playlist);
		
		playlist.add(2, "Song Between");
		System.out.println("After song adding in the middle: " + playlist);
		
		playlist.remove("Song 2");
		System.out.println("After removing the song: " + playlist);
		
		System.out.println("First song in the playlist: " + playlist.get(0));
		
		System.out.println(playlist.size());
	}

}
