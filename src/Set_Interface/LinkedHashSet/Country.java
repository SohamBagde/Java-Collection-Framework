package Set_Interface.LinkedHashSet;

import java.util.LinkedHashSet;

public class Country {
    String name;
    int area;
    String president;
    Country(String name,int area,String president) {
        this.name =name;
        this.area = area;
        this.president = president;
    }
}

class Work {
    public static void main(String[] args) {
        LinkedHashSet<Country> set = new LinkedHashSet<Country>();
        Country c1= new Country("aus",1234,"dawid");
        Country c2= new Country("holland",48854,"john");
        Country c3= new Country("newzealand",7859,"antony");

        set.add(c1);
        set.add(c2);
        set.add(c3);

        for(Country s : set) {
            System.out.println(s.name + " " + s.president + " " +s.area);
        }

    }
}
