package com.guoyangc.xml;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MySaxHandler extends DefaultHandler {
	private String tag;
	private Book book;
	private List<Book> list;
	
	public List<Book> getList () {
		return list;
	}
	@Override
	public void characters(char[] arg0, int arg1, int arg2) throws SAXException {
		// TODO Auto-generated method stub
		super.characters(arg0, arg1, arg2);
		if (tag != null) {
			String string = new String(arg0,arg1,arg2).trim();
			if (tag.equals("title")) {
				book.setTitle(string);
			}
			if (tag.equals("author")) {
				book.setAuthor(string);
			}
			if (tag.equals("price")) {
				book.setPrice(Double.parseDouble(string));
			}
		}
	}

	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.endDocument();
	}

	@Override
	public void endElement(String arg0, String arg1, String arg2) throws SAXException {
		// TODO Auto-generated method stub
		super.endElement(arg0, arg1, arg2);
		if(arg2.equals("book")) {
			list.add(book);
			book = null;
		}
		tag = null;
	}

	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.startDocument();
		
		list = new ArrayList<Book>();
	}

	@Override
	public void startElement(String arg0, String arg1, String arg2, Attributes arg3) throws SAXException {
		// TODO Auto-generated method stub
		super.startElement(arg0, arg1, arg2, arg3);
		if(arg2.equals("book")) {
			book = new Book();
			String bookid = arg3.getValue("bookid");
			book.setBookid(bookid);
		}
		tag = arg2;
	}

}
