package org.ncu.greeting_app;

public class FrenchFortuneService implements FortuneService{

	public void fortune(String name) {
		System.out.println("passe une bonne journee "+ name);
	}

}
