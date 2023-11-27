package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import metier.Compte;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService(name="banqueWS")
public class BanqueService {
    @WebMethod(operationName = "convert euro to dinar")
    public double  conversion(@WebParam(name = "montant") double montant ){
        return montant*3.36;

    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code){
        Compte c= new Compte(code,0,new Date());
        return c;
    }
    @WebMethod
    public List<Compte> getComptes(){
        List<Compte> ls = new ArrayList<Compte>(0);
        ls.add(new Compte(1,100,new Date()));
        ls.add(new Compte(2,10,new Date()));
        return ls;

    }
}
