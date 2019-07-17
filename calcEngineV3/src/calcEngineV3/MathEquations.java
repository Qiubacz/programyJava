package calcEngineV3;

public class MathEquations {

		  private double valLeft;
	      private double valRight;
	      private double result;
	      private char opCode;
	     
	      public double getLeftVal() {
			return valLeft;
		}
	      
	      public void setLeftVal(double leftVal) {
			this.valLeft = leftVal;
		}
	      
	      public double getRightVal() {
			return valLeft;
		}
	      
	      public void setRightVal(double leftVal) {
			this.valRight = leftVal;
		}
	      
	      public char getOpCode() {
			return opCode;
		}
	      
	      public void setOpCode(char opCode) {
			this.opCode = opCode;
		}
	          
	      public double getResult() {
			return result;
		}
	      
	      public void wykonaj() {
	    		switch (opCode) {
				case 'a':
					result = valLeft + valRight;
					break;
				case 's':
					result = valLeft - valRight;
					break;
				case 'd':
					result = valLeft / valRight;
					break;
				case 'm':
					result = valLeft * valRight;
					break;
				default:
					System.out.println(" b��d - niew�a�ciwy rozkaz operacji! ");
					result = 0.0d;
					break;
				}
	    		
	     //   System.out.println(" Tw�j wynik to " + result);
		// write your code here
	      }
	    }