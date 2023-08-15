package test;

public class ReadInput {
	public void read(java.util.Scanner s,Student stu) {
        System.out.println("Enter the rollNo:");
		stu.rollno = s.nextLine();
		if(stu.rollno.length()==10)
		{
		System.out.println("Enter the StuName");
		stu.name = s.nextLine();
		System.out.println("Enter the branch:");
		stu.branch = s.nextLine().toUpperCase();
		BranchVerification bv = new BranchVerification();
		boolean k = bv.verify(stu.branch);
		if(k)
		{
		GenerateBranch gb = new GenerateBranch();
		String br = gb.generate(stu.rollno.substring(6,8));
		if(br==null)
		{
		System.out.println("Invalid brCode in rollNo..");
		}//end of if
		else
		{
		if(br.equals(stu.branch))
		{
		System.out.println("Enter the HNo:");
		stu.ad.hno=s.nextLine();
		System.out.println("Enter the SName:");
		stu.ad.sname=s.nextLine();
		System.out.println("Enter the City:");
		stu.ad.city=s.nextLine();
		System.out.println("Enter the PinCode:");
		stu.ad.pincode=Integer.parseInt(s.nextLine());
		System.out.println("Enter the MailId:");
		stu.c.mailId=s.nextLine();
		System.out.println("Enter the PhoneNo:");
		stu.c.PhoNo=s.nextLong();
		int i=1,totM=0;
		boolean p=false;
		while(i<=6)
		{
		System.out.println("Enter Marks of sub"+i);
		int sub = s.nextInt();
        if(sub<0 || sub>100)
		{
		System.out.println("Invalid Sub Marks..");
		continue;
		//skip below lines in iteration
		}
		if(sub>=0 && sub<=34)
		{
		p=true;
		}
		totM = totM+sub;
		i++;
		}//end of loop
		stu.totMarks=totM;
		stu.per = (float)stu.totMarks/6;
		stu.result =stu.r.calculate(stu.per,p);
		}//end of if
		else
		{
		System.out.println("RollNo not matched with branch ");
		}
		}
		}//end of if
		else
		{
		System.out.println("Invalid branch...");
		}
		}//end of if
		else
		{
		System.out.println("Invalid rollNo...");
		}
		}
		}

