import java.util.ArrayList;

public class PhoneBook{
	private ArrayList<Person> contacts;

	public PhoneBook(){
		this.contacts = new ArrayList<Person>();
	}

	public void add(String name, String number){
		
		contacts.add(new Person (name, number));
	}

	public void printAll(){
		for (Person person: contacts){
			System.out.println(person);
		}
	}

	public String searchNumber(String name){
		for(Person person: contacts){
			if(name.equals(person.getName())){
				return person.getNumber();
			}
		}
			return "Person not founds";
		
	}
}