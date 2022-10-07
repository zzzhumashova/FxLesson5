import java.lang.reflect.Array;
import java.util.*;
import java.util.Collections;
import java.util.ArrayList;


//problem1
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> colorss = new ArrayList<String>();
//        colorss.add("red");
//        colorss.add("blue");
//        colorss.add("grey");
//        colorss.add("white");
//        for (String i : colorss) {
//            System.out.println(i);
//        }
//    }
//}


//problem2
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> colorss = new ArrayList<String>();
//        colorss.add("red");
//        colorss.add("blue");
//        colorss.add("grey");
//        colorss.add("white");
//        colorss.add(0,"yellow");
//        System.out.println(colorss);
//    }
//}

//problem3
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> colorss = new ArrayList<String>();
//        colorss.add("red");
//        colorss.add("blue");
//        colorss.add("grey");
//        colorss.add("white");
//        String retreive=colorss.get(3);
//        System.out.println(retreive);
//    }
//}

//problem 4
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> colorss = new ArrayList<String>();
//        colorss.add("Purple");
//        colorss.add("Pink");
//        colorss.add("White");
//        colorss.add("Gray");
//        colorss.add("Yellow");
//        System.out.println(colorss);
//        colorss.set(2, "Black");
//        System.out.println(colorss);
//    }
//}


//problem 5
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> colorss = new ArrayList<String>();
//        colorss.add("Purple");
//        colorss.add("Pink");
//        colorss.add("White");
//        colorss.add("Gray");
//        colorss.add("Yellow");
//        colorss.remove(3);
//        System.out.println(colorss);
//    }
//}

//problem 6
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> colorss = new ArrayList<String>();
//        colorss.add("Purple");
//        colorss.add("Pink");
//        colorss.add("White");
//        colorss.add("Gray");
//        colorss.add("Yellow");
//        String color = colorss.get(0);
//        System.out.println(color);
//    }
//}

//problem 7
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> Books = new ArrayList<String>();
//        Books.add("Idi tuda gde strawno");
//        Books.add("Jane");
//        Books.add("Martin Iden");
//        Books.add("Polliana");
//        System.out.println("List1: " + Books);
//        ArrayList<String> Movies = new ArrayList<String>();
//        Movies.add("Batman");
//        Movies.add("Avengers");
//        Movies.add("Sumerki");
//        Movies.add("Ono");
//        System.out.println("List2: " + Movies);
//        Collections.copy(Books, Movies);
//        System.out.println("After copy:");
//        System.out.println("List1: " + Books);
//        System.out.println("List2: " + Movies);
//    }
//}


//bonuss
//public class Main {
//    public static void main(String[] args) {
//        List<String> girls = new ArrayList<String>();
//        girls.add("Aizhan");
//        girls.add("Ulbosh");
//        girls.add("Yukijan");
//        girls.add("Assem");
//        girls.add("Aruzhan");
//        System.out.println(girls);
//        List<String> Boys = girls.subList(1, 3);
//        System.out.println(Boys);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> ourgroup= new ArrayList<String>();
//        ourgroup.add("Zhalgas");
//        ourgroup.add("Alina");
//        ourgroup.add("Aidyn");
//        ourgroup.add("Zhomart");
//
//        ArrayList<String> ourgroup2= new ArrayList<String>();
//        ourgroup2.add("Ulbosh");
//        ourgroup2.add("Aru");
//        ArrayList<String> answer = new ArrayList<String>();
//        for (String e : ourgroup2)
//            answer.add(ourgroup.contains(e) ? "Yes" : "No");
//        System.out.println(answer);
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        ArrayList<Integer> sandar= new ArrayList<Integer>();
//        sandar.add(12);
//        sandar.add(22);
//        sandar.add(23);
//        sandar.add(55);
//        sandar.add(1);
//        for(int s: sandar){
//            System.out.println(s);
//        }
//        Collections.swap(sandar, 1, 3);
//        for(int index: sandar){
//            System.out.println(index);
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> Tamak= new ArrayList<String>();
//        Tamak.add("samsa");
//        Tamak.add("pirog");
//        Tamak.add("kartoshka");
//        Tamak.add("lapsha");
//        ArrayList<String> Sushniyak= new ArrayList<String>();
//        Sushniyak.add("cola");
//        Sushniyak.add("fanta");
//        Sushniyak.add("nektar");
//        Sushniyak.add("ai tea");
//        Sushniyak.add("fuse");
//        ArrayList<String> obshi = new ArrayList<String>();
//        obshi.addAll(Tamak);
//        obshi.addAll(Sushniyak);
//        System.out.println("New array: " + obshi);
//    }
//}
