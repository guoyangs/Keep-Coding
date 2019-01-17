package com.guoyangc.xml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class SaxParser implements XmlParse {

	@Override
	public List<Book> parseXml(String fileName) {
		// TODO Auto-generated method stub
		List<Book> list = new ArrayList<Book>();
		SAXParserFactory factory = SAXParserFactory.newInstance();
		MySaxHandler handler = null;
		try {
			SAXParser parser = factory.newSAXParser();
			InputStream fis = new FileInputStream(fileName);
			handler = new  MySaxHandler();
			parser.parse(fis, handler);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list = handler.getList();
		return list;
	}
	
	public static void main(String[] args) {
		XmlParse parser = new SaxParser();
		//List<Book> list = parser.parseXml("books.xml");同目录下读取不到.xml文件需要以下方式获得
		List<Book> list = parser.parseXml("src/com/guoyangc/xml/books.xml");
		System.out.println("Sax 解析结果:");
		for (Book book : list) {
			System.out.println(book);
		}
	}
}
