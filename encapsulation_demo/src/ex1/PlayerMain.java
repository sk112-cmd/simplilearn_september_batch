package ex1;

public class PlayerMain {

	public static void main(String[] args) {
	
		Player p=new Player();
		//p.id=100;
		p.setId(1000);
		p.setName("Jay");

		p.setAge(22);
		p.setContact(1234567890L);
		System.out.println("Printing player");
		printPlayer(p);
		
		p.setAge(25);
		System.out.println("\nPrinting player again after age modification");
		
		printPlayer(p);
		
		System.out.println(p);
		System.out.println(p.toString());
		
	}
	public static void printPlayer(Player player) {
		System.out.println("Player Id : "+player.getId() );
		System.out.println("Player Name : "+player.getName() );
		System.out.println("Player Contact : "+player.getContact() );
		System.out.println("Player Age : "+player.getAge() );
	}

}
