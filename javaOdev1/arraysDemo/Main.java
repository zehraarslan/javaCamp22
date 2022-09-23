class Main {
  public static void main(String[] args) {

    String ogrenci1 = "Zehra";
    String ogrenci2 = "Şeyma";
    String ogrenci3 = "Merve";
    String ogrenci4 = "Ahmet";
    System.out.println(ogrenci1);
    System.out.println(ogrenci2);
    System.out.println(ogrenci3);
    System.out.println(ogrenci4);
    System.out.println("*****************");
    
    String[] ogrenciler = new String[4];
    ogrenciler[0] = "Zehra";
    ogrenciler[1] = "Şeyma";
    ogrenciler[2] = "Merve";
    ogrenciler[3] = "Ahmet";

    for (int i = 0; i<ogrenciler.length; i++){
      System.out.println(ogrenciler[i]);
    }
    System.out.println("*****************");

    
    for (String ogr : ogrenciler){
      System.out.println(ogr);
    }
    System.out.println("*****************");
    
  }
}