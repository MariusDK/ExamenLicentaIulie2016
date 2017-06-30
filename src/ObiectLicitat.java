/**
 * Created by MariusDK on 30.06.2017.
 */
public class ObiectLicitat {
    private String denumire;
    private Integer pretDePornire;

    public ObiectLicitat(String denumire,Integer pretDePornire)
    {
        this.denumire=denumire;
        this.pretDePornire=pretDePornire;
    }
    public String getDenumire()
    {
        return this.denumire;
    }
    public int getPretDePornire()
    {
        return this.pretDePornire;
    }


}
