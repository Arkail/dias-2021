public class Años{
  public static void main(String [] args){
      String dia = "jueves";
      for(int m = 1; m <= 12; m++){
              if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {

                  for (int d1 = 1; d1 <= 31; d1++) {

                      if(dia.equals("domingo")) {
                             dia = "lunes";
                      }else if(dia.equals("lunes")){
                          dia = "martes";
                      }else if(dia.equals("martes")){
                          dia = "miercoles";
                      }else if(dia.equals("miercoles")){
                          dia = "jueves";
                      }else if(dia.equals("jueves")){
                          dia = "viernes";
                      }else if(dia.equals("viernes")){
                          dia = "sabado";
                      }else if(dia.equals("sabado")){
                          dia = "domingo";
                      }
                      System.out.println(dia + " " + d1 + " de " + m + " de 2021");
                  }

              }
              if (m == 2) {
                  for (int d2 = 1; d2 < 29; d2++) {
                      if(dia.equals("domingo")) {
                          dia = "lunes";
                      }else if(dia.equals("lunes")){
                          dia = "martes";
                      }else if(dia.equals("martes")){
                          dia = "miercoles";
                      }else if(dia.equals("miercoles")){
                          dia = "jueves";
                      }else if(dia.equals("jueves")){
                          dia = "viernes";
                      }else if(dia.equals("viernes")){
                          dia = "sabado";
                      }else if(dia.equals("sabado")){
                          dia = "domingo";
                      }


                      System.out.println(dia + " " + d2 + " de " + m + " de 2021");
                  }
              }
              if (m == 4 || m == 6 || m == 9 || m == 11) {
                  for (int d3 = 1; d3 <= 30; d3++) {
                      if(dia.equals("domingo")) {
                          dia = "lunes";
                      }else if(dia.equals("lunes")){
                          dia = "martes";
                      }else if(dia.equals("martes")){
                          dia = "miercoles";
                      }else if(dia.equals("miercoles")){
                          dia = "jueves";
                      }else if(dia.equals("jueves")){
                          dia = "viernes";
                      }else if(dia.equals("viernes")){
                          dia = "sabado";
                      }else if(dia.equals("sabado")){
                          dia = "domingo";
                      }
                      System.out.println(dia + " " + d3 + " de " + m + " de 2021");
                  }


              }

     }

  }
}
