/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esfera;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Sistemas
 */
@WebService(serviceName = "VolumenEsfera")
public class VolumenEsfera {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "Volumen")
    public Double Volumen(@WebParam(name = "radio") Double radio) {
        return (4.0/3.0) * (Math.PI) * (Math.pow(radio, 3));
    }
}
