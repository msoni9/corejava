package main.com.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BnyMellonSolution2 {

	static class Result {

		/*
		 * Complete the 'playlist' function below.
		 *
		 * The function is expected to return an INTEGER. The function accepts
		 * following parameters: 1. STRING_ARRAY songs 2. INTEGER k 3. STRING q
		 */

		public static int playlist(List<String> songs, int k, String q) {
			// Write your code here

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

			for (int i = k; i > 0; i--) {
				if (songs.get(i).equals(q)) {
					downflag = false;
					down++;
					break;
				} else {
					down++;
				}
			}
			if (downflag == true) {
				for (int i = songs.size(); i < k; i--) {
					if (songs.get(i).equals(q)) {
						down++;
						break;
					} else {
						down++;
					}
				}
			}

			if (up > down) {
				return up;
			} else if (up == down) {
				return up;
			} else {
				return down;
			}

		}

		public static void main(String[] args) throws IOException {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

			int songsCount = Integer.parseInt(bufferedReader.readLine().trim());

			@SuppressWarnings("resource")
			List<String> songs = IntStream.range(0, songsCount).mapToObj(i -> {
				try {
					return bufferedReader.readLine();
				} catch (IOException ex) {
					throw new RuntimeException(ex);
				}
			}).collect(Collectors.toList());

			int k = Integer.parseInt(bufferedReader.readLine().trim());

			String q = bufferedReader.readLine();

			int result = Result.playlist(songs, k, q);

			bufferedWriter.write(String.valueOf(result));
			bufferedWriter.newLine();

			bufferedReader.close();
			bufferedWriter.close();
		}

	}
}
