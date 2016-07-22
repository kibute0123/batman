package sdt.demo.exception;

import java.util.HashMap;

public class DemoException {

	public static void main(String[] args) {

		HashMap<String, Double> hm = new HashMap<>();
		hm.put("1001", 500.50);
		hm.put("1002", 1203.3);
		hm.put("1003", 522.22);

		for (String key : hm.keySet()) {
			System.out.println("ID: " + key + " - Price : " + hm.get(key));
		}

		System.out.println("---------------------------------------");

		try {
			getProduct(hm, "1003");
		} catch (NoSuchProductException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	private static void getProduct(HashMap<String, Double> hm, String id)
			throws NoSuchProductException {
		int flag = 0;
		for (String key : hm.keySet()) {
			// System.out.println(key);
			if (key.equals(id)) {
				System.out.println("ID: " + id + " - Price: " + hm.get(id));
				flag = 1;
			}
		}

		if (flag == 0) {
			throw new NoSuchProductException("Khong tim thay price cua " + id);
		}

	}
}
