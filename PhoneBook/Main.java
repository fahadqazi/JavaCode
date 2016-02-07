public class Main{
	public static void main(String[] args){
		// Person fahad = new Person("fahad", "123");

		// System.out.println(fahad.getName());
		// System.out.println(fahad.getNumber());
		// fahad.changeNumber("23423");
		// System.out.println(fahad.getNumber());

		// System.out.println(fahad);

		PhoneBook phonebook = new PhoneBook();

		phonebook.add("Fahad", "123");
		phonebook.add("Qazi", "345");
		phonebook.add("Iftikhar", "22234");

		phonebook.printAll();

		System.out.println(phonebook.searchNumber("Fahad"));
		System.out.println(phonebook.searchNumber("Kim"));
	}
}