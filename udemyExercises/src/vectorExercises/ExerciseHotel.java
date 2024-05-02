package vectorExercises;

import java.util.Scanner;

public class ExerciseHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many rooms will be rented?");
		int rooms = scanner.nextInt();
		
		Guest[] guest = new Guest[9];
		
		for(int i = 0; i<rooms; i++) {
			
			scanner.nextLine();
			System.out.println("Rent #" + (i + 1));
			System.out.print("Name:");
			String name = scanner.nextLine();
			System.out.print("Email:");
			String email = scanner.nextLine();
			System.out.print("Room:");
			int room = scanner.nextInt();
			
			guest[room] = new Guest(name,email,room);
		}
		
		System.out.println("Busy rooms:");
		for(int i = 0; i<guest.length; i++) {
			if(guest[i] != null) {
				System.out.println(guest[i]);
			}
		}
		scanner.close();
	}

}
