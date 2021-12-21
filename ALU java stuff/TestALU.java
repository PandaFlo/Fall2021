
public class TestALU {

	public static void main(String[] args){

		ALU test = new ALU();


	     LongWord longWord2 = new LongWord();
	     longWord2.set(-1);
	     System.out.println(longWord2.toString());
		
	     LongWord longWord1 = new LongWord();
	     longWord1.set(4);
	     System.out.println(longWord1.toString());
	     
     LongWord longWord3 = new LongWord();
     longWord3.set(25);
     System.out.println(longWord3.toString());
     
     LongWord longWord4 = new LongWord();
     longWord4.set(10);
     System.out.println(longWord4.toString());
    		 
     System.out.println();    System.out.println();    System.out.println();

     LongWord tester = new LongWord();
     
     //add
     tester = test.operate(011, longWord3, longWord4); 
     System.out.println(tester.toString()); 
     
     //Sub
     tester = test.operate(100, longWord3, longWord4);
     System.out.println(tester.toString());
     
     //AND
     tester = test.operate(000, longWord3, longWord4);
     System.out.println(tester.toString());
    
     //OR
     tester = test.operate(001, longWord3, longWord4);  
     System.out.println(tester.toString());
     
     //XOR
     tester = test.operate(010, longWord3, longWord4);  
     System.out.println(tester.toString());
     
     //NOT     
     tester = test.operate(010, longWord3, longWord2);  
     System.out.println(tester.toString());
     
     //SLL
     tester = test.operate(101, longWord3, longWord1);
     System.out.println(tester.toString());  
     
     //SRL
     tester = test.operate(110, longWord3, longWord1);
     System.out.println(tester.toString());
    
     //SRA
     tester = test.operate(111, longWord3, longWord1);  
     System.out.println(tester.toString());
     
}}
