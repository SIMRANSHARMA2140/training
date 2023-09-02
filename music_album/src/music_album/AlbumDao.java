package music_album;

import java.util.List;


public interface AlbumDao {
	
	 void persist(Album a);

	Album findByartist(String artist);
	Album findBytitle(String title) throws InvalidAlbumException;
	List<Album> list();
	
	Album findByGenre(String genre);
	
	boolean update(Album a);
	boolean delete(String title) throws InvalidAlbumException;
	
	
}
