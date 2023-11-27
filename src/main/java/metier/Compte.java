package metier;
import java.util.Date;

import jakarta.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    int code;
    double solde;
    @XmlTransient
    private Date datecreation;

    public Compte(int code, double solde, Date datecreation) {
        this.code = code;
        this.solde = solde;
        this.datecreation = datecreation;
    }
    public Compte() {

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDatecreation() {
        return datecreation;
    }

    public void setDatecreation(Date datecreation) {
        this.datecreation = datecreation;
    }

}
