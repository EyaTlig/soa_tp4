package Service;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;

@WebService
public class CalculWS {
    @WebMethod
    public double somme(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        return a + b;
    }
}


