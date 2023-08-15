package test;
public class BranchVerification {
public boolean verify(String br) {
	return switch(br) {
	case"CSE":yield true;
	case"ECE":yield true;
	case"EEE":yield true;
	default:yield false;
	};
	}
}
