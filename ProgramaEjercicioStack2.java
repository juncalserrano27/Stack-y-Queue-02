
public class ProgramaEjercicioStack2 {
	public ProgramaEjercicioStack2() {
		
	}
	public static String invertirCadena(String Cadena) {
		int MAX;
		int top;
		char []stack;
		String myNewString="";
		MAX=Cadena.length();
		stack=new char[MAX];
		stack=Cadena.toCharArray();
		MyStack uno=new MyStack(MAX);
		for(int i=MAX-1; i>=0;i--) {
		myNewString=myNewString+uno.pop(stack);}
		return myNewString;
	}
	public static String palindromo(String myString2) {
		String myString1="";
		String myNewString="";
		myString1=myString1;
		int length=myString1.length();
		String firstChar;
		String NewString="";
		char[] myChars = myString1.toCharArray();
		MyStack uno= new MyStack(length);
		for(int i=length-1; i>=0;i--) {
			myNewString=myNewString+uno.pop(myChars);
		}
		myString1=myString1.replaceAll(" ","");
		myChars = myString1.toCharArray();
		NewString=NewString.replaceAll(" ","");
		length=myString1.length();
		char[] NewNewString=NewString.toCharArray();
		for(int i=length-1;i>=0;i--) {
		 if (myChars[i]==NewNewString[i]) {
			 continue;
		 }else {
			  return "No es palindromo";
			 
		 }
		}return "Si es un palíndromo";
		
	}
	

	public static void main(String[] args) {
		System.out.println(invertirCadena("Juncal come pan"));
		System.out.println(palindromo("anita lava la tina"));
		

	}

}
