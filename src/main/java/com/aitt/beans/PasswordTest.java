package com.aitt.beans;

import com.ait.beans.PasswordUtils;

public class PasswordTest {

	public static void main(String[] args) {

		PasswordUtils pwdd = new PasswordUtils();// this is comin frm another class
		String encodePwd = pwdd.encodePwd("satya123");
		System.out.println(encodePwd);
	}

}
