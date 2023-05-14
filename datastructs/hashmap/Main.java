package datastructs.hashmap;

public class Main {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("David", 51);
		map.put("Sole", 44);
		map.put("Manu", 18);
		System.out.println(map.get("David")); // 51
		System.out.println(map.get("Manu")); // 18
		System.out.println(map.get("Male")); // null
		System.out.println(map.get("Sole")); // 44
		map.remove("Sole");
		System.out.println(map.get("Sole")); // null
	}
}
