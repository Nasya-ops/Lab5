package oper;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class MathOperation {

	public int sum(@WebParam(name = "a")int a,@WebParam(name = "b")int b) {
		int result = a+b;
		return result;
		
	}
}
