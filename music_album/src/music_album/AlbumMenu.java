package music_album;

import java.util.Scanner;

public class AlbumMenu {
	static AlbumDaoImpl dao = new AlbumDaoImpl();


	public static void main(String[] args) throws InvalidAlbumException {

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Main menu: ");
			System.out.println(
					"1- Add album \n2- Find Album By title\n3- Find album by genre \n 4- Find Album by artist \n 5- List album \n6- Delete Album");
			System.out.println("Enter choice: ");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				add();
				break;
			case 2:
				findbytitle();
				break;
			case 3:
				findbyartist();
				break;
			case 4:
				findbygenre();
				break;
			case 5:
				listAlbums();
				break;
			case 6:
				delAlbums();
				break;
			case 7:
				System.out.println("EXIT");
				System.exit(0);
			default:
				System.out.println("Invalid option");
			}
		}
	}

	private static void findbygenre() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Album  Genre: ");
		String genre = sc.next();
		System.out.println(dao.findByGenre(genre));
	}

	private static void findbytitle() throws InvalidAlbumException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Album  Title: ");
		String title = sc.next();
		System.out.println(dao.findBytitle(title));
	}

	private static void findbyartist() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Album  Artist: ");
		String artist = sc.next();
		System.out.println(dao.findByartist(artist));
	}

	private static void delAlbums() throws InvalidAlbumException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Album title: ");
		String title = sc.next();
		dao.delete(title);
		// sc.close();
		System.out.println(title + "Title is deleted");

	}

	private static void listAlbums() {
		// TODO Auto-generated method stub
		dao.list().forEach(System.out::println);
	}

	private static void add() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Album Title: ");
		String title = sc.next();
		System.out.println("Enter Album Artist: ");
		String artist = sc.next();
		System.out.println("Enter Album Genre: ");
		String genre = sc.next();
		Album a = new Album(title, artist, genre);
		dao.persist(a);
	}
}
