package calcEngineV4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		MathEquation testujWyliczenie = new MathEquation();
//		testujWyliczenie.wykonaj();
//		System.out.print("test = ");
//		System.out.println(testujWyliczenie.getResult());

			MathEquation[] equatons = new MathEquation[4];
			equatons[0] = new MathEquation(100.0d, 50.0d, 'd');
			equatons[1] = new MathEquation(25.0d, 92.0d, 'a');
			equatons[2] = new MathEquation(225.0d, 17.0d, 's');
			equatons[3] = new MathEquation(11.0d, 3.0d, 'm');

			for (MathEquation dzialanie : equatons) {
				dzialanie.wykonaj();
				System.out.print("wynik = ");
				System.out.println(dzialanie.getResult());
				}
			}			
			
			public static MathEquation create(double leftVal, double rightVal, char opCode) {
				MathEquation equations = new MathEquation();
				equations.setLeftVal(leftVal);
				equations.setRightVal(rightVal);
				equations.setOpCode(opCode);
				
				return equations;
			}
		}


