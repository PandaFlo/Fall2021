
public class TestLongWord {
	public static void main(String[] args){

	LongWord longWord = new LongWord();
    longWord.setBit(2);
    longWord.setBit(7);
    longWord.setBit(4);
    longWord.setBit(9);
    longWord.setBit(1);
    longWord.clearBit(3);
    longWord.toggleBit(0);
    System.out.println("Long Word 1");
    System.out.println(longWord.toString());
    
    
    LongWord longWord2 = new LongWord();
    longWord2.set(-1);
    System.out.println("Long Word 2");
    System.out.println(longWord2.toString());
    
    System.out.println();System.out.println();
    System.out.println("and         " + longWord2.and(longWord).toString());
    System.out.println("or          " + longWord2.or(longWord).toString());
    System.out.println("not         " + longWord2.not().toString());
    System.out.println("xor         " + longWord.xor(longWord2).toString());
    
    System.out.println();System.out.println();
    System.out.println("shift right " + longWord2.shiftRightLogical(2).toString());
    System.out.println("shift left  " + longWord2.shiftLeftLogical(2).toString());
    System.out.println("shift Arith " + longWord2.shiftRightArithmetic(2).toString());
    System.out.println("shift Arith " + longWord2.shiftRightArithmetic(7).toString());
    
   
    
    
    

    
}}
