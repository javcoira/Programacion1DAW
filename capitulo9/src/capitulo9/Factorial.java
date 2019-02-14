package capitulo9;

public class Factorial {

	public Factorial(){
		
	}
	
	// This is a recursive function.
    int factR(int n) {
        int result;
        if (n == 1) { //caso base
            return 1;
        }
        result = factR(n - 1) * n;
        return result;
    }
    // This is an iterative equivalent.
    int factI(int n) {
        int t, result;
        result = 1;
        for (t = 1; t <= n; t++) {
            result *= t;
        }
        return result;
    }
    
    int potenciaI (int base, int exp){
    	int resultado = 1;
    	for(int i=exp;i>=1;i--){
    		resultado*=base;
    	}
    	return resultado;
    }
    
    int potenciaR (int base, int exp){
    	int resultado;
    	if(exp==0){
    		return 1;
    	}
    	resultado = potenciaR(base, exp-1)*base;
    	return resultado;
    }
    

}
