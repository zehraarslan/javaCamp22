class Main {
  public static void main(String[] args) {
    int sayi1 = 15;
    int sayi2 = 24;
    int sayi3 = 8;
    int enBuyuk;

    enBuyuk = sayi1;
    if (sayi2 > enBuyuk) {
      enBuyuk = sayi2;
    } else if (sayi3 > enBuyuk) {
      enBuyuk = sayi3;
    }

    System.out.println("En büyük sayı : " + enBuyuk);
  }
}