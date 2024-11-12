package Capgemini.Training;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testcase_ex_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testcase_ex t = new testcase_ex();
		String  regex="^(.+)@(.+)$";
		String email=t.UserEmail("abc.gmail.com");
		Pattern  p= Pattern.compile(regex);
		Matcher match=p.matcher(email);
		System.out.println("is it matched?:"+match.matches());
		System.out.println(email);
		
		int pswd=t.Password(9837384);
		System.out.println(pswd);

	}

}
