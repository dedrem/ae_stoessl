public class Main {
    public static void main(String[] args){
        System.out.println("Hallo EIT10C");


        String p = checkPermission(18, false, true) == true ? "die" : "keine";
        System.out.println(String.format("Der Mitarbeiter erhält %s Erlaubnis",p));
    }

    public static boolean checkPermission(int age, boolean supervisor, boolean employee){
        if(employee == false) return false;
        else if(age >= 18) return true;
        else if(supervisor == true) return true;
        else return false;
    }
}
