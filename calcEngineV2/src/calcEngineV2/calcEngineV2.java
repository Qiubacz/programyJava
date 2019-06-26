package calcEngineV2;

public class calcEngineV2 {

    public static void main(String[] args) {
        double val1 = 100.0d, val2 = 50.0d, result;
        char opCode = 'm';
        
        if(opCode == 'a')
        	result = val1 + val2;
        else if (opCode == 's') {
        	result = val1 - val2;
		}
        else if (opCode == 'd') {
			result = ( val2 != 0) ? val1/val2 : 0.0d; 
		}
        else if (opCode == 'm') {
			result = val1 * val2;
		}
        else {
			System.out.println(" b³¹d - niew³aœciwy rozkaz operacji! ");
			result = 0.0d;
		}
        
        System.out.println(" Twój wynik to " + result);
	// write your code here
    }
}
