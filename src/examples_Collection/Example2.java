package examples_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{ // to give power to class 
	int age;
	String name;
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student that) {
		// TODO Auto-generated method stub
		if(this.age>that.age) {
			return 1;
		}
		return -1;
	}
	
	
	
}
public class Example2 {
	public static void main(String[] args) {
		/**Comparator<Student> com=new Comparator<Student>() {
			public int compare(Student i,Student j) {
				if(i.age>j.age) return 1;
				else return -1;
			}
		};
		List<Student> studs=new ArrayList<Student>();
		studs.add(new Student(20,"Pranay"));
		studs.add(new Student(22,"Smilely"));
		studs.add(new Student(19,"Ammu"));
		studs.add(new Student(17,"Vinnay"));
		Collections.sort(studs,com);
		**/
		List<Student> studs=new ArrayList<Student>();
		studs.add(new Student(20,"Pranay"));
		studs.add(new Student(22,"Smilely"));
		studs.add(new Student(19,"Ammu"));
		studs.add(new Student(17,"Vinnay"));
		//Comparator<Student> com=(i,j)->i.age>j.age?1:-1;
		Collections.sort(studs);
		for(Student x:studs) {
			System.out.println(x);
		}
	}
}
