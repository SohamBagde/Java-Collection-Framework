package Set_Interface.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Movie {
    String name;
    String director;
    int earning;
    public Movie(String name,String director,int earning) {
        this.name = name;
        this.director = director;
        this.earning = earning;
    }
}

class Work {
    public static void main(String[] args) {
        HashSet<Movie> set = new HashSet<Movie>();
        Movie movie1 = new Movie("titanic","andrew",12000);
        Movie movie2 = new Movie("walk","peter",1550);
        Movie movie3 = new Movie("craft","dawid",17700);

        set.add(movie1);
        set.add(movie2);
        set.add(movie3);

       // for(Movie m : set) {
        // System.out.println(m.name + " " +m.director + " " +m.earning);
       // }

        Iterator it = set.iterator();
        while (it.hasNext()) {
            Movie m = (Movie)it.next();
            System.out.println(m.name + " " +m.director + " " +m.earning);
        }
    }
}
