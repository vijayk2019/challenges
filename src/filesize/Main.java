package filesize;

import java.io.*;

public class Main {
	public static void main(String[] args) {
		String path = args[0];
		File file_input = new File(path);
		System.out.println(file_input.length());
	}
}