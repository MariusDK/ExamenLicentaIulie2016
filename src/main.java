import java.util.ArrayList;

/**
 * Created by MariusDK on 30.06.2017.
 */
public class main {
    public static void main(String[] arg)
    {
        main m=new main();
        TablouDeObiecte tablouDeObiecte=m.init();
        tablouDeObiecte.sortare();
        for (int i=0;i<tablouDeObiecte.getNumarElemente();i++)
        {
            System.out.println(tablouDeObiecte.elementAt(i).getDenumire()+" "+tablouDeObiecte.elementAt(i).getPretDePornire());
        }
    }
    public TablouDeObiecte init()
    {
        ArrayList<ObiectLicitat> list=new ArrayList<>();
        ObiectLicitat ol1=new ObiectLicitat("Laptop",1000);
        ObiectLicitat ol2=new ObiectLicitat("casti",200);
        ObiectLicitat ol3=new ObiectLicitat("masina",8000);

        TablouDeObiecte tablouDeObiecte=new TablouDeObiecte(list.size(),list);
        tablouDeObiecte.adauga(ol1);
        tablouDeObiecte.adauga(ol2);
        tablouDeObiecte.adauga(ol3);
        return tablouDeObiecte;
    }
}
