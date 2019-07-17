package calcEngineV3;

public class calcEngineV3 {

	public static void main(String[] args) {
	MathEquations[] equatons = new MathEquations[4];
	equatons[0] = create(100.0d, 50.0d, 'd');
	equatons[1] = create(25.0d, 92.0d, 'a');
	equatons[2] = create(225.0d, 17.0d, 's');
	equatons[3] = create(11.0d, 3.0d, 'm');

	for (MathEquations dzialanie : equatons) {
		dzialanie.wykonaj();
		System.out.print("wynik = ");
		System.out.println(dzialanie.getResult());
		}
	}
	
	
	public static MathEquations create(double leftVal, double rightVal, char opCode) {
		MathEquations equations = new MathEquations();
		equations.setLeftVal(leftVal);
		equations.setRightVal(rightVal);
		equations.setOpCode(opCode);
		
		return equations;
	}
}

	
