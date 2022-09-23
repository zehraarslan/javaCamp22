class Main {
  public static void main(String[] args) {
    double[] myList = {1.2, 3.4, 5.6, 7.8};
    double total = 0;
    double enBuyuk = myList[0];

    for (double number : myList){
      if (number > enBuyuk){
        enBuyuk = number;
      }
      total += number;
      System.out.println(number);
    }

    System.out.println("En büyük sayı : " + enBuyuk);
    System.out.println("Toplam : " + total);  
  }
}