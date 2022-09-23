class Main {
  public static void main(String[] args) {
    int number = 19;
    // int remainder = number % 2;
    // System.out.println(remainder);
    boolean isPrime = true;

    if (number == 1) {
      System.out.println(number + " Asal sayı değildir.");
    }
    else if (number < 1) {
      System.out.println(number + "Geçersiz sayı girdiniz.");
    }
    for (int i = 2; i < number; i++){
      if (number % i == 0) {
        isPrime = false;
        break;
      }
    }

    if (isPrime) {
      System.out.println(number + " Asal sayıdır");
    }
    else {
      System.out.println(number + " Asal sayı değildir.");
    }
  }
}