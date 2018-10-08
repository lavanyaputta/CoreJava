package com.practice.programs;

class Hello{
	
	int i=2147483647;
	
	
	
	long l=214748646l;
	float f=25.6f;
	double d=58646.4548;
	 
	
	
	
 public static void main(String[] args) {
	
	/*byte b= Byte.BYTES;
	System.out.println(b);
	
	int i=Integer.SIZE;
	int j=Integer.BYTES;
	System.out.println(i);
	System.out.println(j);
	*/
	/*int k=Integer.MAX_VALUE;
	System.out.println(k);*/
	 char ch='\u00A9';
	 System.out.println(ch);
	
	 Integer i=new Integer(4);
	 
	
	
}
	
}



class  Lavanya{
	
	int id;
	String name;
	String email;
	 
	 
	public Lavanya(int id, String name, String email) {
		super();
		this.id=  id;
		 this.name=name;
		 this.email= email;
	}
	
	 
	
	public Lavanya(int id, String name) {
		super();
		this.id=  id;
		 this.name=name;
	}
	
	

	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public static void main(String[] args) {
		Lavanya l=new Lavanya(1,"lavanya","@gmail.com");
		
	}
   

}


 