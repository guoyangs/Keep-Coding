package com.guoyangc.readerwriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriterDemo {

	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("e:\\sherlock.txt");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("e:\\guoguo.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String line = null;
		while((line = br.readLine()) != null) {
			bw.write(line);
			//bw.flush();
		}
		br.close();
		bw.close();
	}

}
