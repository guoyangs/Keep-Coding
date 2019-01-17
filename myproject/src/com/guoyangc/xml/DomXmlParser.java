package com.guoyangc.xml;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomXmlParser implements XmlParse {

	@Override
	public List<Book> parseXml(String fileName) {
			List<Book> list = new ArrayList<Book>();
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			Node rootNode = null;
			try {
				DocumentBuilder builder = factory.newDocumentBuilder();
				rootNode = (Node) builder.parse(new File(fileName)).getDocumentElement();
			} catch (ParserConfigurationException e) {
				e.printStackTrace();
			} catch (SAXException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			//获得<book>元素列表
			NodeList bookElementList = rootNode.getChildNodes();
			for (int i = 0; i < bookElementList.getLength(); i++) {
				Node bookElement = (Node) bookElementList.item(i);
				if (bookElement.getNodeName().equals("book")) {
					Book book = new Book();
					NamedNodeMap map = bookElement.getAttributes();
					Node bookIdNode = (Node) map.getNamedItem("bookid");
					String bookIdString = bookIdNode.getNodeValue();
					book.setBookid(bookIdString.trim());
					NodeList subBookElementList = bookElement.getChildNodes();
					for (int j = 0; j < subBookElementList.getLength(); j++) {
						Node subElementNode =(Node) subBookElementList.item(i);
						String subElementNameString = subElementNode.getNodeName();
						if (subElementNameString.equals("title")) {
							book.setTitle(subElementNode.getTextContent().trim());
						}
						if (subElementNameString.equals("author")) {
							book.setAuthor(subElementNode.getTextContent().trim());
						}
						if (subElementNameString.equals("price")) {
							book.setPrice(Double.parseDouble(subElementNode.getTextContent().trim()));
						}
					}
					list.add(book);
				}
			}
			return list;
	}
	
	public static void main(String[] args) {
		DomXmlParser dxp = new DomXmlParser();
		List<Book> list = dxp.parseXml("src/com/guoyangc/xml/books.xml");
		System.out.println("Dom 解析");
		for (Book book : list) {
			System.out.println(book);
		}
	}
}
