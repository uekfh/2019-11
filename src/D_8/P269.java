package D_8;

import java.io.Serializable;

public class P269 {
	public class Person implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
private int id;
private String name;
private int age;
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
}



public Person() {
	super();
	// TODO �Զ����ɵĹ��캯�����
}



public Person(int i, String string) {
	// TODO �Զ����ɵĹ��캯�����
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

		
		
		}

	}
