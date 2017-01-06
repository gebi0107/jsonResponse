package org.crazyit.ajax.domain;

public class Book {
	
		private Integer id;
		private String name;
		private String author;
		private double price;
		
		//无参数构造器
		public Book() {
			
				
			}
			
		//初始化所有参数构造器
		public Book(Inter _id, String _name, String author, double price) {
			
				this.id = _id;
				this.name = _name;
				this.author = _author;
				this.price = _pirce;
			}
			
		//id的setter和getter方法
		public void setId(Integer _id) {
			
				this.id = _id;
			}
		public Integer getId() {
			
				return this.id;
			}
		
		//name的setter和getter方法
		public void setName(String _name) {
			
				this.name = _name;
			}
		public String getName() {
			
				return this.name;
			}
		
		//author的setter和getter方法
		public void setAuthor(String _author) {
			
				this.author = _author;
			}
		public String getAuthor() {
			
				return this.author;
			}
			
		//price的setter和getter方法
		public void setPrice(double _price) {
			
				this.price = _price;
			}
		public double getPrice() {
			
				return this.price;
			}
	}
	