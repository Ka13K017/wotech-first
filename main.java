public class Main {
  public static void main(String[] args) {
   // kuni +5 raadiga, kannad super warm asju
    // +5 kuni 15 warm
    // 15 kuni 30 normal
    //30+ cooling
    double temp = 23.0;

    if (temp <= 5) {
      System.out.println("Wear super warm!");
    }
    else if (temp <= 15) {
      System.out.println("Wear warm!");
    }
    else if (temp <= 30) {
      System.out.println("Wear normal!");
    }
    else {
      System.out.println("You need cooling!");
    }
   }
 }
