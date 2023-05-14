package datastructs.arraylist;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("David");
		list.add("Sole");
		list.add("Male");
		System.out.println(list.get(0)); // David
		System.out.println(list.get(2)); // Male
		System.out.println(list.get(1)); // Sole
		try {
			list.get(3);
			System.out.println("IOOB exception not thrown!!");			
		} catch (IndexOutOfBoundsException e) {
			System.out.println("IOOB exception");
		}
		list.remove(0);
		System.out.println(list.get(0)); // Sole
		list.remove("Male");
		System.out.println(list.size()); // 1
	}
}
