package exercise1;

public class ExceptionThrower {
	void throwACustomExceptionWhenValueIs42(int value) {
	if(value == 42)
		//System.out.println("La valeur vaut 42!!");
		throw new Value42();
		//System.out.println("Traitement ok");
	}
}
