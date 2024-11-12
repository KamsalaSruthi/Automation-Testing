package com.SocialSite.Signup;

import com.socialSite.Signup.Signup;

public class SignupTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Signup s=new Signup();
		System.out.println(s.Username("john"));
		System.out.println(s.UserSurname("Smith"));
		System.out.println(s.DOB("2022/10/10"));
		System.out.println(s.Mobilenum("7878776798"));

	}

}
