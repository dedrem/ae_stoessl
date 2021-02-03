public class Main {


    public static void main(String[] args){
        System.out.println("Aufgabe 0");

        String p = checkPermission(18, false, true) == true ? "die" : "keine";
        System.out.println(String.format("Der Mitarbeiter erhält %s Erlaubnis",p));

        System.out.println("\n\nAufgabe 2");
        Aufgabe2 aufgabe2 = new Aufgabe2(4,9);

        System.out.println("\n\nAufgabe 3");
        Aufgabe3 aufgabe31 = new Aufgabe3(17,false);
        Aufgabe3 aufgabe32 = new Aufgabe3(21,true);

        System.out.println("\n\nAufgabe 4");
        int a[] = {222,293849,287263738,333333,74958302,94730209,9484930};
        Aufgabe4 aufgabe4 = new Aufgabe4(a);

        System.out.println("\n\nAufgabe 5");
        Aufgabe5 aufgabe51 = new Aufgabe5(6);
        Aufgabe5 aufgabe52 = new Aufgabe5(7);
        Aufgabe5 aufgabe53 = new Aufgabe5(9);
        Aufgabe5 aufgabe54 = new Aufgabe5(12);
    }

    public static boolean checkPermission(int age, boolean supervisor, boolean employee){
        if(employee == false) return false;
        else if(age >= 18) return true;
        else if(supervisor == true) return true;
        else return false;
    }
}
