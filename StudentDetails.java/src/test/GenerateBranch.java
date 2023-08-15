package test;
public class GenerateBranch {
public String generate(String brcode) {
	return switch(brcode) {
	case"05":yield "CSE";
	case"04":yield "ECE";
	case"02":yield "EEE";
	default:yield null;
	};
}
}
