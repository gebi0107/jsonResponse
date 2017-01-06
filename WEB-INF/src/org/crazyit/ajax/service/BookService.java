package org.crazyit.ajax.service;

import java.util.*;

import org.crazyit.ajax.domain.Book;

public class BookService
{
	// 模拟内存中数据库
	static Map<Integer , List<Book>> bookDb =
		new LinkedHashMap<>();
	static
	{
		// 初始化bookDb对象
		List<Book> list1 = new ArrayList<>();
		List<Book> list2 = new ArrayList<>();
		List<Book> list3 = new ArrayList<>();
		list1.add(new Book(1 , "疯狂Java讲义" , "李刚" , 109));
		list1.add(new Book(2 , "轻量级Java EE企业应用实战" , "李刚" , 99));
		list1.add(new Book(3 , "疯狂Android讲义" , "李刚" , 89));
		list2.add(new Book(4 , "西游记" , "吴承恩" , 23));
		list2.add(new Book(5 , "水浒" , "施耐庵" , 20));
		list3.add(new Book(6 , "乌合之众" , "古斯塔夫.勒庞" , 16));
		list3.add(new Book(7 , "不合时宜的考察" , "尼采" , 18));
		bookDb.put(1 , list1);
		bookDb.put(2 , list2);
		bookDb.put(3 , list3);
	}
	public List<Book> getBookByCategory(int categoryId)
	{
		return bookDb.get(categoryId);
	}
}
