public class Años{
  public static void main(String [] args){

      for(int m = 1; m <= 12; m++){
              String dia = "viernes";
              String año = "2021";

              if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {

                  for (int d1 = 1; d1 <= 31; d1++) {
                      System.out.println(d1 + "/" + m + "/" + año);
                  }

              }
              if (m == 2) {
                  for (int d2 = 1; d2 < 29; d2++) {

                      System.out.println(d2 + "/" + m + "/" + año);
                  }
              }
              if (m == 4 || m == 6 || m == 9 || m == 11) {
                  for (int d3 = 1; d3 <= 30; d3++) {
                      System.out.println(d3 + "/" + m + "/" + año);
                  }


              }

     }

  }
}
