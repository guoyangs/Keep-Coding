package com.guoyangc.readerwriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("e:\\sherlock.txt");
		FileWriter fw = new FileWriter("e:\\sherlock1.txt");
		char[] buf = new char[100];
		int len = 0;
		while((len = fr.read(buf)) != -1) {
			fw.write(buf, 0, len);
			fw.flush();
		}
		fr.close();
		fw.close();
	}

}
