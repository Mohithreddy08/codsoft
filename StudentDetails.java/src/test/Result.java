package test;
public class Result {
public String calculator(float per,boolean p) {
	if(p) {
		return "Fail";
	}
	else if(per>=70 && per<=100){
		return "Distinsion";
	}
	else if(per>=60 && per<=70){
		return "Firstclass";
	}
	else if(per>=50 && per<=60){
		return "Secondclass";
	}
	else if(per>=35 && per<=50){
		return "Thirdclass";
	}
	else {
		return "Fail";
	}
}

public String calculate(float per, boolean p) {
	// TODO Auto-generated method stub
	return null;
}
}
