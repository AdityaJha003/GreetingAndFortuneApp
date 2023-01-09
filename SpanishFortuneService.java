package org.ncu.greeting_app;

public class SpanishFortuneService implements FortuneService{

	public void fortune(String name) {
		System.out.println("que tengas un buen dia "+ name);
	}

}
