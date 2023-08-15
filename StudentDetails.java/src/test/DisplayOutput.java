package test;
public class DisplayOutput {
	public void dis(Student stu) {
	System.out.println("====StudentDetails===");
	System.out.println("RollNo:"+stu.rollno);
	System.out.println("Name:"+stu.name);
	System.out.println("Branch:"+stu.branch);
	System.out.println("HNO:"+stu.ad.hno);
	System.out.println("SName:"+stu.ad.sname);
	System.out.println("PinCode:"+stu.ad.pincode);
	System.out.println("MailId:"+stu.c.mailId);
	System.out.println("PhoneNo:"+stu.c.PhoNo);
	System.out.println("TotMarks:"+stu.totMarks);
	System.out.println("Per:"+stu.per);
	System.out.println("Result:"+stu.result);

	}
}
