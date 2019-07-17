package calcEngineV2;

public class calcEngineV2 {

    public static void main(String[] args) {
    	double[] valLeft = {100.0d, 25.0d, 225.0d, 11.0d};
    	double[] valRight = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] result = new double[opCodes.length]; 
        
        for(int i = 0; i < opCodes.length; i++) {
        	switch (opCodes[i]) {
			case 'a':
				result[i] = valLeft[i] + valRight[i];
				break;
			case 's':
				result[i] = valLeft[i] - valRight[i];
				break;
			case 'd':
				result[i] = valLeft[i] / valRight[i];
				break;
			case 'm':
				result[i] = valLeft[i] * valRight[i];
				break;
			default:
				System.out.println(" b³¹d - niew³aœciwy rozkaz operacji! ");
				result[i] = 0.0d;
				break;
			}
           }
        
        for (double  wynik : result) {
        	System.out.print("wynik = ");
			System.out.println(wynik);
		}
        
	// write your code here
    }
}
