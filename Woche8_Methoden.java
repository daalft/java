public class Woche8_Methoden {
  public static void main(String[] args) {
    System.out.println(umfang(5));
    System.out.println(umfang(3,6));
    // folgendes geht nicht:
    // System.out.println(umfang());
    // System.out.println(umfang(1,2,3));
    // System.out.println(umfang("string"));
    keineRueckgabe("haha");
    // keineRueckgabe(12);
    ArrayList<String> l = getArrayList();
    // calculate(3,13);
  }

  // Umfang eines Quadrates
  // x = Seitenlänge
  private static int umfang (int x) {
    return 4*x;
  }
  
  // Umfang eines Rechteckes
  // x,y = Seitenlängen
  private static int umfang (int x, int y) {
    return 2*x + 2*y;
  }
  
  public static void keineRueckgabe (String s) {
    // kein 'return' erforderlich, da der Rückgabetyp 'void' ist
  }
  
  public static ArrayList<String> getArrayList () {
    ArrayList<String> list = new ArrayList<String>();
    list.add("something");
    return list;
  }
  
  // keine statische Methode
  // Rückgabetyp ist nicht an Parametertyp gebunden
  public String calculate (int i, int j) {
    int r = i + 3*j;
    if (i == 42) {
      return "die Antwort auf alles";
    }
    return "keine Antwort";
  }
}
