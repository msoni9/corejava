package main.com.java;

import java.util.ArrayList;
import java.util.List;

public class MainC {
	public static int result(List<String> songs, int k, String q) {

		int up = 0;
		int down = 0;
		boolean upflag = true;
		boolean downflag = true;
		for (int i = k + 1; i < songs.size(); i++) {
			if (songs.get(i).equals(q)) {
				upflag = false;
				up++;
				break;
			} else {
				up++;
			}
		}
		if (upflag == true) {
			for (int i = 0; i < k; i++) {
				if (songs.get(i).equals(q)) {
					up++;
					break;
				} else {
					up++;
				}
			}
		}

		for (int i = k - 1; i >= 0; i--) {
			if (songs.get(i).equals(q)) {
				downflag = false;
				down++;
				break;
			} else {
				down++;
			}
		}
		if (downflag == true) {
			for (int i = songs.size() - 1; i > k; i--) {
				if (songs.get(i).equals(q)) {
					down++;
					break;
				} else {
					down++;
				}
			}
		}

		if (up > down) {
			return down;
		} else if (up == down) {
			return up;
		} else {
			return up;
		}

	}

	public static void main(String args[]) {
		List<String> listStr = new ArrayList<>();
		listStr.add("MyNameIsla");
		listStr.add("hello");
		listStr.add("AJIO");
		listStr.add("kdfkfk");
		System.out.println(result(listStr, 1, "kdfkfk"));
	}

}
