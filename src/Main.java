public class Main {
    public static void main(String[] args){

        System.out.println("\n\nAufgabe1");
        int[] a1 = {32,42,23,17};
        // Aufgabe1 aufgabe1 = new Aufgabe1(a1);

        System.out.println("\n\nAufgabe2");
        int[] a2 = {17, 20, 87, 76, 12};
        // Aufgabe2 aufgabe2 = new Aufgabe2(a2);

        System.out.println("\n\nAufgabe3");
        int[] a3a = {3, 15, 24, 45};
        int[] a3b = {3, 15, 23};
        // Aufgabe3 aufgabe3 = new Aufgabe3(a3a, a3b);

        System.out.println("\n\nAufgabe4");
        int[] a4 = {2,3,5,7,7,19,18,35,42,17,29,789,256,328,748,798,653};
        // Aufgabe4 aufgabe4 = new Aufgabe4(a4);

        System.out.println("\n\nAufgabe5");
        // Aufgabe5 aufgabe5 = new Aufgabe5(10,1000,100);

        System.out.println("\n\nAufgabe6");
        Aufgabe6 aufgabe6 = new Aufgabe6();
        
        System.out.println("\n\nZusatzAufgabe1");
        zusatzAufgabe1(0,500,5);
      
      
        
        System.out.println("\n\nZusatzAufgabe2");
        zusatzAufgabe2a(100);
        zusatzAufgabe2b(100);
        
        System.out.println("\n\nZusatzAufgabe3");
        zusatzAufgabe3();
    }
    
  private static void zusatzAufgabe1(int start, int end, int increment){
    int[] array = new int[(end/increment)+1];
    
    for(int i = start; i*increment <= end; i++){
      array[i] = i*increment;
      }
	for(int i : array){
      System.out.println(String.format("Die aktuelle Zahl ist %s.", i));
      }
    }
  
  private static void zusatzAufgabe2a(int size){
    int[] array = new int[size];
    for(int i = 0; i < size; i++){
      array[i] = (int)(Math.random()*100);
    }
    for(int i : array){
	  System.out.println(String.format("Die aktuelle Zahl ist %s.", i));
    }
    
  }

  private static void zusatzAufgabe2b(int size){
    int[] xcoord = new int[size];
    int[] ycoord = new int[size];

    for(int i = 0; i<size; i++){
		xcoord[i] = (int)(Math.random()*100);
      	ycoord[i] = (int)(Math.random()*100);
      }
    for(int i = 0; i<size; i++){
      System.out.println(String.format("Die X-Koordinate ist %s, die Y-Koordinate ist %s", xcoord[i],ycoord[i]));
      }
  }
    
  private static void zusatzAufgabe3(){
    String[] namen = { "Tom Schmidt", "Lisa Männel", "Roland Maier"};
    Boolean[] weiblich = {false, true, false};
    int[] alter = {45, 38, 22};

    for(int i = 0; i<namen.length; i++){
      if(weiblich[i] == true) System.out.println(String.format("Frau %s ist %s Jahre alt.", namen[i], alter[i]));
      else System.out.println(String.format("Herr %s ist %s Jahre alt.", namen[i], alter[i]));
    }
  }

    
}
