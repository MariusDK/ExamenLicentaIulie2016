import java.util.ArrayList;

/**
 * Created by MariusDK on 30.06.2017.
 */
public class TablouDeObiecte {
    private Integer nrElemente;
    private ArrayList<ObiectLicitat> elem;

    public TablouDeObiecte(Integer nrElemente,ArrayList<ObiectLicitat> elem)
    {
        this.nrElemente=nrElemente;
        this.elem=elem;
    }
    public void adauga(ObiectLicitat obiectLicitat)
    {
        this.elem.add(obiectLicitat);
    }
    public ObiectLicitat elementAt(int pos)
    {
        return this.elem.get(pos);
    }
    public int getNumarElemente()
    {
        return this.elem.size();
    }
    public void sortare()
    {
        boolean ok=false;
        while (ok!=true)
        {
            ok=true;
            for (int i=1;i<elem.size();i++)
            {
                if (elem.get(i-1).getPretDePornire()<elem.get(i).getPretDePornire())
                {
                    ok=false;
                    ObiectLicitat aux=elem.get(i-1);
                    elem.set(i-1,elem.get(i));
                    elem.set(i,aux);

                }
            }
        }
    }


}
