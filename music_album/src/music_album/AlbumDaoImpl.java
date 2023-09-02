package music_album;

import java.util.ArrayList;
import java.util.List;

public class AlbumDaoImpl implements AlbumDao {
	 private List<Album> albums = new 	ArrayList<>() ;

	@Override
	public Album findByartist(String artist) {
		// TODO Auto-generated method stub
		return albums.stream().filter(f -> f.getArtist() == artist).findFirst().get();
	}

	@Override
	public List<Album> list() {
		// TODO Auto-generated method stub
		return albums;
	}
	@Override
	public void persist(Album a) {
		// TODO Auto-generated method stub
		albums.add(a);
	}

	@Override
	public Album findBytitle(String title) {
		// TODO Auto-generated method stub
		return albums.stream().filter(f -> f.getTitle() == title).findFirst().get();
	}

	@Override
	public Album findByGenre(String genre) {
		// TODO Auto-generated method stub
		return albums.stream().filter(f -> f.getGenre() == genre).findFirst().get();
	}

	@Override
	public boolean update(Album a) {
		// TODO Auto-generated method stub
		for (int i = 0; i < albums.size(); i++) {

            if (albums.get(i).getTitle().equals(a.getTitle())) {

                albums.set(i, a);

                return true;

            }

        }

        return false;
	}

	@Override
	public boolean delete(String title) throws InvalidAlbumException {
		for (int i = 0; i < albums.size(); i++) {

            if (albums.get(i).getTitle().equals(title)) {

                albums.remove(i);

                return true;

            }

        }

        throw new InvalidAlbumException("Album not found with title: " + title);

    }
}
