

public class Name {
	String firstName; // 이름
	String lastName; // 성

	Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	public int hashCode() {	// hashcode메소드 오버라이딩
		return firstName.hashCode() + lastName.hashCode();
	}
	
	public boolean equals(Object obj) {
		if (!(obj instanceof Name))
		return false;
		Name name = (Name) obj;
		if (firstName.equals(name.firstName) && lastName.equals(name.lastName))
		return true;
		else
		return false;
		}
}
