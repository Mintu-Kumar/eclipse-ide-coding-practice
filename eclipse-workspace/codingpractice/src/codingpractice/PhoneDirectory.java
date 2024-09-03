package codingpractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneDirectory {
	
	
	public static void main(String[] args) {
		
		
		Set<Contact> set = new HashSet<>();
		
		Contact  contact =  new Contact();
		contact.setNum(1234);
		contact.setName("Mintu");
		
		Contact  contact1 =  new Contact();
		contact1.setNum(12345);
		contact1.setName("Amit");
		
		set.add(contact);
		set.add(contact1);
		
		Set<Contact> newSet = new HashSet<>();
		
		
		Contact  contact2 =  new Contact();
		contact2.setNum(1234);
		contact2.setName("Mintu");
		
		Contact  contact3 =  new Contact();
		contact3.setNum(123467);
		contact3.setName("Rahul");
		
		Contact  contact4 =  new Contact();
		contact4.setNum(1);
		contact4.setName("Raj");
		
		
		newSet.add(contact4);
		newSet.add(contact3);
		newSet.add(contact2);
		
		Set<Contact> newSet1 = new HashSet<>(newSet);
		for(Contact s:newSet)
		{
			String name = s.getName();
			for(Contact p: set)
			{
				if(!(p.getName().equals(name)))
				{
					System.out.println(""+p.getName().equals(name)+p.getName()+name);
					newSet1.add(p);
				}
					
			}
		}
		//newSet.retainAll(set);
		
		System.out.println(newSet1);
		
		
		
		
		
	}

}




class Contact
{
	
	private int num;
	private String name;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Contact(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Contact [num=" + num + ", name=" + name + "]";
	}
	
	
	
	
	
}

