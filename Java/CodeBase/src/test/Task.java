package test;

import java.util.Date;

public class Task {

	public long due;
	public String name;

	public Task(String name, long due){
		this.due = due;
		this.name = name;
	}

	public static void main(String[] args) {
		char ch = Character.forDigit(3, 10);
		System.out.println("Value is " + ch);
	}
}
