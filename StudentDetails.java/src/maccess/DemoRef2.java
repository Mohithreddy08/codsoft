package maccess;
import java.util.*;
import test.*;
public class DemoRef2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Address ad = new Address();
		contact c = new contact();
		Result r = new Result();
		Student stu = new Student(ad,c,r);
		ReadInput ob1 = new ReadInput();
		ob1.read(s, stu);
		DisplayOutput ob2 = new DisplayOutput();
		ob2.dis(stu);
		s.close();
}
}