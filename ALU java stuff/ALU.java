
public class ALU {

	private boolean ZF = false;
	private boolean NF = false;
	private boolean CF = false;
	private boolean OF = false;
	
	private LongWord rippleCarryAdd(LongWord a, LongWord b,
			boolean cin) {
			String aS = a.toString().substring(0,40).replaceAll(" ", "");
			String bS = b.toString().substring(0,40).replaceAll(" ", "");
			String resultS = "";
			if(cin) {
				String comp = "";
		        for(int i = 0; bS.length() > i; i++) {
		            comp += (bS.charAt(i) == '1')? '0':'1';
		            }
		       // System.out.println(comp);
		        bS = comp;
		        CF = true;
		        }


		        for(int i = aS.length()-1; i >=0; --i) {
		            resultS = String.format("%c%s",addBits(aS.charAt(i),bS.charAt(i)),resultS );
		            //System.out.println(resultS);
		        }

		        if(CF == true) {
		            CF =false;
		            resultS = String.format("%c%s",addBits(resultS.charAt(0),'1'),resultS );
		            //System.out.println(resultS);
		        }

		        //System.out.print(resultS);
		        if(aS.charAt(0) == bS.charAt(0)) {// both are postive or negative
		            if(resultS.length()  <= aS.length() || resultS.charAt(0) !=  bS.charAt(0)) { //if string is longer/not postive
		                OF = true; //set off overflow flag
		            }
		        }
		        //System.out.println("\n" + OF);
		        if(resultS.length() > aS.length()) {
		            resultS = resultS.substring(resultS.length()-aS.length());
		        }

			LongWord longWordA = new LongWord();
		    longWordA.set(twosCompParseInt(resultS));
			return longWordA;
}
	

	
	 public int twosCompParseInt(String s) {
		 int res = (s.charAt(0) == '1')? Integer.MIN_VALUE:0;//integer has min of -2^31
	        for(int i = 1; i < s.length(); ++i) {
	            res += (s.charAt(i) == '1')? (int)(Math.pow(2,s.length()-i-1)):0;
	        }
	        return res;
	    }
	 
	  public char addBits (char b1, char b2) {
	        char res; 
	        //System.out.printf("%c + %c %b ",b1,b2,CF);
	        if(b1 == '1' && b2 == '1') {
	            res = (CF)?'1':'0';// if CF is true res is 1 or res is 0
	            CF = true; //CF is true as there will always be 
	            return res;
	        }
	        else if(b1 == '1' || b2 == '1'){
	            return (CF)?'0':'1';
	        }
	        else {
	            res = (CF)?'1' : '0';
	            CF = false;
	            return res;
	        }
	    }
//}
	
	 public LongWord operate(int code, LongWord op1, LongWord op2) {
		 switch(code) {
		 
		 case 000:
			 //and
			 //code stuff
			return op1.and(op2);
			 
		 case 001:
			 //or
			 //code stuff
			 return op1.or(op2);
			 
		 case 010:
			 
			 if(op2.getSigned() == -1) {
				 return op1.not();
			 }
			 //
			 return op1.xor(op2);
			 //not
			// return op1.not();
			 //code stuff
			 
			
		 case 011:
			 //add
			 //code stuff
			 return rippleCarryAdd(op1,op2,false);
			
		 case 100:
			 //subtract
			 //code stuff
			 return rippleCarryAdd(op1,op2,true);
		
		 case 101:
			 //SLL
			 //code stuff
			 return op1.shiftLeftLogical(op2.getSigned());

		 case 110:
			 //SRL
			 //code stuff
			 return op1.shiftRightLogical(op2.getSigned());

		 case 111:
			 //SRA
			 //code stuff 
			 return op1.shiftRightArithmetic(op2.getSigned());
		default:
			return op1;
		 }
		 
	}
	
	
}