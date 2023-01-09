package org.ncu.greeting_app;

public class EnglishFortuneService implements FortuneService{

	public void fortune(String name) {
		System.out.println("Have a good day "+ name);
	}

}
