package org.ncu.greeting_app;

public class MainApp 
{
    public static void main( String[] args )
    {
//    	EnglishGreetingService eng = new EnglishGreetingService();
//    	eng.greet("Adi");
//    	
//    	FrenchGreetingService fre = new FrenchGreetingService();
//    	fre.greet("Adi");
//    	
//    	SpanishGreetingService spa = new SpanishGreetingService();
//    	spa.greet("Adi");
    	
    	FactoryGreetingService factory = new FactoryGreetingService();
    	GreetingService service = factory.greeting("fre");
    	
    	FactoryFortuneService factory1 = new FactoryFortuneService();
    	FortuneService fortune = factory1.fortune("fre");
    	
    	service.greet("Adi");
    	fortune.fortune("Adi");
    }
}
