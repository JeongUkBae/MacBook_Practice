package Practice;

import java.util.Scanner;

public class Gender {
	public void gender() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름, 주민번호 입력하세요.");
		String neme = scanner.next();
		String ssn = scanner.next();
		
		char s1 = ssn.charAt(7);
		String genderresult = "";
		
		switch (s1) {
		case '1': genderresult = "남자";	break;
		case '2': genderresult = "여자";	break;
		case '3': genderresult = "남자";	break;
		case '4': genderresult = "여자";	break;
		case '5': genderresult = "외국인";	break;
		case '6': genderresult = "외국인";	break;

		default: genderresult = "다시입력하세요.";
			break;
		}
		System.out.println(genderresult);
		
	} //area
	
} //field
