package vectorExercises;

public class Guest {
	public String name;
	public String email;
	public int room;
	
	public Guest(String name, String email, int room) {
		this.name = name;
		this.email = email;
		this.room = room;
	}

	@Override
	public String toString() {
		return room + ": " + name + ", " + email;
	}
	
}
